/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

import Foundation

class ExampleService: Basic {

    class func getPendingWithdrawAmount(success: (Int) -> Void, failure: ((NSError) -> Void)? = nil) {
        let params = [String: AnyObject]()
        let api = "Example.getPendingWithdrawAmount"

        debugPrint(api, " req: ", params)

        AreaService.current?.JSRONPRCClient.invokeMethod(api, withParameters: params, success: { (operation, responseObject) -> Void in
            debugPrint(api, " resp: ", responseObject)
            
            success(responseObject as? Int ?? 0)
            }, failure: { (operation, error) -> Void in
                failure?(error)
        })
    }

    class func ping(ip: String?, success: (Void) -> Void, failure: ((NSError) -> Void)? = nil) {
        var params = [String: AnyObject]()
        params["ip"] = ip

        let api = "Example.ping"

        debugPrint(api, " req: ", params)

        AreaService.current?.JSRONPRCClient.invokeMethod(api, withParameters: params, success: { (operation, responseObject) -> Void in
            debugPrint(api, " resp: ", responseObject)
            
            success()
            }, failure: { (operation, error) -> Void in
                failure?(error)
        })
    }

}
