package com.college.heritageutsav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.college.heritageutsav.Team.TeamActivity;
import com.squareup.picasso.Picasso;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    ViewPager viewPager;
    LinearLayout slideDots;
    private int dotsCount;
    private ImageView[] dots;
    ImageButton registrationImage,eventsImage;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Heritage Utsav 2k19");
        setSupportActionBar(toolbar);

        registrationImage=findViewById(R.id.registrationImage);
        eventsImage=findViewById(R.id.eventsImage);

        eventsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,EventActivity.class);
                startActivity(i);
            }
        });

        registrationImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://61.12.70.61:615/HeritageUtsav19EvtRegd.aspx"));
                startActivity(browserIntent);
            }
        });

        viewPager=findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        slideDots=findViewById(R.id.sliderDots);
        dotsCount=viewPagerAdapter.getCount();
        dots=new ImageView[dotsCount];

        for(int i=0;i<dotsCount;i++)
        {
            dots[i]=new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.default_dots));

            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8,0,8,0);
            slideDots.addView(dots[i],params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dots));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                for(int p=0;p<dotsCount;p++)
                {
                    dots[p].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.default_dots));
                }
                dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dots));
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),2000,4000);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about)
        {
            Intent i=new Intent(MainActivity.this,AboutActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_events)
        {
            Intent i=new Intent(MainActivity.this,EventActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_special_nights)
        {
            Intent i=new Intent(MainActivity.this,SpecialNightActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_team)
        {
            Intent i=new Intent(MainActivity.this, TeamActivity.class);
            startActivity(i);

        }
        else if (id == R.id.nav_sponsors)
        {
        }
        else if (id == R.id.nav_share)
        {

        }
        else if (id == R.id.nav_contact)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public class MyTimerTask extends TimerTask
    {

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager.getCurrentItem() ==0) {
                        viewPager.setCurrentItem(1);
                    }else if(viewPager.getCurrentItem() ==1) {
                        viewPager.setCurrentItem(2);
                    }else if(viewPager.getCurrentItem() ==2) {
                        viewPager.setCurrentItem(3);
                    }else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });
        }
    }
}
