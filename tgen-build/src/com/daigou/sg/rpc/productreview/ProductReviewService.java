package com.daigou.sg.rpc.productreview;

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
public class ProductReviewService {
    private static final Gson gson = GsonUtils.getGsonInstance();
    private static int msgID = 1;

    private ProductReviewService() {
        // Constructor hidden because this is a singleton
    }

    private static String getMsgID() {
        msgID += 1;
        return Integer.toString(msgID);
    }

    public static RpcRequest GetPackageReview(final int packageId, final Listener<java.util.ArrayList<TReview>> listener) {
        RpcResponse res = new RpcResponse(TReview.class, listener, true);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(packageId);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "ProductReview.GetPackageReview");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetReviewStat(final String productUrl, final Listener<TReviewStat> listener) {
        RpcResponse res = new RpcResponse(TReviewStat.class, listener);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(productUrl);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "ProductReview.GetReviewStat");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetReviews(final String productUrl, final boolean mustHasPhoto, final int offset, final int limit, final Listener<java.util.ArrayList<TReview>> listener) {
        RpcResponse res = new RpcResponse(TReview.class, listener, true);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(productUrl);
        params.add(mustHasPhoto);
        params.add(offset);
        params.add(limit);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "ProductReview.GetReviews");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetReviewsByRating(final String productUrl, final int rating, final int offset, final int limit, final Listener<java.util.ArrayList<TReview>> listener) {
        RpcResponse res = new RpcResponse(TReview.class, listener, true);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(productUrl);
        params.add(rating);
        params.add(offset);
        params.add(limit);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "ProductReview.GetReviewsByRating");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest ReviewProduct(final TReview obj, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(obj);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "ProductReview.ReviewProduct");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetReviewCount(final Listener<Integer> listener) {
        RpcResponse res = new RpcResponse(Integer.class, listener);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "ProductReview.UserGetReviewCount");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetReviews(final int offset, final int limit, final Listener<java.util.ArrayList<TReview>> listener) {
        RpcResponse res = new RpcResponse(TReview.class, listener, true);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(offset);
        params.add(limit);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "ProductReview.UserGetReviews");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserReviewProduct(final TReview obj, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(obj);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "ProductReview.UserReviewProduct");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserSetProductReviewHelpful(final String productReviewDetailId, final boolean helpful, final Listener<Void> listener) {
        RpcResponse res = new RpcResponse(null, listener);

        final java.util.ArrayList<Object> params = new java.util.ArrayList<>();
        params.add(productReviewDetailId);
        params.add(helpful);

        java.util.HashMap<String, Object> args = new java.util.HashMap<>();
        args.put("id", getMsgID());
        args.put("method", "ProductReview.UserSetProductReviewHelpful");
        args.put("params", params);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getJsonRpcUrl(), res, args);
        TRpc.getQueue().add(req);
        return req;
    }
}
