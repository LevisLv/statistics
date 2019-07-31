package com.levislv.statistics;

import android.app.Application;

import com.levislv.statisticssdk.Statistics;

/**
 * @author levislv
 */
public class StatisticsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Statistics.sharedInstance().init(this, "", "");
    }
}
