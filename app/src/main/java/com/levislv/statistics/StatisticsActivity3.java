package com.levislv.statistics;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;
import com.levislv.statisticssdk.plugin.annotation.StatisticsView;

@StatisticsPage(
        type = StatisticsPage.Type.ACTIVITY,
        id = R.layout.activity_statistics,
        name = "Statistics页",
        data = "{'a':'b', 'c':'d'}"
)
public class StatisticsActivity3 extends AppCompatActivity implements
        View.OnClickListener,
        View.OnLongClickListener,
        View.OnTouchListener,
        View.OnFocusChangeListener,
        TextView.OnEditorActionListener,
        CompoundButton.OnCheckedChangeListener,
        RadioGroup.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener,
        RatingBar.OnRatingBarChangeListener,
        AdapterView.OnItemClickListener,
        AdapterView.OnItemLongClickListener,
        AdapterView.OnItemSelectedListener,
        ExpandableListView.OnGroupClickListener,
        ExpandableListView.OnChildClickListener {

    @StatisticsView(
            name = "click",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onClick(View v) {

    }

    @StatisticsView(
            name = "longClick",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    @StatisticsView(
            name = "touch",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public boolean onTouch(View v, MotionEvent motionEvent) {
        return false;
    }

    @StatisticsView(
            name = "focusChange",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onFocusChange(View v, boolean hasFocus) {

    }

    @StatisticsView(
            name = "editorAction",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent keyEvent) {
        return false;
    }

    @StatisticsView(
            name = "checkedChanged",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

    }

    @StatisticsView(
            name = "checkedChanged",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

    }

    @StatisticsView(
            name = "progressChanged",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @StatisticsView(
            name = "startTrackingTouch",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @StatisticsView(
            name = "stopTrackingTouch",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @StatisticsView(
            name = "ratingChanged",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

    }

    @StatisticsView(
            parentName = "itemClick parent",
            name = "itemClick",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

    }

    @StatisticsView(
            parentName = "itemLongClick parent",
            name = "itemLongClick",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View v, int position, long id) {
        return false;
    }

    @StatisticsView(
            parentName = "itemSelectedClick parent",
            name = "itemSelectedClick",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @StatisticsView(
            parentName = "groupClick parent",
            name = "groupClick",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
        return false;
    }

    @StatisticsView(
            parentName = "childClick parent",
            name = "childClick",
            data = "{'e':'f', 'g':'h'}"
    )
    @Override
    public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
        return false;
    }
}
