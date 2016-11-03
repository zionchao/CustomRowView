package com.kevin.customrowview.view;

/**
 * Created by ZhangChao on 2016/11/3.
 */

public class RowDescriptor {
    public int iconResId;
    public String label;
    public RowActionEnum action;

    public RowDescriptor(int iconResId, String label, RowActionEnum action) {
        this.iconResId = iconResId;
        this.label = label;
        this.action = action;
    }
}
