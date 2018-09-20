package com.axun.saveservicetest;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;

/**
 * Created by hz-java on 2018/9/20.
 */

public class MyApp extends Application {

    private TimeChangeReceiver receiver;
    @Override
    public void onCreate() {
        super.onCreate();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_TIME_TICK);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        filter.addAction(Intent.ACTION_SCREEN_ON);
        receiver = new TimeChangeReceiver();
        registerReceiver(receiver,filter);
        StartServiceUtils.startServices(this);
    }
}
