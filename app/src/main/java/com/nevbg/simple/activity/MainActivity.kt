package com.nevbg.simple.activity

import android.os.Bundle
import android.widget.RadioGroup
import com.nevbg.simple.R
import com.nevbg.simple.base.CustomBaseActivity
import com.wxt.library.base.activity.RadioButtonFragmentActivity
import com.wxt.library.base.fragment.BaseFragment

/**
 * APP主界面
 * 在WelcomeActivity中返回MainActivity.class进行关联绑定
 */
class MainActivity : RadioButtonFragmentActivity() {

    override fun setRadioGroup(): RadioGroup {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isConsumeCheckChanged(p0: RadioGroup?, p1: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFragmentLayoutID(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFragmentList(): MutableList<BaseFragment> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}