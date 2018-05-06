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
    private static Context context;


//        private String tabTitles[] = new String[] {
//            getContext().getResources().getString(R.string.tab1),
//                getContext().getResources().getString(R.string.tab2),
//                getContext().getResources().getString(R.string.tab3),
//                getContext().getResources().getString(R.string.tab4),
//                getContext().getResources().getString(R.string.tab5),
//                getContext().getResources().getString(R.string.tab6),
//                getContext().getResources().getString(R.string.tab7),
//            };

    private String tabTitles[] = new String[]{
            context.getString(R.string.tab1), context.getString(R.string.tab2), context.getString(R.string.tab3), context.getString(R.string.tab4), context.getString(R.string.tab5),
            context.getString(R.string.tab6), context.getString(R.string.tab7)};


    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
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

    public Context getContext() {
        return context;
    }

    @Override
    public int getCount() {
        return 7;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
