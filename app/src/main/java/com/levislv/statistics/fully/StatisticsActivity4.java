package com.levislv.statistics.fully;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.levislv.statistics.R;
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
        name = "全埋点页4",
        data = "{'pageKey0':'pageValue0', 'pageKey01':'pageValue1', 'pageKey02':'pageValue2'}"
)
public class StatisticsActivity4 extends AppCompatActivity {

    @StatisticsView(
            name = "click",
            data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
    )
    @OnClick(R.id.view)
    void onClick(View v) {

    }

    @StatisticsView(
            name = "longClick",
            data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
    )
    @OnLongClick(R.id.view)
    boolean onLongClick(View v) {
        return false;
    }

    @StatisticsView(
            name = "touch",
            data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
    )
    @OnTouch(R.id.view)
    boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @StatisticsView(
            name = "focusChange",
            data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
    )
    @OnFocusChange(R.id.view)
    void onFocusChange(View v, boolean hasFocus) {

    }

    @StatisticsView(
            name = "editorAction",
            data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
    )
    @OnEditorAction(R.id.view)
    boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
        return false;
    }

    @StatisticsView(
            name = "checkedChanged",
            data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
    )
    @OnCheckedChanged(R.id.view)
    void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }

    @StatisticsView(
            parentName = "itemClick parent",
            name = "itemClick",
            data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
    )
    @OnItemClick(R.id.view)
    void onItemClick(AdapterView<?> parent, View v, int position, long id) {

    }

    @StatisticsView(
            parentName = "itemLongClick parent",
            name = "itemLongClick",
            data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
    )
    @OnItemLongClick(R.id.view)
    boolean onItemLongClick(AdapterView<?> parent, View v, int position, long id) {
        return false;
    }

    @StatisticsView(
            parentName = "itemSelected parent",
            name = "itemSelected",
            data = "{'key0':'value0', 'key1':'value1', 'key2':'value2'}"
    )
    @OnItemSelected(value = R.id.view, callback = OnItemSelected.Callback.ITEM_SELECTED)
    void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

    }
}
