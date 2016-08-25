package com.daigou.sg.rpc.product;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TFlashSalesInfo extends BaseModule<TFlashSalesInfo> implements Serializable {
    public boolean flashSalesAvailable;
    public long beginTimeSpan;
    public long endTimeSpan;
    public double flashSalesPrice;
    public int stock;
}
