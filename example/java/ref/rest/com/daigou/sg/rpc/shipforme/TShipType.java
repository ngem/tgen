package com.daigou.sg.rpc.shipforme;

import com.google.gson.annotations.SerializedName;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

<<<<<<< ae032663e235daac3be6b0084cc2ee34eb37aea3
<<<<<<< 027989a52c3b7df0ed48e9a7895e42164e51bec0
<<<<<<< 426d8c35cacb2945a2e01575b9ca889913f8c645
public enum TShipType implements java.io.Serializable, com.daigou.sg.rpc.DeserializerEnum {
	@SerializedName("1")
	AA(1),
	@SerializedName("2")
	BB(2);


=======
public enum TShipType {
=======
public enum TShipType implements java.io.Serializable {
>>>>>>> modify enum
	@SerializedName("1")
	AA(1),
=======
public enum TShipType implements java.io.Serializable, DeserializerEnum {
>>>>>>> modify Java template
	@SerializedName("2")
	BB(2),
	@SerializedName("1")
	AA(1);

<<<<<<< 392a8a2f3c6c24710bc28cc677435ecb721b9830
>>>>>>> modify generated source files
=======

>>>>>>> change generated source files
	int type;

    TShipType(int type) {
        this.type = type;
    }

	@Override
    public String toString() {
<<<<<<< 82c4937cdf3db5620bead817a0f1a331f40dc0bb
<<<<<<< 426d8c35cacb2945a2e01575b9ca889913f8c645
        return Integer.toString(type);
    }

    @Override
    public int getValue() {
        return type;
=======
        return String.valueOf(type);
>>>>>>> modify generated source files
=======
        return Integer.toString(type);
>>>>>>> delete useless java files
    }

    @Override
    public int getValue() {
        return type;
    }
}
