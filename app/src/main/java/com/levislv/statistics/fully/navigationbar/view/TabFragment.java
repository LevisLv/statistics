package com.levislv.statistics.fully.navigationbar.view;

import android.os.Bundle;

import com.levislv.statistics.R;
import com.levislv.statistics.fully.navigationbar.view.base.BaseFirstFragment;
import com.levislv.statistics.fully.navigationbar.view.base.BaseTabFragment;

/**
 * 每个 tab 最外层的 Fragment
 */
public class TabFragment extends BaseTabFragment {

    private static final String KEY_PAGE_TEXT = "key_page_text";

    private CharSequence pageText;
    private BaseFirstFragment firstFragment;

    public static BaseTabFragment newInstance(CharSequence pageText) {
        BaseTabFragment tabFragment = new TabFragment();
        Bundle args = new Bundle();
        args.putCharSequence(KEY_PAGE_TEXT, pageText);
        tabFragment.setArguments(args);
        return tabFragment;
    }

    @Override
    protected void initData() {
        Bundle args = getArguments();
        if (args != null) {
            if (args.containsKey(KEY_PAGE_TEXT)) {
                pageText = args.getCharSequence(KEY_PAGE_TEXT);
                firstFragment = FirstFragment.newInstance(pageText);
            }
        }
    }

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_tab;
    }

    @Override
    protected void initView() {
        String tag = String.valueOf(pageText) + (1) + "级";
        getChildFragmentManager().beginTransaction()
                .replace(R.id.layout_frag, firstFragment, tag)
                .commitAllowingStateLoss();
    }
}
