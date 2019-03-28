package com.college.heritageutsav;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class Day6Activity extends AppCompatActivity {


    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabsPager6Adapter myTabsPager6Adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day6);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar6);
        toolbar.setTitle("Day 6 (6th April)");
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        viewPager=findViewById(R.id.viewPager6);
        myTabsPager6Adapter =new TabsPager6Adapter(getSupportFragmentManager());
        viewPager.setAdapter(myTabsPager6Adapter);

        tabLayout=findViewById(R.id.tablayout6);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
