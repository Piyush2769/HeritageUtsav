package com.college.heritageutsav;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.college.heritageutsav.Cultural.DanceDay5Fragment;
import com.college.heritageutsav.Cultural.DramaDay5Fragment;
import com.college.heritageutsav.Cultural.FilmDay5Fragment;
import com.college.heritageutsav.Cultural.MusicDay5Fragment;
import com.college.heritageutsav.Cultural.OthersDay5Fragment;

class TabsPager5Adapter extends FragmentPagerAdapter {

    public TabsPager5Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                return new MusicDay5Fragment();
            case 1:
                return new DanceDay5Fragment();
            case 2:
                return new FilmDay5Fragment();
            case 3:
                return new DramaDay5Fragment();
            case 4:
                return new OthersDay5Fragment();
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
                return "Dance";
            case 2:
                return "Film/Photo";
            case 3:
                return "Drama";
            case 4:
                return "HFC";
            default:
                return null;
        }
    }
}

