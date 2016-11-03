package com.kevin.customrowview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.kevin.customrowview.view.OnRowChangeListener;
import com.kevin.customrowview.view.RowActionEnum;
import com.kevin.customrowview.view.RowView;

public class MainActivity extends Activity implements OnRowChangeListener {


    private RowView mWidgetRowView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWidgetRowView=(RowView)findViewById(R.id.mWidgetRowView);
        mWidgetRowView.initData(R.drawable.ic_row_value_required,"My Posts", RowActionEnum.MY_POSTS,this);
    }

    @Override
    public void onRowChangee(RowActionEnum action) {
          Toast.makeText(this,action.name(),Toast.LENGTH_LONG).show();
    }
}
