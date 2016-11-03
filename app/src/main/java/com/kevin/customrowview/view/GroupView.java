package com.kevin.customrowview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.kevin.customrowview.R;

import java.util.ArrayList;

/**
 * Created by ZhangChao on 2016/11/3.
 */

public class GroupView extends LinearLayout {

    private ArrayList<RowDescriptor> descriptors;
    private Context context;
    private OnRowChangeListener listener;

    public GroupView(Context context) {
        super(context);
        initView(context);
    }

    public GroupView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);

    }

    public GroupView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);

    }

    private void initView(Context context) {
        this.context=context;
        setOrientation(VERTICAL);
    }

    public void initData(ArrayList<RowDescriptor> descriptors,OnRowChangeListener listener){
        this.descriptors=descriptors;
        this.listener=listener;
    }

    public void notifyDataChanged()
    {
        if (descriptors!=null&&descriptors.size()>0)
        {
            RowView row=null;
            View line=null;
            LayoutParams params=new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,1);
            params.leftMargin=10;
            for (int i=0;i<descriptors.size();i++)
            {
                row=new RowView(context);
                row.initData(descriptors.get(i),listener);
                row.notifyDataChanged();
                addView(row);
                if (i!=descriptors.size()-1)
                {
                    line =new View(context);
                    line.setBackgroundResource(R.color.widgets_general_row_line);
                    addView(line,params);
                }
            }
        }else
        {
            setVisibility(View.GONE);
        }
    }
}
