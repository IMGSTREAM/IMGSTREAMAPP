package com.example.imgstreamproject.view.activity;

import android.os.Bundle;
import android.util.Pair;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTabHost;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.util.ToastUtil;
import com.example.imgstreamproject.view.BaseActivity;
import com.example.imgstreamproject.view.adapter.InfoFragmentPagerAdapter;
import com.example.imgstreamproject.view.fragment.AppInfoFragment;
import com.example.imgstreamproject.view.fragment.ImgurInfoFragment;
import com.example.imgstreamproject.view.transformer.ZoomOutPageTransformer;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends BaseActivity {

    //    FRAGMENT
    private List<Pair<String, Fragment>> fragments;

    //    VIEW
    private FragmentTabHost fragmentTabHost;
    private ViewPager fragmentContainer;

    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        initFragment();

        initView();
    }

    private void initFragment() {
        fragments = new ArrayList<>();
        fragments.add(new Pair<>("APP", new AppInfoFragment()));
        fragments.add(new Pair<>("IMGUR", new ImgurInfoFragment()));
        fragments.add(new Pair<>("YOU", new AppInfoFragment()));
        fragments.add(new Pair<>("MUST", new ImgurInfoFragment()));
        fragments.add(new Pair<>("DIE", new AppInfoFragment()));
    }

    private void initView() {
        fragmentTabHost = findViewById(R.id.activity_info_fragment_nav);
        fragmentContainer = findViewById(R.id.activity_info_fragment_container);
        fragmentContainer.setPageTransformer(true, new ZoomOutPageTransformer());

        pagerAdapter = new InfoFragmentPagerAdapter(getSupportFragmentManager(), fragments);

        fragmentContainer.setAdapter(pagerAdapter);
        fragmentContainer.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                invalidateOptionsMenu();
                fragmentTabHost.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        fragmentTabHost.setOnTabChangedListener(s -> {
            ToastUtil.toast(this, s);
            fragmentContainer.setCurrentItem(fragmentTabHost.getCurrentTab(), true);
        });

        fragmentTabHost.setup(this, getSupportFragmentManager());

        for (Pair<String, Fragment> obj : fragments) {
            fragmentTabHost.addTab(fragmentTabHost.newTabSpec(obj.first).setIndicator(obj.first, null), obj.second.getClass(), null);
        }

    }

    public Fragment getValueOf(String s) {
        return fragments.stream().filter((obj) -> obj.first.equals(s)).findFirst().get().second;
    }

    public Integer getIndexOf(String s) {
        Integer index = 0;
        index = fragments.indexOf(getValueOf(s));
        return index;
    }

}
