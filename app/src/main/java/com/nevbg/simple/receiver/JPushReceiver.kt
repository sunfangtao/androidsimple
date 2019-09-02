package com.nevbg.simple.receiver

import android.content.BroadcastReceiver
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import cn.jpush.android.api.JPushInterface
import com.wxt.library.sql.DBHelper
import com.wxt.library.util.Util

/**
 * Created by SunFangtao on 2018/04/13.
 */

class JPushReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val bundle = intent.extras
        Util.print("[MyReceiver] onReceive - " + intent.action + ", extras: " + printBundle(bundle))

        when (intent.action) {
            JPushInterface.ACTION_REGISTRATION_ID -> {
                val regId = bundle!!.getString(JPushInterface.EXTRA_REGISTRATION_ID)
                val appKey = bundle.getString(JPushInterface.EXTRA_APP_KEY)
                Util.print("[MyReceiver] 接收Registration Id : " + regId!!)
                //send the Registration Id to your server...
//                val jPushVO = JPushBean()
//                jPushVO.registrationId = regId
//                DBHelper.getInstance(context).deleteInsert(jPushVO)
            }
            JPushInterface.ACTION_MESSAGE_RECEIVED -> {
                Log.e(ContentValues.TAG, "[MyReceiver] 接收到推送下来的自定义消息: " + bundle!!.getString(JPushInterface.EXTRA_MESSAGE)!!)
                processCustomMessage(context, bundle)
            }
            JPushInterface.ACTION_NOTIFICATION_RECEIVED -> {
                Log.e(ContentValues.TAG, "[MyReceiver] 接收到推送下来的通知")
                val notifactionId = bundle!!.getInt(JPushInterface.EXTRA_NOTIFICATION_ID)
                Log.e(ContentValues.TAG, "[MyReceiver] 接收到推送下来的通知的ID: " + notifactionId)

                var title: String? = ""
                var content: String? = ""
                for (key in bundle.keySet()) {
                    if (key == "cn.jpush.android.ALERT") {
                        content = bundle.getString(key)
                    } else if (key == "cn.jpush.android.NOTIFICATION_CONTENT_TITLE") {
                        title = bundle.getString(key)
                    }
                }
            }
            JPushInterface.ACTION_NOTIFICATION_OPENED -> {
                Log.e(ContentValues.TAG, "[MyReceiver] 用户点击打开了通知")
            }
            JPushInterface.ACTION_RICHPUSH_CALLBACK -> {
                Log.e(ContentValues.TAG, "[MyReceiver] 用户收到到RICH PUSH CALLBACK: " + bundle!!.getString(JPushInterface.EXTRA_EXTRA)!!)
            }
            JPushInterface.ACTION_CONNECTION_CHANGE -> {
                val connected = intent.getBooleanExtra(JPushInterface.EXTRA_CONNECTION_CHANGE, false)
                Log.e(ContentValues.TAG, "[MyReceiver]" + intent.action + " connected state change to " + connected)
            }
            else -> {
                Log.e(ContentValues.TAG, "[MyReceiver] Unhandled intent - " + intent.action!!)
            }
        }
    }

    // 打印所有的 intent extra 数据
    private fun printBundle(bundle: Bundle?): String {
        val sb = StringBuilder()
        //        for (String key : bundle.keySet()) {
        //            if (key.equals(JPushInterface.EXTRA_NOTIFICATION_ID)) {
        //                sb.append("\nkey:" + key + ", value:" + bundle.getInt(key));
        //            } else if (key.equals(JPushInterface.EXTRA_CONNECTION_CHANGE)) {
        //                sb.append("\nkey:" + key + ", value:" + bundle.getBoolean(key));
        //            } else if (key.equals(JPushInterface.EXTRA_EXTRA)) {
        //                if (bundle.getString(JPushInterface.EXTRA_EXTRA).isEmpty()) {
        //                    Log.i(TAG, "This message has no Extra data");
        //                    continue;
        //                }
        //
        //                try {
        //                    JSONObject json = new JSONObject(bundle.getString(JPushInterface.EXTRA_EXTRA));
        //                    Iterator<String> it = json.keys();
        //
        //                    while (it.hasNext()) {
        //                        String myKey = it.next().toString();
        //                        sb.append("\nkey:" + key + ", value: [" +
        //                                myKey + " - " + json.optString(myKey) + "]");
        //                    }
        //                } catch (JSONException e) {
        //                    Log.e(TAG, "Get message extra JSON error!");
        //                }
        //
        //            } else {
        //                sb.append("\nkey:" + key + ", value:" + bundle.getString(key));
        //            }
        //        }
        return sb.toString()
    }

    // send msg to MainActivity
    private fun processCustomMessage(context: Context, bundle: Bundle) {

    }
}

