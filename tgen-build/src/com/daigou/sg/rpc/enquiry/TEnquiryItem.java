package com.daigou.sg.rpc.enquiry;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TEnquiryItem extends BaseModule<TEnquiryItem> implements Serializable {
    public int id;
    public int parentId;
    public String content;
    public String updateBy;
    public String updateDate;
    public String attachments;
    public boolean canDelete;
}
