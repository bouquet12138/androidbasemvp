package com.example.xiaohan.mvpmobile.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by xiaohan on 2018/9/25.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }

}