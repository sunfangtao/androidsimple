//package com.nevbg.simple.sample;
//
//import android.os.Bundle;
//import android.widget.RadioGroup;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import cn.sft.base.fragment.BaseFragment;
//
//public class SelectReceiverActivity extends RadioButtonFragmentActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    @Override
//    public List<BaseFragment> getFragmentList() {
//        List<BaseFragment> list = new ArrayList<>();
//        list.add(new MainFragment_());
//        list.add(new MonitorFragment_());
//        list.add(new MyFragment_());
//
//        return list;
//    }
//
//    @Override
//    public int getFragmentLayoutID() {
//        return R.id.main_contain_layout;
//    }
//
//    @Override
//    public RadioGroup setRadioGroup() {
//        return findViewById(R.id.main_rg);
//    }
//
//}