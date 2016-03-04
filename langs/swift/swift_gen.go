package swift

import (
	"bytes"
	"fmt"
	"os"
	"path/filepath"
	"strings"
	"text/template"

	"github.com/ezbuy/tgen/langs"
	"github.com/ezbuy/tgen/tmpl"
	"github.com/samuel/go-thrift/parser"
)

const (
	SwiftTypeInt    = "Int"
	SwiftTypeInt64  = "Int64"
	SwiftTypeString = "String"
	SwiftTypeBool   = "Bool"
	SwiftTypeByte   = "Byte"
	SwiftTypeDouble = "Double"

	// other types (such as array, map, etc.) are implemented in the method 'PlainType'
)

const (
	TPL_STRUCT  = "tgen/swift/struct"
	TPL_SERVICE = "tgen/swift/serivce"
)

var typemapping = map[string]string{
	langs.ThriftTypeI16:    SwiftTypeInt,
	langs.ThriftTypeI32:    SwiftTypeInt,
	langs.ThriftTypeI64:    SwiftTypeInt64,
	langs.ThriftTypeString: SwiftTypeString,
	langs.ThriftTypeByte:   SwiftTypeByte,
	langs.ThriftTypeBool:   SwiftTypeBool,
	langs.ThriftTypeDouble: SwiftTypeDouble,
}

type SwiftGen struct {
	langs.BaseGen
}

type BaseSwift struct {
	Thrift  *parser.Thrift
	Thrifts *map[string]*parser.Thrift
}

func (this *BaseSwift) PlainType(t *parser.Type) string {
	n := t.Name

	if t, ok := typemapping[n]; ok {
		return t
	}

	switch n {
	case langs.ThriftTypeList, langs.ThriftTypeSet:
		return fmt.Sprintf("[%s]", this.PlainType(t.ValueType))
	case langs.ThriftTypeMap:
		return fmt.Sprintf("[%s: %s]", this.PlainType(t.KeyType), this.PlainType(t.ValueType))
	default:
		return this.AssembleCustomizedTypeName(t)
	}
}

func (this *BaseSwift) GetInnerType(t *parser.Type) string {
	if t.Name == langs.ThriftTypeList || t.Name == langs.ThriftTypeSet {
		return this.GetInnerType(t.ValueType)
	}

	return this.PlainType(t)
}

func (this *BaseSwift) IsBasicType(t string) bool {
	switch t {
	case SwiftTypeBool, SwiftTypeByte, SwiftTypeDouble, SwiftTypeInt, SwiftTypeInt64, SwiftTypeString:
		return true
	default:
		return false
	}
}

func (this *BaseSwift) AssembleCustomizedTypeName(t *parser.Type) string {
	if t == nil {
		return "Void"
	}

	names := strings.Split(t.Name, ".")

	// if the type is in current thrift file
	// get namespace
	// else, iterator the included thrift files
	// found the very first of thrift file
	// get its namespace
	// strip the first letter, insert the namespace at the head of the left

	if len(names) == 1 {
		// we have checked namespace earlier, so we assume it must have corresponding namespace
		ns, _ := this.Thrift.Namespaces["swift"]

		return fmt.Sprintf("%s%s", ns, t.Name[1:])
	}

	p := &parser.Parser{}

	for name, path := range this.Thrift.Includes {
		if name != names[0] {
			continue
		}

		thrifts, _, _ := p.ParseFile(path)

		for p, thrift := range thrifts {
			n := strings.Split(filepath.Base(p), ".")[0]

			if n == name {
				ns, _ := thrift.Namespaces["swift"]
				return fmt.Sprintf("%s%s", ns, names[1][1:])
			}
		}
	}

	panic(fmt.Sprintf("namespace of customized type '%s' not found\n", t.Name))
}

func (this *BaseSwift) AssembleStructName(n string) string {
	ns, _ := this.Thrift.Namespaces["swift"]
	return fmt.Sprintf("%s%s", ns, n[1:])
}

// if the property name is the keyword of swift, rename it
// but encode/decode with its origin name
func (this *BaseSwift) FilterPropertory(n string) string {
	switch n {
	case "description":
		return "desc"
	default:
		return n
	}
}

func (this *BaseSwift) ParamsJoinedByComma(args []*parser.Field) string {
	if len(args) == 0 {
		return ""
	}

	var buf bytes.Buffer

	for i, arg := range args {
		if i != 0 {
			buf.WriteString(", ")
		}

		buf.WriteString(arg.Name + ": " + this.Typecast(arg.Type, false))
	}

	return buf.String()
}

