package com.daigou.sg.rpc.tpackage;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TArrangeDeliveryBill extends BaseModule<TArrangeDeliveryBill> implements Serializable {
    public double totalFee;
    public java.util.ArrayList<TPackageDetail> packageBills;
    public boolean couponUsed;
    public String couponErrorMessage;
}
