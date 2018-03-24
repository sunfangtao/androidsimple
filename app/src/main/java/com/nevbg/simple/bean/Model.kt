package com.nevbg.simple.bean

/**
 * Created by Administrator on 2018/3/24.
 * 增加服务器返回json的解析对象实体类
 */
object Model {

    data class User(var name: String, var age: Int)

    data class Person(var name: String, var age: Int)

}