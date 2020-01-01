package com.levislv.statistics;

import android.app.Application;
import android.os.Build;

import com.levislv.statisticssdk.Statistics;

/**
 * @author LevisLv
 * @email  levislv@levislv.com
 * @blog   https://blog.levislv.com/
 * @book   https://book.levislv.com/
 * @github https://github.com/LevisLv/
 */
public class StatisticsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Statistics.init(this, "https://count.ly/", "app_key", Build.DEVICE);
    }
}
