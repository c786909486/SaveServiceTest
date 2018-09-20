package com.axun.saveservicetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by hz-java on 2018/9/20.
 */

public class TimeChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"更新时间",Toast.LENGTH_SHORT).show();
        Log.d("dsdad","更新是啊");
        StartServiceUtils.startServices(context);
    }
}
