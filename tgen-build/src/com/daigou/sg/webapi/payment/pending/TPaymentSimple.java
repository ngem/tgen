package com.daigou.sg.webapi.payment.pending;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TPaymentSimple extends BaseModule<TPaymentSimple> implements Serializable {
    public int paymentID;
    public String paymentNumber;
    public int itemCount;
    public double totalAmount;
    public com.daigou.sg.webapi.common.TServiceType serviceType;
    public com.daigou.sg.webapi.common.TRelatedType paymentType;
    public long timeLeft;
    public String status;
    public java.util.ArrayList<String> itemPics;
    public String createdDate;
    public String name;
    public boolean paid;
    public java.util.ArrayList<Integer> relatedPaymentIDs;
}
