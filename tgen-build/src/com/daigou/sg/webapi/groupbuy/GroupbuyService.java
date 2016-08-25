package com.daigou.sg.webapi.groupbuy;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.daigou.sg.rpc.BaseModule;
import com.daigou.sg.rpc.GsonUtils;
import com.daigou.sg.rpc.RpcRequest;
import com.daigou.sg.rpc.RpcResponse;
import com.daigou.sg.rpc.TRpc;
import com.google.gson.Gson;

import java.nio.charset.Charset;

public class GroupbuyService {
    private static final Gson gson = GsonUtils.getGsonInstance();
    private static int msgID = 1;

    private GroupbuyService() {
        // Constructor hidden because this is a singleton
    }

    private static String getMsgID() {
        msgID += 1;
        return Integer.toString(msgID);
    }

    public static RpcRequest GetBanners(final Listener<java.util.ArrayList<TBanner>> listener) {
        RpcResponse res = new RpcResponse(TBanner.class, listener, true,false);
        java.util.HashMap<String, Object> args = null;

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Groupbuy/GetBanners", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetGroupBuyProducts(final TSearchCondition condition, final Listener<java.util.ArrayList<TGroupbuyProduct>> listener) {
        RpcResponse res = new RpcResponse(TGroupbuyProduct.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("condition", condition);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Groupbuy/GetGroupBuyProducts", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetTags(final Listener<java.util.ArrayList<String>> listener) {
        RpcResponse res = new RpcResponse(String.class, listener, true,false);
        java.util.HashMap<String, Object> args = null;

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Groupbuy/GetTags", res, args);
        TRpc.getQueue().add(req);
        return req;
    }
}
