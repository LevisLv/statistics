package com.levislv.statistics.code;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.levislv.statistics.R;
import com.levislv.statisticssdk.Statistics;
import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ly.count.android.sdk.Countly;

@StatisticsPage(
        type = StatisticsPage.Type.ACTIVITY,
        id = R.layout.activity_code,
        name = "代码埋点页",
        data = "{'pageKey0':'pageValue0', 'pageKey01':'pageValue1', 'pageKey02':'pageValue2'}"
)
public class CodeActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        findViewById(R.id.btn_set_user_data).setOnClickListener(this);
        findViewById(R.id.btn_set_custom_user_data).setOnClickListener(this);
        findViewById(R.id.btn).setOnClickListener(this);
        findViewById(R.id.btn_count).setOnClickListener(this);
        findViewById(R.id.btn_count_sum).setOnClickListener(this);
        findViewById(R.id.btn_seg_count).setOnClickListener(this);
        findViewById(R.id.btn_seg_count_sum).setOnClickListener(this);
        findViewById(R.id.btn_seg_count_sum_dur).setOnClickListener(this);
        findViewById(R.id.btn_seg3_count_sum_dur).setOnClickListener(this);
        findViewById(R.id.btn_start).setOnClickListener(this);
        findViewById(R.id.btn_end).setOnClickListener(this);
        findViewById(R.id.btn_seg_count_sum_end).setOnClickListener(this);
        findViewById(R.id.btn_seg3_count_sum_end).setOnClickListener(this);
        findViewById(R.id.btn_exception_handled).setOnClickListener(this);
        findViewById(R.id.btn_exception_unhandled).setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Statistics.sharedInstance().onStart(this);
    }

    @Override
    protected void onStop() {
        Statistics.sharedInstance().onStop();
        super.onStop();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_set_user_data: {
                Map<String, String> userData = new HashMap<>(1);
                userData.put("name", "LevisLv");
                Countly.userData.setUserData(userData);
                Countly.userData.save();
                break;
            }
            case R.id.btn_set_custom_user_data: {
                Map<String, String> customUserData = new HashMap<>(1);
                customUserData.put("custom_key", "custom_value");
                Countly.userData.setCustomUserData(customUserData);
                Countly.userData.save();
                break;
            }
            case R.id.btn: {
                Statistics.sharedInstance().recordEvent("count");
                break;
            }
            case R.id.btn_count: {
                Statistics.sharedInstance().recordEvent("count", 1);
                break;
            }
            case R.id.btn_count_sum: {
                Statistics.sharedInstance().recordEvent("count_sum", 1, 0.1);
                break;
            }
            case R.id.btn_seg_count: {
                HashMap<String, String> segCount = new HashMap<>(2);
                segCount.put("name", "segCount");
                segCount.put("action", "seg_count");
                Statistics.sharedInstance().recordEvent("seg_count", segCount, 1);
                break;
            }
            case R.id.btn_seg_count_sum: {
                HashMap<String, String> segCountSum = new HashMap<>(2);
                segCountSum.put("name", "segCountSum");
                segCountSum.put("action", "seg_count_sum");
                Statistics.sharedInstance().recordEvent("seg_count_sum", segCountSum, 1, 0.1);
                break;
            }
            case R.id.btn_seg_count_sum_dur: {
                HashMap<String, String> segCountSumDur = new HashMap<>(2);
                segCountSumDur.put("name", "segCountSumDur");
                segCountSumDur.put("action", "seg_count_sum_dur");
                Statistics.sharedInstance().recordEvent("seg_count_sum_dur", segCountSumDur, 1, 0.1, 1000);
                break;
            }
            case R.id.btn_seg3_count_sum_dur: {
                HashMap<String, String> segCountSumDur = new HashMap<>(2);
                segCountSumDur.put("name", "segCountSumDur");
                segCountSumDur.put("action", "seg_count_sum_dur");
                HashMap<String, Integer> segIntCountSumDur = new HashMap<>(2);
                segIntCountSumDur.put("name", 0);
                segIntCountSumDur.put("action", 1);
                HashMap<String, Double> segDoubleCountSumDur = new HashMap<>(2);
                segDoubleCountSumDur.put("name", 0.0);
                segDoubleCountSumDur.put("action", 0.1);
                Statistics.sharedInstance().recordEvent("seg3_count_sum_dur", segCountSumDur, segIntCountSumDur, segDoubleCountSumDur, 1, 0.1, 1000);
                break;
            }
            case R.id.btn_start: {
                Statistics.sharedInstance().startEvent("start_end");
                break;
            }
            case R.id.btn_end: {
                Statistics.sharedInstance().endEvent("start_end");
                break;
            }
            case R.id.btn_seg_count_sum_end: {
                HashMap<String, String> segCountSumEnd = new HashMap<>(2);
                segCountSumEnd.put("name", "segCountSumEnd");
                segCountSumEnd.put("action", "seg_count_sum_end");
                Statistics.sharedInstance().endEvent("start_end", segCountSumEnd, 1, 0.1);
                break;
            }
            case R.id.btn_seg3_count_sum_end: {
                HashMap<String, String> segCountSumEnd = new HashMap<>(2);
                segCountSumEnd.put("name", "segCountSumEnd");
                segCountSumEnd.put("action", "seg_count_sum_end");
                HashMap<String, Integer> segIntCountSumEnd = new HashMap<>(2);
                segIntCountSumEnd.put("name", 0);
                segIntCountSumEnd.put("action", 1);
                HashMap<String, Double> segDoubleCountSumEnd = new HashMap<>(2);
                segDoubleCountSumEnd.put("name", 0.0);
                segDoubleCountSumEnd.put("action", 0.1);
                Statistics.sharedInstance().endEvent("start_end", segCountSumEnd, segIntCountSumEnd, segDoubleCountSumEnd, 1, 0.1);
                break;
            }
            case R.id.btn_exception_handled: {
                try {
                    new ArrayList<>().addAll(null);
                } catch (Throwable throwable) {
                    Statistics.sharedInstance().recordHandledException(throwable);
                }
                break;
            }
            case R.id.btn_exception_unhandled: {
                new ArrayList<>().addAll(null);
                break;
            }
            default:

                break;
        }
    }
}
