package com.college.heritageutsav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class TabsPager3Adapter extends FragmentPagerAdapter {

    public TabsPager3Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                return new TechDay3Fragment();
            case 1:
                return new GameDay3Fragment();
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
