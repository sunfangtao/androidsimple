package com.nevbg.simple.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.sft.tree.Node;
import cn.sft.util.Util;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Util.print("MainActivity");
        super.onCreate(savedInstanceState);
    }
}