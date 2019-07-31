package com.levislv.statistics;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;

@StatisticsPage(
        type = StatisticsPage.Type.ACTIVITY,
        id = R.layout.activity_statistics,
        name = "Statistics页",
        data = "{'a':'b', 'c':'d'}"
)
public class StatisticsActivity2 extends AppCompatActivity {
    private void test() {
        new View(this).setOnClickListener(v -> {

        });
        new View(this).setOnLongClickListener(v -> false);
        new View(this).setOnTouchListener((v, event) -> false);
        new View(this).setOnFocusChangeListener((v, hasFocus) -> {
        });
        new TextView(this).setOnEditorActionListener((v, actionId, event) -> false);
        new CheckBox(this).setOnCheckedChangeListener((buttonView, isChecked) -> {

        });
        new RadioGroup(this).setOnCheckedChangeListener((group, checkedId) -> {

        });
        new RatingBar(this).setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {

        });
        new ListView(this).setOnItemClickListener((parent, view, position, id) -> {

        });
        new ListView(this).setOnItemLongClickListener((parent, view, position, id) -> false);
        new ExpandableListView(this).setOnGroupClickListener((parent, v, groupPosition, id) -> false);
        new ExpandableListView(this).setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> false);
    }
}
