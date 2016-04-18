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

public class TPackage extends BaseModule<TPackage> implements Serializable {
    public int id;
    public String purchaseType;
    public String packageNumber;
    public String packageEtaDate;
    public String chargeWeight;
    public String shipmentTypeCode;
    public String altShipmentTypeName;
    public String warehouseCode;
    public String arrivedDate;
    public String shippedDate;
    public String collectionDate;
    public double totalFee;
    public double packageWeight;
    public String createDate;
}
