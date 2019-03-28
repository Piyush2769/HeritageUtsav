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


public class Club extends Fragment {

    public Club() {
        // Required empty public constructor
    }

    List<TeamPojo> teamList = new ArrayList<>();
    TeamAdapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_club, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.clubrecy);
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
        teamList.add(new TeamPojo("Yash Patni","Geeks United| CSE | 9831721145",R.drawable.piyush));
        teamList.add(new TeamPojo("Alfarhan Zahedi","Geeks United | CSE | 9007423220",R.drawable.alfu));
        teamList.add(new TeamPojo("Mehul Agarwal","EDC | 9836946919",R.drawable.mehul));
        teamList.add(new TeamPojo("Anushka Guha","Ghungroo | 8240710624",R.drawable.anushka));
        teamList.add(new TeamPojo("Sreeja Paul","Ghungroo | 9007651107",R.drawable.sreeja));
        teamList.add(new TeamPojo("Suparno Banerjee","Resonance | 8902231437",R.drawable.piyush));
        teamList.add(new TeamPojo("Sounak Dey","Anubhav | 8961841640",R.drawable.piyush));
        teamList.add(new TeamPojo("Somopriya Seth","Anubhav | 8697883410",R.drawable.piyush));

    }

}
