package com.levislv.statistics.fully.navigationbar.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;

import com.levislv.statistics.R;
import com.levislv.statistics.fully.navigationbar.view.base.BaseFragment;
import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;

@StatisticsPage(
        type = StatisticsPage.Type.FRAGMENT,
        id = R.layout.fragment_notfirst,
        name = "TabNotFirst页",
        data = "{'pageKey0':'pageValue0', 'pageKey01':'pageValue1', 'pageKey02':'pageValue2'}"
)
public class NotFirstFragment extends BaseFragment implements View.OnClickListener {

    private static final String TAG = "NotFirstFragment";

    private static final String KEY_PAGE_TEXT = "key_page_text";

    private AppCompatImageView ivTitleBackward;
    private TextView tvTitle;
    private Button btnForward;

    private CharSequence pageText;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_title_backward:
                getFragmentManager().popBackStack();
                break;
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

    public static BaseFragment newInstance(CharSequence pageText) {
        BaseFragment notFirstFragment = new NotFirstFragment();
        Bundle args = new Bundle();
        args.putCharSequence(KEY_PAGE_TEXT, pageText);
        notFirstFragment.setArguments(args);
        return notFirstFragment;
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
        return R.layout.fragment_notfirst;
    }

    @Override
    protected void bindView(View view) {
        ivTitleBackward = view.findViewById(R.id.iv_title_backward);
        tvTitle = view.findViewById(R.id.tv_title);
        btnForward = view.findViewById(R.id.btn_forward);
    }

    @Override
    protected void initView() {
        ivTitleBackward.setOnClickListener(this);
        tvTitle.setText(String.valueOf(pageText) + (getFragmentManager().getBackStackEntryCount() + 1) + "级");
        btnForward.setOnClickListener(this);
    }
}
