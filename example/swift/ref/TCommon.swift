/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

import Foundation

class TRCommonCommon: EzObject {
    override var allKeys: Set<String> {
        return []
    }

    override func fromJSON(jsonObject: AnyObject?) -> Bool {
        guard super.fromJSON(jsonObject) else { return false }

        guard let dict = jsonObject as? [String: AnyObject] else { return false }

        return true
    }

    override func toJSON() -> AnyObject {
        var dict = [String: AnyObject]()

        return dict
    }
}
