package com.daigou.selfstation.rpc.selfstation;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TSaveResult extends BaseModule<TSaveResult> implements Serializable {
    public boolean isSucceeded;
    public java.util.ArrayList<TSaveResultMsg> msgs;
}
