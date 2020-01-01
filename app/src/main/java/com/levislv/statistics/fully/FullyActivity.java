package com.levislv.statistics.fully;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.levislv.statistics.R;
import com.levislv.statistics.fully.navigationbar.view.NavigationBarActivity;
import com.levislv.statisticssdk.Statistics;
import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;

@StatisticsPage(
        type = StatisticsPage.Type.ACTIVITY,
        id = R.layout.activity_fully,
        name = "全埋点页",
        data = "{'pageKey0':'pageValue0', 'pageKey01':'pageValue1', 'pageKey02':'pageValue2'}"
)
public class FullyActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fully);

        findViewById(R.id.btn_to_navibar).setOnClickListener(this);
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
            case R.id.btn_to_navibar:
                startActivity(new Intent(this, NavigationBarActivity.class));
                break;
            default:

                break;
        }
    }
}
