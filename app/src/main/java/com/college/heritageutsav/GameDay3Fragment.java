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
import com.college.heritageutsav.Adapter.Game3Adapter;
import com.college.heritageutsav.Model.Event;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class GameDay3Fragment extends Fragment {


    public GameDay3Fragment() {
        // Required empty public constructor
    }

    List<Event> eventList = new ArrayList<>();
    Game3Adapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_game_day3, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.gameDay3view);
        adapter=new Game3Adapter(eventList,getContext());
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
        eventList.add(new Event("CS-GO Knockout"));
        eventList.add(new Event("FIFA Knockout"));
    }


}
