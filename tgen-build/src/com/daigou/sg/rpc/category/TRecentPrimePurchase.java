package com.daigou.sg.rpc.category;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TRecentPrimePurchase extends BaseModule<TRecentPrimePurchase> implements Serializable {
    public String customerName;
    public java.util.ArrayList<TRecentPrimePurchaseProduct> products;
    public int paymentBillId;
    public int itemCount;
    public String customerAvatar;
}
