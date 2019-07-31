package com.levislv.statistics;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;
import com.levislv.statisticssdk.plugin.annotation.StatisticsView;

import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import butterknife.OnFocusChange;
import butterknife.OnItemClick;
import butterknife.OnItemLongClick;
import butterknife.OnItemSelected;
import butterknife.OnLongClick;
import butterknife.OnTouch;

@StatisticsPage(
        type = StatisticsPage.Type.ACTIVITY,
        id = R.layout.activity_statistics,
        name = "Statistics页",
        data = "{'a':'b', 'c':'d'}"
)
public class StatisticsActivity4 extends AppCompatActivity {
    @StatisticsView(
            name = "click",
            data = "{'e':'f', 'g':'h'}"
    )
    @OnClick(R.id.view)
    void onClick(View v) {

    }

    @StatisticsView(
            name = "longClick",
            data = "{'e':'f', 'g':'h'}"
    )
    @OnLongClick(R.id.view)
    boolean onLongClick(View v) {
        return false;
    }

    @StatisticsView(
            name = "touch",
            data = "{'e':'f', 'g':'h'}"
    )
    @OnTouch(R.id.view)
    boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @StatisticsView(
            name = "focusChange",
            data = "{'e':'f', 'g':'h'}"
    )
    @OnFocusChange(R.id.view)
    void onFocusChange(View v, boolean hasFocus) {

    }

    @StatisticsView(
            name = "editorAction",
            data = "{'e':'f', 'g':'h'}"
    )
    @OnEditorAction(R.id.view)
    boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
        return false;
    }

    @StatisticsView(
            name = "checkedChanged",
            data = "{'e':'f', 'g':'h'}"
    )
    @OnCheckedChanged(R.id.view)
    void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }

    @StatisticsView(
            parentName = "itemClick parent",
            name = "itemClick",
            data = "{'e':'f', 'g':'h'}"
    )
    @OnItemClick(R.id.view)
    void onItemClick(AdapterView<?> parent, View v, int position, long id) {

    }

    @StatisticsView(
            parentName = "itemLongClick parent",
            name = "itemLongClick",
            data = "{'e':'f', 'g':'h'}"
    )
    @OnItemLongClick(R.id.view)
    boolean onItemLongClick(AdapterView<?> parent, View v, int position, long id) {
        return false;
    }

    @StatisticsView(
            parentName = "itemSelected parent",
            name = "itemSelected",
            data = "{'e':'f', 'g':'h'}"
    )
    @OnItemSelected(value = R.id.view, callback = OnItemSelected.Callback.ITEM_SELECTED)
    void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

    }
}
