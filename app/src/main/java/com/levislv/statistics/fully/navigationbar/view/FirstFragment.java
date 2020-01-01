package com.levislv.statistics.fully.navigationbar.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.levislv.statistics.R;
import com.levislv.statistics.fully.navigationbar.view.base.BaseFirstFragment;
import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;

@StatisticsPage(
        type = StatisticsPage.Type.FRAGMENT,
        id = R.layout.fragment_first,
        name = "TabFirst页",
        data = "{'pageKey0':'pageValue0', 'pageKey01':'pageValue1', 'pageKey02':'pageValue2'}"
)
public class FirstFragment extends BaseFirstFragment implements View.OnClickListener {

    private static final String TAG = "FirstFragment";

    private static final String KEY_PAGE_TEXT = "key_page_text";

    private TextView tvPageText;
    private Button btnForward;

    private CharSequence pageText;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_forward:
                String tag, name;
                tag = name = String.valueOf(pageText) + (getFragmentManager().getBackStackEntryCount() + 2) + "级";
                getFragmentManager().beginTransaction()
                        .replace(R.id.layout_frag, NotFirstFragment.newInstance(pageText), tag)
                        .addToBackStack(name)
                        .commitAllowingStateLoss();
                break;
            default:

                break;
        }
    }

    public static BaseFirstFragment newInstance(CharSequence pageText) {
        BaseFirstFragment firstFragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putCharSequence(KEY_PAGE_TEXT, pageText);
        firstFragment.setArguments(args);
        return firstFragment;
    }

    @Override
    protected void initData() {
        Bundle args = getArguments();
        if (args != null && args.containsKey(KEY_PAGE_TEXT)) {
            pageText = args.getCharSequence(KEY_PAGE_TEXT);
        }
    }

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_first;
    }

    @Override
    protected void bindView(View view) {
        tvPageText = view.findViewById(R.id.tv_page_text);
        btnForward = view.findViewById(R.id.btn_forward);
    }

    @Override
    protected void initView() {
        tvPageText.setText(pageText);
        btnForward.setOnClickListener(this);
    }

    @Override
    public void resume() {
        Log.d(TAG, pageText + " resume");
    }
}
