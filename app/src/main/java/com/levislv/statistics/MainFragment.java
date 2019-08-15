package com.levislv.statistics;

import androidx.fragment.app.Fragment;

import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;

@StatisticsPage(
        type = StatisticsPage.Type.FRAGMENT,
        id = R.layout.fragment_main,
        name = "首页",
        data = "{'a':'b', 'c':'d'}"
)
public class MainFragment extends Fragment {

}
