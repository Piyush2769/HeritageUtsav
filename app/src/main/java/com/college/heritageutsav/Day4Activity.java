package com.college.heritageutsav;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class Day4Activity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabsPager4Adapter myTabsPager4Adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day4);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar4);
        toolbar.setTitle("Day 4 (4th April)");
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        viewPager=findViewById(R.id.viewPager4);
        myTabsPager4Adapter =new TabsPager4Adapter(getSupportFragmentManager());
        viewPager.setAdapter(myTabsPager4Adapter);

        tabLayout=findViewById(R.id.tablayout4);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
