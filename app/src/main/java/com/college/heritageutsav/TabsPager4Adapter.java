package com.college.heritageutsav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.college.heritageutsav.Cultural.DanceDay6Fragment;
import com.college.heritageutsav.Cultural.DramaDay4Fragment;
import com.college.heritageutsav.Cultural.FilmDay4Fragment;
import com.college.heritageutsav.Cultural.LiteraryDay4Fragment;
import com.college.heritageutsav.Cultural.MusicDay4Fragment;

class TabsPager4Adapter extends FragmentPagerAdapter {

    public TabsPager4Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                return new MusicDay4Fragment();
            case 1:
                return new LiteraryDay4Fragment();
            case 2:
                return new FilmDay4Fragment();
            case 3:
                return new DramaDay4Fragment();
            case 4:
                return new DanceDay6Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Music";
            case 1:
                return "Literary";
            case 2:
                return "Film/Photo";
            case 3:
                return "Drama";
            case 4:
                return "Dance";
            default:
                return null;
        }
    }
}

