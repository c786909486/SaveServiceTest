package com.axun.saveservicetest;

import android.content.Context;
import android.content.Intent;

/**
 * Created by hz-java on 2018/9/20.
 */

public class StartServiceUtils {

    public static void startServices(Context context){
        boolean alive1 = ServiceAliveUtils.isServiceWorked(context,context.getPackageName()+".ServiceOne");
        boolean alive2 = ServiceAliveUtils.isServiceWorked(context,context.getPackageName()+".ServiceTwo");
        if (!alive1){
            Intent serviceOne = new Intent();
            serviceOne.setClass(context, ServiceOne.class);
            context.startService(serviceOne);
        }

        if (!alive2){
            Intent serviceTwo = new Intent();
            serviceTwo.setClass(context, ServiceTwo.class);
            context.startService(serviceTwo);
        }
    }
}
