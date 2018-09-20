package com.axun.saveservicetest;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by hz-java on 2018/9/20.
 */

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class ScheduleService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
