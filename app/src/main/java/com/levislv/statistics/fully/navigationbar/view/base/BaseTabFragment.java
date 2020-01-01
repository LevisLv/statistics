package com.levislv.statistics.fully.navigationbar.view.base;

import androidx.fragment.app.Fragment;

import java.util.List;

/**
 * TabFragment 的基类
 */
public abstract class BaseTabFragment extends BaseFragment {

    protected boolean isVisibleToUser;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.isVisibleToUser = isVisibleToUser;

        if (isVisibleToUser && isResumed()) {
            List<Fragment> fragmentList = getChildFragmentManager().getFragments();
            if (!fragmentList.isEmpty()) {
                Fragment fragment = fragmentList.get(0);
                if (fragment instanceof BaseFirstFragment) {
                    BaseFirstFragment baseFirstFragment = (BaseFirstFragment) fragment;
                    if (baseFirstFragment.isResumed()) {
                        baseFirstFragment.resume();
                    }
                }
            }
        }
    }
}
