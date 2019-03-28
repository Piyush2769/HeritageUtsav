package com.college.heritageutsav.Team;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.college.heritageutsav.R;

import com.college.heritageutsav.Team.TabsTeam;

public class TeamActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabsTeam myTabsTeam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        AppBarLayout appBarLayout=findViewById(R.id.apparid);

        viewPager=findViewById(R.id.viewPagerTeam);
        myTabsTeam =new TabsTeam(getSupportFragmentManager());
        viewPager.setAdapter(myTabsTeam);

        tabLayout=findViewById(R.id.tabsteam);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setOffscreenPageLimit(1);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
