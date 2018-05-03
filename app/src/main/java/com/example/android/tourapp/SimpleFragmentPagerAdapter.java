package com.example.android.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Intro", "Gallery", "Wall Art", "Theatre", "Trams","Art Deco","Antiques" };
    private Context context;


    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StartScreenFrag();
        } else if (position == 1){
            return new GrundyScreenFrag();
        } else if (position == 2){
            return new GraffittiScreenFrag();
        } else if (position == 3){
            return new GrandScreenFrag();
        } else if (position == 4){
            return new TramScreenFrag();
        } else if (position == 5){
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
        // Generate title based on item position
        return tabTitles[position];
    }
}
