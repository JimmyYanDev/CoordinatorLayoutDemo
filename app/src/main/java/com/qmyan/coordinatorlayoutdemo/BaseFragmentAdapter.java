package com.qmyan.coordinatorlayoutdemo;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import java.util.List;

/**
 * Created by MichealYan on 2018/12/10.
 * Email: 956462326@qq.com
 * Describe:
 **/
public class BaseFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> mData;
    private  String[] mTitles;

    public BaseFragmentAdapter(FragmentManager fm, List<Fragment> data, String[] titles) {
        super(fm);
        mData = data;
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
