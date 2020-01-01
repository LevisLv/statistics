package com.levislv.statistics.fully.navigationbar.view;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.levislv.statistics.R;
import com.levislv.statistics.fully.navigationbar.adapter.NavigationBarPagerAdapter;
import com.levislv.statistics.fully.navigationbar.view.base.BaseTabFragment;
import com.levislv.statisticssdk.plugin.annotation.StatisticsPage;

import java.util.List;

@StatisticsPage(
        type = StatisticsPage.Type.ACTIVITY,
        id = R.layout.activity_navigationbar,
        name = "导航栏页",
        data = "{'pageKey0':'pageValue0', 'pageKey01':'pageValue1', 'pageKey02':'pageValue2'}"
)
public class NavigationBarActivity extends FragmentActivity {

    private BottomNavigationView navigationBar;
    private ViewPager viewPager;

    private long exitTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationbar);

        navigationBar = findViewById(R.id.navigation_bar);
        viewPager = findViewById(R.id.view_pager);

        navigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.item_member:
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.item_message:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.item_feedback:
                        viewPager.setCurrentItem(2);
                        return true;
                    default:

                        break;
                }
                return false;
            }
        });

        NavigationBarPagerAdapter pagerAdapter = new NavigationBarPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(pagerAdapter.getCount());
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                navigationBar.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        Fragment fragment = fragments.get(viewPager.getCurrentItem());
        if (fragment instanceof BaseTabFragment) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            if (childFragmentManager.getBackStackEntryCount() != 0) {
                childFragmentManager.popBackStack();
                return;
            }
        }
        long exitTime = System.currentTimeMillis();
        if (exitTime - this.exitTime < 1000L) {
            super.onBackPressed();
        } else {
            this.exitTime = exitTime;
            Toast.makeText(this, "再按一次退出应用", Toast.LENGTH_SHORT).show();
        }
    }
}
