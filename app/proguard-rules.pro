# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

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
#-----------------------第三方混淆配置----------------------------------

#-----------------------反射实体类配置----------------------------------
-keep class com.nevbg.simple.bean.** {*;}
#-----------------------反射实体类配置----------------------------------
