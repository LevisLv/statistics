package com.levislv.statistics.fully;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.levislv.statistics.R;
import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;
import com.levislv.statisticssdk.plugin.annotation.StatisticsView;

@StatisticsPage(
        type = StatisticsPage.Type.ACTIVITY,
        id = R.layout.activity_statistics,
        name = "全埋点页1",
        data = "{'pageKey0':'pageValue0', 'pageKey01':'pageValue1', 'pageKey02':'pageValue2'}"
)
public class StatisticsActivity1 extends AppCompatActivity {
    private void test() {
        new View(this).setOnClickListener(new View.OnClickListener() {
            @StatisticsView(
                    name = "click",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onClick(View v) {

            }
        });
        new View(this).setOnLongClickListener(new View.OnLongClickListener() {
            @StatisticsView(
                    name = "longClick",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
        new View(this).setOnTouchListener(new View.OnTouchListener() {
            @StatisticsView(
                    name = "touch",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });
        new View(this).setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @StatisticsView(
                    name = "focusChange",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

            }
        });
        new TextView(this).setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @StatisticsView(
                    name = "editorAction",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                return false;
            }
        });
        new CheckBox(this).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @StatisticsView(
                    name = "checkedChanged",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
        new RadioGroup(this).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @StatisticsView(
                    name = "checkedChanged",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        });
        new SeekBar(this).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @StatisticsView(
                    name = "progressChanged",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @StatisticsView(
                    name = "startTrackingTouch",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @StatisticsView(
                    name = "stopTrackingTouch",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        new RatingBar(this).setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @StatisticsView(
                    name = "ratingChanged",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }
        });
        new ListView(this).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @StatisticsView(
                    parentName = "itemClick parent",
                    name = "itemClick",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

            }
        });
        new ListView(this).setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @StatisticsView(
                    parentName = "itemLongClick parent",
                    name = "itemLongClick",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View v, int position, long id) {
                return false;
            }
        });
        new ListView(this).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @StatisticsView(
                    parentName = "itemSelected parent",
                    name = "itemSelected",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        new ExpandableListView(this).setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @StatisticsView(
                    parentName = "groupClick parent",
                    name = "groupClick",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return false;
            }
        });
        new ExpandableListView(this).setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @StatisticsView(
                    parentName = "childClick parent",
                    name = "childClick",
                    data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
            )
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                return false;
            }
        });
    }
}
