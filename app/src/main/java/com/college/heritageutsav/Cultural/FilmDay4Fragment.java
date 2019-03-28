package com.college.heritageutsav.Cultural;


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

import com.college.heritageutsav.Adapter.Drama4Adapter;
import com.college.heritageutsav.Adapter.Film4Adapter;
import com.college.heritageutsav.Model.Event;
import com.college.heritageutsav.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FilmDay4Fragment extends Fragment {


    public FilmDay4Fragment() {
        // Required empty public constructor
    }

    List<Event> eventList = new ArrayList<>();
    Film4Adapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_film_day4, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.filmDay4view);
        adapter=new Film4Adapter(eventList,getContext());
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
        Context context=recyclerView.getContext();
        LayoutAnimationController controller=null;

        if(type==1)
            controller= AnimationUtils.loadLayoutAnimation(context,R.anim.layout_slide_from_bottom);

        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }

    private void initData()
    {
        eventList.add(new Event("Filmistaan"));
        eventList.add(new Event("Baar Baar Dekho"));
        eventList.add(new Event("Chaya-O-Chobi"));
        eventList.add(new Event("War of Worlds"));
    }

}

