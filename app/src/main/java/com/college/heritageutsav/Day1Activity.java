package com.college.heritageutsav;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.college.heritageutsav.Adapter.EventAdapter;
import com.college.heritageutsav.Model.Event;

import java.util.ArrayList;
import java.util.List;

public class Day1Activity extends AppCompatActivity {

    List<Event> eventList = new ArrayList<>();
    EventAdapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        toolbar.setTitle("Day 1 (April 1st)");
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        recyclerView = (RecyclerView)findViewById(R.id.day1view);
        adapter=new EventAdapter(eventList,getApplicationContext());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        initData();
        runAnimation(recyclerView,0);

    }

    private void runAnimation(RecyclerView recyclerView, int type)
    {
        Context context=recyclerView.getContext();
        LayoutAnimationController controller=null;

        if(type==0)
            controller= AnimationUtils.loadLayoutAnimation(context,R.anim.layout_fall_down);

        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }


    private void initData()
    {
        eventList.add(new Event("Blood Donation"));
        eventList.add(new Event("Sudoku Competition"));
        eventList.add(new Event("Construkt"));
        eventList.add(new Event("Mutex"));
        eventList.add(new Event("TechTonic"));
        eventList.add(new Event("Circuitricks"));
        eventList.add(new Event("Rural-La-Carte"));
        eventList.add(new Event("Vishwaparichay"));
        eventList.add(new Event("Perpetua"));
        eventList.add(new Event("Debate Competition"));
    }

}
