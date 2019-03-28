package com.college.heritageutsav.Team;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.college.heritageutsav.GameDay2Fragment;
import com.college.heritageutsav.TechDay2Fragment;

class TabsTeam extends FragmentPagerAdapter {

    public TabsTeam(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                return new Administration();
            case 1:
                return new Core();
            case 2:
                return new Club();
            case 3:
                return new App();
            case 4:
                return new Web();
            case 5:
                return new Special();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 6;
    }

    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "Administration";
            case 1:
                return "Core Team";
            case 2:
                return "Club Coordinators";
            case 3:
                return "App Team";
            case 4:
                return "Web Team";
            case 5:
                return "Special Mentions";
            default:
                return null;
        }
    }
}