package com.college.heritageutsav;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.college.heritageutsav.Adapter.EventAdapter;
import com.college.heritageutsav.Adapter.Tech2Adapter;
import com.college.heritageutsav.Model.Event;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TechDay2Fragment extends Fragment {


    public TechDay2Fragment() {
        // Required empty public constructor
    }


    List<Event> eventList = new ArrayList<>();
    Tech2Adapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_tech_day2, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.techDay2view);
        adapter=new Tech2Adapter(eventList,getContext());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();
        //runAnimation(recyclerView,1);
    }

    private void runAnimation(RecyclerView recyclerView, int type)
    {
        LayoutAnimationController controller=null;

        if(type==1)
            controller= AnimationUtils.loadLayoutAnimation(getContext(),R.anim.layout_slide_from_bottom);

        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }


    private void initData()
    {
        eventList.add(new Event("Game of Roads"));
        eventList.add(new Event("Cross-Roads"));
        eventList.add(new Event("CAD-OMANIA"));
        eventList.add(new Event("Code It-Prelims"));
        eventList.add(new Event("Precision-Prelims"));
        eventList.add(new Event("Carpe Diem"));
        eventList.add(new Event("Conundrum"));
        eventList.add(new Event("Brand-a-thon"));
        eventList.add(new Event("Vishwaparichay-Finals"));
        eventList.add(new Event("Drift-O-Drop"));
    }

}
