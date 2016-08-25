package com.daigou.sg.webapi.common;

import com.google.gson.annotations.SerializedName;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public enum TServiceType implements java.io.Serializable, com.daigou.sg.rpc.DeserializerEnum {
	@SerializedName("0")
	OTHER(0),
	@SerializedName("1")
	BUY4ME(1),
	@SerializedName("2")
	SHIP4ME(2),
	@SerializedName("3")
	EZBUY(3),
	@SerializedName("4")
	PRIME(4);


	int type;

    TServiceType(int type) {
        this.type = type;
    }

	@Override
    public String toString() {
        return Integer.toString(type);
    }

    @Override
    public int getValue() {
        return type;
    }
}
