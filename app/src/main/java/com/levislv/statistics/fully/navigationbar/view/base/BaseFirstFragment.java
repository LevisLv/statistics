package com.levislv.statistics.fully.navigationbar.view.base;

import androidx.fragment.app.Fragment;

/**
 * TabFragment 内部第一级第一个 Fragment 的基类
 */
public abstract class BaseFirstFragment extends BaseFragment {

    public abstract void resume();

    @Override
    public void onResume() {
        super.onResume();
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof BaseTabFragment) {
            if (((BaseTabFragment) parentFragment).isVisibleToUser) {
                resume();
            }
        } else if (parentFragment == null) {
            resume();
        }
    }
}
