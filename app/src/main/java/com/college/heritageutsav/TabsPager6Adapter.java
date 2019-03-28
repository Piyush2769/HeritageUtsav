package com.college.heritageutsav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.college.heritageutsav.Cultural.DanceDay6Fragment;
import com.college.heritageutsav.Cultural.FilmDay6Fragment;
import com.college.heritageutsav.Cultural.MusicDay6Fragment;
import com.college.heritageutsav.Cultural.OthersDay6Fragment;

class TabsPager6Adapter extends FragmentPagerAdapter {

    public TabsPager6Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                return new MusicDay6Fragment();
            case 1:
                return new FilmDay6Fragment();
            case 2:
                return new OthersDay6Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Music";
            case 1:
                return "Film/Photo";
            case 2:
                return "Others";
            default:
                return null;
        }
    }
}

