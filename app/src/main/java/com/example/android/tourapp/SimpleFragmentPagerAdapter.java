package com.example.android.tourapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 7;
    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StartScreenFrag();
        } else if (position == 1) {
            return new GrundyScreenFrag();
        } else if (position == 2) {
            return new GraffittiScreenFrag();
        } else if (position == 3) {
            return new GrandScreenFrag();
        } else if (position == 4) {
            return new TramScreenFrag();
        } else if (position == 5) {
            return new ForgottenScreenFrag();
        } else {
            return new CinemaScreenFrag();
        }
    }

    @Override
    public int getCount() {
        return 7;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.tab1);
        } else if (position == 1) {
            return mContext.getString(R.string.tab2);
        } else if (position == 2) {
            return mContext.getString(R.string.tab3);
        } else if (position == 3) {
            return mContext.getString(R.string.tab4);
        } else if (position == 4) {
            return mContext.getString(R.string.tab5);
        } else if (position == 5) {
            return mContext.getString(R.string.tab6);
        } else {
            return mContext.getString(R.string.tab7);
        }
    }
}