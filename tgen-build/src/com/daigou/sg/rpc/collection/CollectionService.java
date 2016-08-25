package com.daigou.sg.rpc.collection;

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

import java.io.IOException;
import java.nio.charset.Charset;
public class CollectionService {
    private static final Gson gson = GsonUtils.getGsonInstance();
    private static int msgID = 1;

    private CollectionService() {
        // Constructor hidden because this is a singleton
    }

    private static String getMsgID() {
        msgID += 1;
        return Integer.toString(msgID);
    }

    public static RpcRequest GetCollection(final String id, final Listener<TCollection> listener) {
        RpcResponse res = new RpcResponse(TCollection.class, listener);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(id);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "Collection.GetCollection");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetFeatured(final String originCode, final int offset, final int limit, final Listener<java.util.ArrayList<TCollection>> listener) {
        RpcResponse res = new RpcResponse(TCollection.class, listener, true);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(originCode);
        params.add(offset);
        params.add(limit);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "Collection.GetFeatured");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetFeaturedForList(final String originCode, final int offset, final int limit, final Listener<java.util.ArrayList<TCollectionForList>> listener) {
        RpcResponse res = new RpcResponse(TCollectionForList.class, listener, true);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(originCode);
        params.add(offset);
        params.add(limit);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "Collection.GetFeaturedForList");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetProducts(final String id, final int offset, final int limit, final Listener<java.util.ArrayList<TProductSimple>> listener) {
        RpcResponse res = new RpcResponse(TProductSimple.class, listener, true);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(id);
        params.add(offset);
        params.add(limit);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "Collection.GetProducts");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }
}
