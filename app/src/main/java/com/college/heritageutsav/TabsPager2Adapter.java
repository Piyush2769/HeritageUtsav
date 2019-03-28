package com.college.heritageutsav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class TabsPager2Adapter extends FragmentPagerAdapter {

    public TabsPager2Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                return new TechDay2Fragment();
            case 1:
                return new GameDay2Fragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Technical";
            case 1:
                return "Gaming";
                default:
                    return null;
        }
    }
}