func (this *BaseSwift) AssignToDict(f *parser.Field) string {
	if f.Type.Name == "list" {
		if this.IsBasicType(this.GetInnerType(f.Type)) {
			return fmt.Sprintf("%s", this.FilterPropertory(f.Name))
		} else {
			return fmt.Sprintf("%s?.toJSON()", this.FilterPropertory(f.Name))
		}
	}

	switch f.Type.Name {
	case langs.ThriftTypeI16, langs.ThriftTypeI32, langs.ThriftTypeByte, langs.ThriftTypeString,
		langs.ThriftTypeBool, langs.ThriftTypeDouble,
		langs.ThriftTypeMap:
		return this.FilterPropertory(f.Name)
	case langs.ThriftTypeI64:
		return fmt.Sprintf("NSNumber(longLong: %s)", this.FilterPropertory(f.Name))
	default:
		return fmt.Sprintf("%s?.toJSON()", this.FilterPropertory(f.Name))
	}
}

func (this *BaseSwift) TypecastWithDefaultValue(t *parser.Type) string {
	return this.Typecast(t, true)
}

func (this *BaseSwift) TypecastWithoutDefaultValue(t *parser.Type) string {
	return this.Typecast(t, false)
}

func (this *BaseSwift) Typecast(t *parser.Type, flag bool) string {
	pt := this.PlainType(t)

	switch pt {
	case SwiftTypeInt, SwiftTypeInt64:
		if flag {
			return fmt.Sprintf("%s = 0", pt)
		}
		return pt
	case SwiftTypeByte:
		return pt
	case SwiftTypeBool:
		if flag {
			return fmt.Sprintf("%s = false", pt)
		}
		return pt
	case SwiftTypeDouble:
		if flag {
			return fmt.Sprintf("%s = 0.0", pt)
		}
		return pt
	default:
		return fmt.Sprintf("%s?", pt)
	}
}

type swiftStruct struct {
	*BaseSwift
	*parser.Struct
}

type swiftService struct {
	*BaseSwift
	*parser.Service
}

func (o *SwiftGen) Generate(output string, parsedThrift map[string]*parser.Thrift) {
	o.BaseGen.Init("swift", parsedThrift)

	if err := os.MkdirAll(output, 0755); err != nil {
		panic(fmt.Errorf("failed to create output directory %s", output))
	}

	// templates
	var structpl *template.Template
	var servicetpl *template.Template

	// key is the absoule path of thrift file
	for f, t := range parsedThrift {
		// check namespace
		if _, ok := t.Namespaces["swift"]; !ok {
			fmt.Printf("namespace of swift in file '%s' is not found\n", f)

			continue
		}

		for _, s := range t.Structs {
			if structpl == nil {
				structpl = initemplate(TPL_STRUCT, "tmpl/swift/struct.goswift")
			}

			// filename is the struct name
			name := fmt.Sprintf("%s.swift", s.Name)

			path := filepath.Join(output, name)

			data := &swiftStruct{BaseSwift: &BaseSwift{Thrift: t, Thrifts: &parsedThrift}, Struct: s}

			if err := outputfile(path, structpl, TPL_STRUCT, data); err != nil {
				panic(fmt.Errorf("failed to write file %s. error: %v\n", path, err))
			}
		}

		for _, s := range t.Services {
			if servicetpl == nil {
				servicetpl = initemplate(TPL_SERVICE, "tmpl/swift/service.goswift")
			}

			// filename is the service name plus 'Service'
			name := s.Name + "Service.swift"

			path := filepath.Join(output, name)

			data := &swiftService{BaseSwift: &BaseSwift{Thrift: t, Thrifts: &parsedThrift}, Service: s}

			if err := outputfile(path, servicetpl, TPL_SERVICE, data); err != nil {
				panic(fmt.Errorf("failed to write file %s. error: %v\n", path, err))
			}
		}
	}
}

func initemplate(n string, path string) *template.Template {
	data, err := tmpl.Asset(path)
	if err != nil {
		panic(err)
	}

	tpl, err := template.New(n).Parse(string(data))
	if err != nil {
		panic(err)
	}

	return tpl
}

func outputfile(fp string, t *template.Template, tplname string, data interface{}) error {
	file, err := os.OpenFile(fp, os.O_WRONLY|os.O_CREATE|os.O_TRUNC, 0644)
	if err != nil {
		return err
	}

	defer file.Close()

	return t.ExecuteTemplate(file, tplname, data)
}

func init() {
	langs.Langs["swift"] = &SwiftGen{}
}
