package com.college.heritageutsav.Team;


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

import com.college.heritageutsav.Model.TeamPojo;
import com.college.heritageutsav.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Core extends Fragment {


    public Core() {
        // Required empty public constructor
    }

    List<TeamPojo> teamList = new ArrayList<>();
    TeamAdapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_core, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.corerecy);
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

    }


    private void initData()
    {
        teamList.add(new TeamPojo("Debrup Dutta","ECE | 2015-19",R.drawable.debrup));
        teamList.add(new TeamPojo("Suparno Banerjee","CSE | 2015-19",R.drawable.suparno));
        teamList.add(new TeamPojo("Sougatam Das","ECE | 2015-19",R.drawable.sougatam));
        teamList.add(new TeamPojo("Ritesh Ranjan","CE | 2015-19",R.drawable.rit));
        teamList.add(new TeamPojo("Abhinav Roy","CE | 2015-19",R.drawable.abhinav));
        teamList.add(new TeamPojo("Ani Sudhanshu","CE | 2015-19",R.drawable.ani));
        teamList.add(new TeamPojo("Suan Darshan","ECE | 2015-19",R.drawable.suan));
        teamList.add(new TeamPojo("Kumar Shiwam","ECE | 2015-19",R.drawable.kuma));
        teamList.add(new TeamPojo("Ranvijay Rana","ME | 2015-19",R.drawable.rana));
        teamList.add(new TeamPojo("Shambolin Bose","ME | 2015-19",R.drawable.sham));
        teamList.add(new TeamPojo("Anik Sarkar","ChE | 2015-19",R.drawable.anik));

    }

}
