package com.kevin.customrowview.view;

/**
 * Created by ZhangChao on 2016/11/3.
 */

public class RowNormalDescriptor extends BaseRowDescriptor{
    public int iconResId;
    public String label;
    public RowActionEnum action;

    public RowNormalDescriptor(int iconResId, String label, RowActionEnum action) {
        this.iconResId = iconResId;
        this.label = label;
        this.action = action;
    }
}
