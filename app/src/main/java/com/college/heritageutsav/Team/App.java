package com.college.heritageutsav.Team;

import android.content.Context;
import android.net.Uri;
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

import com.college.heritageutsav.Model.TeamPojo;
import com.college.heritageutsav.R;

import java.util.ArrayList;
import java.util.List;


public class App extends Fragment {

    public App() {
        // Required empty public constructor
    }
    List<TeamPojo> teamList = new ArrayList<>();
    TeamAdapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_app, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.apprecy);
        adapter=new TeamAdapter(teamList,getContext());
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
        teamList.add(new TeamPojo("Piyush Maheswari","Developer",R.drawable.piyush));
        teamList.add(new TeamPojo("Ayush Agarwal","Designer",R.drawable.ayush));
        teamList.add(new TeamPojo("Abhishek Sen","Designer",R.drawable.abhishek));
        teamList.add(new TeamPojo("Sagnik Sammadar","Designer",R.drawable.sagnik));
    }

}
