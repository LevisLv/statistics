package com.levislv.statistics.fully.navigationbar.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.levislv.statistics.fully.navigationbar.view.TabFragment;

public class NavigationBarPagerAdapter extends FragmentPagerAdapter {

    public NavigationBarPagerAdapter(FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return TabFragment.newInstance("会员");
            case 1:
                return TabFragment.newInstance("消息");
            case 2:
                return TabFragment.newInstance("反馈");
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}