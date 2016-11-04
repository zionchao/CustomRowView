package com.kevin.customrowview.view;

/**
 * Created by ZhangChao on 2016/11/4.
 */

public class RowProfileDescriptor extends BaseRowDescriptor{
    public String imgUrl;
    public String label;
    public String detailLabel;

    public RowProfileDescriptor(String imgUrl,String label, String detailLabel) {
        this.imgUrl = imgUrl;
        this.label = label;
        this.detailLabel = detailLabel;
    }
}
