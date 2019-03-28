package com.college.heritageutsav.Team;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.college.heritageutsav.Model.TeamPojo;
import com.college.heritageutsav.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TeamAdapter extends RecyclerView.Adapter<TeamViewHolder> {

    private List<TeamPojo> teamList;
    private final Context context;

    public TeamAdapter(List<TeamPojo> teamList, Context context) {
        this.teamList = teamList;
        this.context = context;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View itemView=layoutInflater.inflate(R.layout.team_item_layout,viewGroup,false);

        return new TeamViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder viewHolder, int i) {
        viewHolder.name.setText(teamList.get(i).getName());
        viewHolder.second.setText(teamList.get(i).getSecond());
        viewHolder.image.setImageResource(teamList.get(i).getImgId());
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }
}

class TeamViewHolder extends RecyclerView.ViewHolder
{
    public TextView name,second;
    public CircleImageView image;

    public TeamViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.team_name);
        second=itemView.findViewById(R.id.team_second);
        image=itemView.findViewById(R.id.team_pic);
    }
}
