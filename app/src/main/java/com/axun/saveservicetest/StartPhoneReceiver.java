package com.axun.saveservicetest;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by hz-java on 2018/9/17.
 */

public class StartPhoneReceiver extends BroadcastReceiver {
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("startListrner","开机自启动成功");
//        Intent intent1 = new Intent(context,MainActivity.class);
//        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        context.startActivity(intent1);
        Toast.makeText(context,"开机自启动成功",Toast.LENGTH_SHORT).show();
        StartServiceUtils.startServices(context);
    }
}
