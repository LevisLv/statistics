package com.levislv.statistics;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;

@StatisticsPage(
        type = StatisticsPage.Type.ACTIVITY,
        id = R.layout.activity_main,
        name = "首页",
        data = "{'a':'b', 'c':'d'}"
)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
