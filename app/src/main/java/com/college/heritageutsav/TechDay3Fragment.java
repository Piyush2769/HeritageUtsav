package com.college.heritageutsav;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.college.heritageutsav.Adapter.EventAdapter;
import com.college.heritageutsav.Adapter.Tech3Adapter;
import com.college.heritageutsav.Model.Event;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TechDay3Fragment extends Fragment {


    public TechDay3Fragment() {
        // Required empty public constructor
    }


    List<Event> eventList = new ArrayList<>();
    Tech3Adapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_tech_day3, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.techDay3view);
        adapter=new Tech3Adapter(eventList,getContext());
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
    }

    private void initData()
    {
        eventList.add(new Event("League of Bots"));
        eventList.add(new Event("Chemical Industr. Process"));
        eventList.add(new Event("CodeIt-Finals"));
        eventList.add(new Event("Precision-Finals"));
        eventList.add(new Event("Scam Jam"));
        eventList.add(new Event("Biz Tech Quiz"));
        eventList.add(new Event("Electro Sprint"));
        eventList.add(new Event("Innovation Challenge"));
        eventList.add(new Event("X-Wings"));
        eventList.add(new Event("Flip It Up"));
        eventList.add(new Event("Drone Workshop"));





    }


}
