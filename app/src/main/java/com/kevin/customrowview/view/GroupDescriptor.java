package com.kevin.customrowview.view;

import java.util.ArrayList;

/**
 * Created by zhangchao_a on 2016/11/4.
 */

public class GroupDescriptor {

    public String title;
    public ArrayList<RowDescriptor> descriptors;

    public GroupDescriptor( ArrayList<RowDescriptor> rowDescriptors) {
        this.descriptors = rowDescriptors;
    }

    public GroupDescriptor(String title, ArrayList<RowDescriptor> rowDescriptors) {
        this.title = title;
        this.descriptors = rowDescriptors;
    }
}
