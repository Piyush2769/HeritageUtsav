package com.college.heritageutsav;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class Day3Activity extends AppCompatActivity {


    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabsPager3Adapter myTabsPager3Adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        toolbar.setTitle("Day 3 (3rd April)");
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        viewPager=findViewById(R.id.viewPager3);
        myTabsPager3Adapter =new TabsPager3Adapter(getSupportFragmentManager());
        viewPager.setAdapter(myTabsPager3Adapter);

        tabLayout=findViewById(R.id.tablayout3);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

}
