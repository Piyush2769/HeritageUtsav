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

import com.college.heritageutsav.Adapter.Music4Adapter;
import com.college.heritageutsav.Adapter.Music6Adapter;
import com.college.heritageutsav.Model.Event;
import com.college.heritageutsav.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicDay6Fragment extends Fragment {


    public MusicDay6Fragment() {
        // Required empty public constructor
    }


    List<Event> eventList = new ArrayList<>();
    Music6Adapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_music_day6, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.musicDay6view);
        adapter=new Music6Adapter(eventList,getContext());
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
        eventList.add(new Event("Western Solo"));
        eventList.add(new Event("College Band Competition"));

    }

}

