package com.daigou.sg.rpc.tpackage;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TProductComment extends BaseModule<TProductComment> implements Serializable {
    public int id;
    public int agentProductId;
    public String originCode;
    public String attachments;
    public String comment;
    public int rating;
    public String productUrl;
    public String productImage;
    public String productSku;
    public String productName;
    public int orderId;
    public double subTotal;
}
