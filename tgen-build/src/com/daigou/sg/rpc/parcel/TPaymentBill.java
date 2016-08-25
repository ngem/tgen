package com.daigou.sg.rpc.parcel;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TPaymentBill extends BaseModule<TPaymentBill> implements Serializable {
    public int id;
    public String paymentNumber;
    public String total;
    public String chargeWeight;
    public String packageWeight;
    public java.util.ArrayList<TPaymentBillCategory> paymentBillDetails;
    public String paymentStatus;
    public String createDate;
    public String paymentType;
}
