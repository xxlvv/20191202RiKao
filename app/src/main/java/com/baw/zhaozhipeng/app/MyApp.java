package com.baw.zhaozhipeng.app;

import android.app.Application;
import android.content.Context;

/**
 * Copyright (C)
 * <p>
 * FileName: MyApp
 * <p>
 * Author: zhaozhipeng
 * <p>
 * Date: 2019/12/2 8:42
 */
public class MyApp extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
