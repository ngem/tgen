package com.daigou.selfstation.rpc.selfstation;

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

public class DeliveryService {
    private static final Gson gson = GsonUtils.getGsonInstance();
    private static int msgID = 1;

    private DeliveryService() {
        // Constructor hidden because this is a singleton
    }

    private static String getMsgID() {
        msgID += 1;
        return Integer.toString(msgID);
    }

    public static RpcRequest AckArrival(final int packageId, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("packageId", packageId);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/AckArrival", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest AddEmployee(final String username, final String password, final String catelog, final Listener<TBoolReply> listener) {
        RpcResponse res = new RpcResponse(TBoolReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("username", username);
        
        args.put("password", password);
        
        args.put("catelog", catelog);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/AddEmployee", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest EmployeeDeleteById(final String id, final Listener<TBoolReply> listener) {
        RpcResponse res = new RpcResponse(TBoolReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("id", id);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/EmployeeDeleteById", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest EmployeeDeleteStation(final String id, final String station, final Listener<TBoolReply> listener) {
        RpcResponse res = new RpcResponse(TBoolReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("id", id);
        
        args.put("station", station);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/EmployeeDeleteStation", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest EmployeeGetStations(final String id, final Listener<TSelfStationNamesReply> listener) {
        RpcResponse res = new RpcResponse(TSelfStationNamesReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("id", id);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/EmployeeGetStations", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest EmployeeLogin(final String username, final String password, final String catelog, final Listener<TBoolReply> listener) {
        RpcResponse res = new RpcResponse(TBoolReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("username", username);
        
        args.put("password", password);
        
        args.put("catelog", catelog);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/EmployeeLogin", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest EmployeeLogout(final Listener<TBoolReply> listener) {
        RpcResponse res = new RpcResponse(TBoolReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = null;

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/EmployeeLogout", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest EmployeeSetPassword(final String id, final String password, final Listener<TBoolReply> listener) {
        RpcResponse res = new RpcResponse(TBoolReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("id", id);
        
        args.put("password", password);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/EmployeeSetPassword", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest EmployeeUpdateStations(final String id, final java.util.ArrayList<String> stations, final Listener<TBoolReply> listener) {
        RpcResponse res = new RpcResponse(TBoolReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("id", id);
        
        args.put("stations", stations);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/EmployeeUpdateStations", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetEmployees(final String catalog, final int limit, final int offset, final Listener<TEmployeesReply> listener) {
        RpcResponse res = new RpcResponse(TEmployeesReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("catalog", catalog);
        
        args.put("limit", limit);
        
        args.put("offset", offset);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/GetEmployees", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetSelfStationNames(final String catalog, final int limit, final int offset, final Listener<TSelfStationNamesReply> listener) {
        RpcResponse res = new RpcResponse(TSelfStationNamesReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("catalog", catalog);
        
        args.put("limit", limit);
        
        args.put("offset", offset);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/GetSelfStationNames", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetSelfStations(final String catalog, final Listener<TSelfStationsReply> listener) {
        RpcResponse res = new RpcResponse(TSelfStationsReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("catalog", catalog);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/GetSelfStations", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest GetServers(final String mode, final Listener<java.util.ArrayList<TServer>> listener) {
        RpcResponse res = new RpcResponse(TServer.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("mode", mode);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/GetServers", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest Login(final String username, final String password, final String catalogCode, final Listener<TLoginResult> listener) {
        RpcResponse res = new RpcResponse(TLoginResult.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("username", username);
        
        args.put("password", password);
        
        args.put("catalogCode", catalogCode);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/Login", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserFindPackageNumbers(final String localDeliveryMethod, final String deliveryFromDate, final String deliveryToDate, final String stationName, final String periodName, final boolean isProcessing, final boolean isPick, final int house, final boolean showShipmentDetail, final boolean showPaymentInfo, final String timePeriodType, final boolean isSigned, final Listener<TFindSubPackageResult> listener) {
        RpcResponse res = new RpcResponse(TFindSubPackageResult.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("localDeliveryMethod", localDeliveryMethod);
        
        args.put("deliveryFromDate", deliveryFromDate);
        
        args.put("deliveryToDate", deliveryToDate);
        
        args.put("stationName", stationName);
        
        args.put("periodName", periodName);
        
        args.put("isProcessing", isProcessing);
        
        args.put("isPick", isPick);
        
        args.put("house", house);
        
        args.put("showShipmentDetail", showShipmentDetail);
        
        args.put("showPaymentInfo", showPaymentInfo);
        
        args.put("timePeriodType", timePeriodType);
        
        args.put("isSigned", isSigned);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserFindPackageNumbers", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserFindParcel(final String localDeliveryMethod, final String stationName, final String date, final String userName, final String phone, final String parcelNumber, final String shelfNo, final int offset, final int limit, final Listener<java.util.ArrayList<TParcel>> listener) {
        RpcResponse res = new RpcResponse(TParcel.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("localDeliveryMethod", localDeliveryMethod);
        
        args.put("stationName", stationName);
        
        args.put("date", date);
        
        args.put("userName", userName);
        
        args.put("phone", phone);
        
        args.put("parcelNumber", parcelNumber);
        
        args.put("shelfNo", shelfNo);
        
        args.put("offset", offset);
        
        args.put("limit", limit);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserFindParcel", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserFuzzySearchParcels(final TFuzzySearchType searchType, final String content, final Listener<TFindSubPackageResult> listener) {
        RpcResponse res = new RpcResponse(TFindSubPackageResult.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        int searchTypeValue = ((com.daigou.sg.rpc.DeserializerEnum) searchType).getValue();
        args.put("searchType", searchTypeValue);
        
        args.put("content", content);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserFuzzySearchParcels", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetCollectionPeriod(final String deliveryMethod, final Listener<java.util.ArrayList<String>> listener) {
        RpcResponse res = new RpcResponse(String.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("deliveryMethod", deliveryMethod);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetCollectionPeriod", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetDeliveryMethod(final Listener<java.util.ArrayList<TDeliveryMethod>> listener) {
        RpcResponse res = new RpcResponse(TDeliveryMethod.class, listener, true,false);
        java.util.HashMap<String, Object> args = null;

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetDeliveryMethod", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetDeliveryWarehouse(final Listener<java.util.ArrayList<String>> listener) {
        RpcResponse res = new RpcResponse(String.class, listener, true,false);
        java.util.HashMap<String, Object> args = null;

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetDeliveryWarehouse", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetHomeDeliveryDrivers(final Listener<java.util.ArrayList<String>> listener) {
        RpcResponse res = new RpcResponse(String.class, listener, true,false);
        java.util.HashMap<String, Object> args = null;

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetHomeDeliveryDrivers", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetJoinIn(final String startTime, final String endTime, final Listener<TMyJoinReply> listener) {
        RpcResponse res = new RpcResponse(TMyJoinReply.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("startTime", startTime);
        
        args.put("endTime", endTime);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetJoinIn", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetMRTStations(final boolean addPeriodSuffix, final Listener<java.util.ArrayList<String>> listener) {
        RpcResponse res = new RpcResponse(String.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("addPeriodSuffix", addPeriodSuffix);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetMRTStations", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetNeighborhoodRegions(final boolean addPeriodSuffix, final Listener<java.util.ArrayList<String>> listener) {
        RpcResponse res = new RpcResponse(String.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("addPeriodSuffix", addPeriodSuffix);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetNeighborhoodRegions", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetNeighborhoodStations(final String region, final Listener<java.util.ArrayList<String>> listener) {
        RpcResponse res = new RpcResponse(String.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("region", region);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetNeighborhoodStations", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetParcel(final String parcelNumber, final Listener<TParcel> listener) {
        RpcResponse res = new RpcResponse(TParcel.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("parcelNumber", parcelNumber);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetParcel", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetParcelPaymentInfo(final int shipmentId, final Listener<TParcelPaymentInfo> listener) {
        RpcResponse res = new RpcResponse(TParcelPaymentInfo.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("shipmentId", shipmentId);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetParcelPaymentInfo", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetParcelRemarks(final String parcelNumber, final Listener<TOrderRemarksResult> listener) {
        RpcResponse res = new RpcResponse(TOrderRemarksResult.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("parcelNumber", parcelNumber);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetParcelRemarks", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetPrintLogInfo(final int packageId, final String subPackageNumber, final Listener<java.util.ArrayList<TPrintLogInfo>> listener) {
        RpcResponse res = new RpcResponse(TPrintLogInfo.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("packageId", packageId);
        
        args.put("subPackageNumber", subPackageNumber);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetPrintLogInfo", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetReceiptPaymentTypes(final Listener<java.util.ArrayList<String>> listener) {
        RpcResponse res = new RpcResponse(String.class, listener, true,false);
        java.util.HashMap<String, Object> args = null;

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetReceiptPaymentTypes", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetRemarkInfo(final int customerId, final int shipmentId, final int packageId, final Listener<java.util.ArrayList<TPrintLogInfo>> listener) {
        RpcResponse res = new RpcResponse(TPrintLogInfo.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("customerId", customerId);
        
        args.put("shipmentId", shipmentId);
        
        args.put("packageId", packageId);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetRemarkInfo", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserGetUploadToken(final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = null;

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserGetUploadToken", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserListParcel(final String stationName, final String status, final int offset, final int limit, final Listener<java.util.ArrayList<TParcel>> listener) {
        RpcResponse res = new RpcResponse(TParcel.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("stationName", stationName);
        
        args.put("status", status);
        
        args.put("offset", offset);
        
        args.put("limit", limit);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserListParcel", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserModifyPassword(final String currentPassword, final String newPassword, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("currentPassword", currentPassword);
        
        args.put("newPassword", newPassword);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserModifyPassword", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserPDTGetSMSTemplates(final String deliveryMethod, final String stationName, final String timePeriodType, final Listener<java.util.ArrayList<TPDTSmsTemplate>> listener) {
        RpcResponse res = new RpcResponse(TPDTSmsTemplate.class, listener, true,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("deliveryMethod", deliveryMethod);
        
        args.put("stationName", stationName);
        
        args.put("timePeriodType", timePeriodType);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserPDTGetSMSTemplates", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserPDTSendCustomerSMS(final java.util.ArrayList<TPDTSmsMessage> mesages, final String content, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("mesages", mesages);
        
        args.put("content", content);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserPDTSendCustomerSMS", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserPutParcelToBox(final String boxNum, final String subParcelNum, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("boxNum", boxNum);
        
        args.put("subParcelNum", subParcelNum);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserPutParcelToBox", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserReadyForCollection(final String shelfNumber, final String subParcelNumber, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("shelfNumber", shelfNumber);
        
        args.put("subParcelNumber", subParcelNumber);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserReadyForCollection", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserReceipt(final java.util.ArrayList<Integer> shipmentIds, final int customerId, final String signatureImageKey, final int rating, final TReceiptPayment payment, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("shipmentIds", shipmentIds);
        
        args.put("customerId", customerId);
        
        args.put("signatureImageKey", signatureImageKey);
        
        args.put("rating", rating);
        
        args.put("payment", payment);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserReceipt", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserSavePackageScanLabelColor(final int packageId, final String color, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("packageId", packageId);
        
        args.put("color", color);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserSavePackageScanLabelColor", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserSavePickSubPackage(final String subPackageNum, final String BOrP, final String boxNum, final int packageId, final int shipmentId, final boolean isForceSave, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("subPackageNum", subPackageNum);
        
        args.put("BOrP", BOrP);
        
        args.put("boxNum", boxNum);
        
        args.put("packageId", packageId);
        
        args.put("shipmentId", shipmentId);
        
        args.put("isForceSave", isForceSave);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserSavePickSubPackage", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserSavePickSubPackages(final java.util.ArrayList<TSaveSubPkgInfo> pkgInfos, final String boxNum, final Listener<TSaveResult> listener) {
        RpcResponse res = new RpcResponse(TSaveResult.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("pkgInfos", pkgInfos);
        
        args.put("boxNum", boxNum);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserSavePickSubPackages", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserScanToShelf(final String shelfNumber, final String parcelNumber, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("shelfNumber", shelfNumber);
        
        args.put("parcelNumber", parcelNumber);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserScanToShelf", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserSetBoxOutForDelivery(final String carLocation, final String boxNum, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("carLocation", carLocation);
        
        args.put("boxNum", boxNum);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserSetBoxOutForDelivery", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserSetParcelReceived(final String parcelNumber, final String signatureImageKey, final int rating, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("parcelNumber", parcelNumber);
        
        args.put("signatureImageKey", signatureImageKey);
        
        args.put("rating", rating);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserSetParcelReceived", res, args);
        TRpc.getQueue().add(req);
        return req;
    }

    public static RpcRequest UserSetShipmentStatus(final java.util.ArrayList<Integer> shipmentIds, final boolean isLocked, final Listener<String> listener) {
        RpcResponse res = new RpcResponse(String.class, listener,false,false);
        java.util.HashMap<String, Object> args = new java.util.HashMap<String, Object>();
        
        args.put("shipmentIds", shipmentIds);
        
        args.put("isLocked", isLocked);

        RpcRequest req = new RpcRequest(Request.Method.POST, TRpc.getWebApiUrl() + "Delivery/UserSetShipmentStatus", res, args);
        TRpc.getQueue().add(req);
        return req;
    }
}
