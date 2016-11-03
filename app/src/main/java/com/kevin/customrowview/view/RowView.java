package com.kevin.customrowview.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kevin.customrowview.R;

/**
 * Created by zhangchao_a on 2016/11/3.
 */

public class RowView extends LinearLayout implements View.OnClickListener {

    private final Context context;
    private ImageView mWidgetRowIconImg;
    private TextView mWidgetRowLabel;
    private ImageView mWidgetRowActionImg;
    private RowActionEnum action;
    private OnRowChangeListener listener;

    public RowView(Context context) {
        super(context);
        this.context=context;
        initView();
    }

    public RowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        initView();


    }

    public RowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context=context;
        initView();

    }

    private void initView() {

        LayoutInflater.from(context).inflate(R.layout.widget_general_row,this);

        mWidgetRowIconImg=(ImageView)findViewById(R.id.mWidgetRowIconImg);
        mWidgetRowLabel=(TextView)findViewById(R.id.mWidgetRowLabel);
        mWidgetRowActionImg=(ImageView)findViewById(R.id.mWidgetRowActionImg);


    }

    public void initData(int iconResId, String name, RowActionEnum action,OnRowChangeListener listener)
    {
        this.action=action;
        this.listener=listener;
        mWidgetRowIconImg.setBackgroundResource(iconResId);
        mWidgetRowLabel.setText(name);
        mWidgetRowActionImg.setImageResource(R.mipmap.ic_row_forward);
        if (action!=null)
        {
            mWidgetRowActionImg.setOnClickListener(this);
            mWidgetRowActionImg.setVisibility(View.VISIBLE);
            setBackgroundResource(R.drawable.widgets_general_row_selector);
        }else
        {
            setBackgroundColor(Color.WHITE);
            mWidgetRowActionImg.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
//        switch (v.getId())
//        {
//            case R.id.mWidgetRowActionImg:
//                Toast.makeText(context,action.name(),Toast.LENGTH_LONG).show();
//                break;
//        }
        if (listener!=null)
            listener.onRowChangee(action);

    }
}
