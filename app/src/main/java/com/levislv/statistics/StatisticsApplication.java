package com.levislv.statistics;

import android.app.Application;

import com.levislv.statisticssdk.Statistics;

/**
 * @author levislv
 * @email  levislv@levislv.com
 * @blog   https://blog.levislv.com/
 * @github https://github.com/levislv/
 */
public class StatisticsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Statistics.sharedInstance().init(this, "", "");
    }
}
