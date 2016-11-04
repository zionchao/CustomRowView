package com.kevin.customrowview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.kevin.customrowview.view.BaseRowDescriptor;
import com.kevin.customrowview.view.ContainerView;
import com.kevin.customrowview.view.GroupDescriptor;
import com.kevin.customrowview.view.OnRowChangeListener;
import com.kevin.customrowview.view.RowActionEnum;
import com.kevin.customrowview.view.RowNormalDescriptor;

import java.util.ArrayList;

public class MainActivity extends Activity implements OnRowChangeListener {

    private ContainerView mWidgetContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWidgetContainerView=(ContainerView)findViewById(R.id.mWidgetContainerView);

        ArrayList<GroupDescriptor> groupDescriptors=new ArrayList<>();

        ArrayList<BaseRowDescriptor> descriptors=new ArrayList<>();
        descriptors.add(new RowNormalDescriptor(R.drawable.ic_row_value_required,"My Posts", RowActionEnum.MY_POSTS));
        descriptors.add(new RowNormalDescriptor(R.drawable.ic_toggle_off,"Toggle off", RowActionEnum.TOGGLE_OFF));
        descriptors.add(new RowNormalDescriptor(R.drawable.ic_toggle_on,"Toggle on", RowActionEnum.TOGGLE_ON));

        GroupDescriptor group=new GroupDescriptor(descriptors);
        groupDescriptors.add(group);
        mWidgetContainerView.initData(groupDescriptors,this);

        mWidgetContainerView.notifyDataChanged();
    }

    @Override
    public void onRowChanged(RowActionEnum action) {
          Toast.makeText(this,action.name(),Toast.LENGTH_LONG).show();
    }
}
