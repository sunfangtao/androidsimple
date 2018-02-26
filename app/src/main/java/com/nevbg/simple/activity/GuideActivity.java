package com.nevbg.simple.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.nevbg.simple.R;

import java.util.ArrayList;
import java.util.List;

import cn.sft.base.activity.BaseGuideActivity;
import cn.sft.util.Util;

public class GuideActivity extends BaseGuideActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Util.print("GuideActivity");
    }

    @Override
    protected List<View> setGuideViews() {
        LayoutInflater inflater = LayoutInflater.from(this);
        List<View> list = new ArrayList<>();
        View view;
        list.add(inflater.inflate(R.layout.item_shop, null, false));
        list.add(view = inflater.inflate(R.layout.item_receiver_select_title, null, false));

        view.findViewById(R.id.check_box).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeGuide();
            }
        });

        return list;
    }

    @Override
    protected void afterRestoreInstanceState(Bundle savedInstanceState) {

    }
}
