package com.axun.saveservicetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by hz-java on 2018/9/20.
 */

public class ServiceTwo extends Service {

    public final static String TAG = "ServiceTwo";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e(TAG, "onStartCommand");

        new Thread(new ThreadTwo()).start();
        return START_STICKY;
    }

    Thread thread = new Thread(new Runnable() {

        @Override
        public void run() {

        }
    });

    private class ThreadTwo implements Runnable{

        @Override
        public void run() {
            doTask();
        }
    }

    private void doTask(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                Log.e(TAG, "ServiceTwo Run: " + System.currentTimeMillis());
                boolean b = ServiceAliveUtils.isServiceWorked(ServiceTwo.this, getPackageName()+".ServiceOne");
                if(!b) {
                    Intent service = new Intent(ServiceTwo.this, ServiceOne.class);
                    startService(service);
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Intent service = new Intent(ServiceTwo.this, ServiceOne.class);
        startService(service);
    }
}
