package com.daigou.sg.webapi.order.history;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TOrderHistoryPackage extends BaseModule<TOrderHistoryPackage> implements Serializable {
    public int packageID;
    public String packageNumber;
    public java.util.ArrayList<com.daigou.sg.webapi.common.TOrderSimple> orders;
    public String total;
    public com.daigou.sg.webapi.common.TServiceType serviceType;
    public boolean hasReviewed;
}
