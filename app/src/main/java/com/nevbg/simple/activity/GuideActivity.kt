package com.nevbg.simple.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.nevbg.simple.R
import java.util.ArrayList
import com.wxt.library.base.activity.BaseGuideActivity

/**
 * 引导页
 * 必须继承BaseGuideActivity
 * 需要实现setGuideViews，用于返回引导页面显示的数据 List大小就是页面个数
 * 完成引导功能后，需要调用closeGuide()方法，否则将认为下次仍然需要引导
 * 实现GuideLisener的类中返回GuideActivity.class进行关联绑定
 */
class GuideActivity : BaseGuideActivity() {

    override fun setGuideViews(): List<View> {
        val inflater = LayoutInflater.from(this)
        val list = ArrayList<View>()
        // 最后一个引导页面，需要实现点击关闭引导页面功能
        val view: View = inflater.inflate(R.layout.item_receiver_select_title, null, false)

        list.add(inflater.inflate(R.layout.item_shop, null, false))
        list.add(view)

        view.findViewById<View>(R.id.check_box).setOnClickListener { closeGuide() }

        return list
    }

}
