package com.example.imgstreamproject.views.adapters;

import android.util.Pair;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class InfoFragmentPagerAdapter extends FragmentStatePagerAdapter {

    private List<Pair<String, Fragment>> data;

    public InfoFragmentPagerAdapter(FragmentManager fm, List<Pair<String, Fragment>> data) {
        super(fm);
        this.data = data;
    }

    public Fragment getValueOf(String s) {
        return data.stream().filter((obj) -> obj.first.equals(s)).findFirst().get().second;
    }

    public Integer getIndexOf(String s) {
        Integer index = 0;
        index = data.indexOf(getValueOf(s));
        return index;
    }

    @Override
    public Fragment getItem(int position) {
        if (data == null)
            return null;
        return data.get(position).second;
    }

    @Override
    public int getCount() {
        if (data == null)
            return 0;
        return data.size();
    }
}
