package com.nevbg.simple.common

/**
 * Created by Administrator on 2018/4/26.
 */

object HttpConstant {

    var IP_PORT = VarConstant.IP_PORT

    object HttpUrl {
        val GENERAL_URL = IP_PORT + "/trans/app"
        val PIC_URL = IP_PORT + "/trans/pic"
    }
}
