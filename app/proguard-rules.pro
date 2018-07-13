#-----------------------第三方混淆配置----------------------------------
#说明：--------------------------------
-dontwarn com.wxt.library.**
-keep class com.wxt.library.** {*;}
#说明：Gson---------------------------------
-dontwarn com.google.gson.**
-keep class com.google.gson.**{*;}
#说明：Glide---------------------------------
-dontwarn com.bumptech.glide.**
-keep class com.bumptech.glide.**{*;}
#说明：okhttp,okio---------------------------------
-dontwarn okio.**,okhttp3.**
-keep class okhttp3.**{*;}
-keep class okio.**{*;}
# 极光推送
-dontwarn cn.jpush.**
-keep class cn.jpush.** {*;}
# fastjson
-keepattributes Signature
-dontwarn com.alibaba.fastjson.**
-keep class com.alibaba.fastjson.**{*; }
#rxjava
-dontwarn rx.**
-keep class rx.** { *; }

-dontwarn sun.misc.**
-keepclassmembers class rx.internal.util.unsafe.*ArrayQueue*Field* {
 long producerIndex;
 long consumerIndex;
}
-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef {
 rx.internal.util.atomic.LinkedQueueNode producerNode;
}
-keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueConsumerNodeRef {
 rx.internal.util.atomic.LinkedQueueNode consumerNode;
}
#说明：高德地图
    #3D 地图 V5.0.0之后：
-keep   class com.amap.api.maps.**{*;}
-keep   class com.autonavi.**{*;}
-keep   class com.amap.api.trace.**{*;}
    #定位
-keep class com.amap.api.location.**{*;}
-keep class com.amap.api.fence.**{*;}
-keep class com.autonavi.aps.amapapi.model.**{*;}
    #搜索
-keep   class com.amap.api.services.**{*;}
    #2D地图
-keep class com.amap.api.maps2d.**{*;}
-keep class com.amap.api.mapcore2d.**{*;}
    #导航
-keep class com.amap.api.navi.**{*;}
-keep class com.autonavi.**{*;}

#说明：百度ORC
-keep class com.baidu.ocr.sdk.**{*;}
-dontwarn com.baidu.ocr.**
#-----------------------第三方混淆配置----------------------------------

#-----------------------反射实体类配置----------------------------------
-keep class com.nevbg.simple.bean.** {*;}
#-----------------------反射实体类配置----------------------------------
