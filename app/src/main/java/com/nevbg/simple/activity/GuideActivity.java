package com.nevbg.simple.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.nevbg.simple.R;

import java.util.ArrayList;
import java.util.List;

import cn.sft.base.activity.BaseGuideActivity;

/**
 * 引导页
 * 必须继承BaseGuideActivity
 * 需要实现setGuideViews，用于返回引导页面显示的数据 List大小就是页面个数
 * 完成引导功能后，需要调用closeGuide()方法，否则将认为下次仍然需要引导
 * 实现GuideLisener的类中返回GuideActivity.class进行关联绑定
 */
public class GuideActivity extends BaseGuideActivity {

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
    protected void afterRestoreInstanceState(Bundle bundle) {

    }
}
