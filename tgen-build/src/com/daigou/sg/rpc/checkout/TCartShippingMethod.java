package com.daigou.sg.rpc.checkout;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TCartShippingMethod extends BaseModule<TCartShippingMethod> implements Serializable {
    public String code;
    public String name;
    public String desc;
    public double cost;
    public boolean available;
}
