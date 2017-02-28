package com.example.david.dawidpiechaczekcv.view_pager_utils;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.david.dawidpiechaczekcv.view_pager_utils.PlaceholderFragment;

/**
 * Created by Dawid on 07.02.2017.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PlaceholderFragment.newInstance(mContext, position + 1);
    }

    @Override
    public int getCount() {
        return 3;
    }
}