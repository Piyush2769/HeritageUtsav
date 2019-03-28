package com.college.heritageutsav.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.college.heritageutsav.AboutActivity;
import com.college.heritageutsav.Day1Activity;
import com.college.heritageutsav.Day5Activity;
import com.college.heritageutsav.Interface.ItemClickListener;
import com.college.heritageutsav.MainActivity;
import com.college.heritageutsav.Model.Event;
import com.college.heritageutsav.PlaneWorkshop;
import com.college.heritageutsav.R;
import com.college.heritageutsav.Technical.BizTech;
import com.college.heritageutsav.Technical.ChemicalInd;
import com.college.heritageutsav.Technical.CodeIt;
import com.college.heritageutsav.Technical.ECE.ElectroSprint;
import com.college.heritageutsav.Technical.ECE.InnovationChallenge;
import com.college.heritageutsav.Technical.ECE.LeagueofBots;
import com.college.heritageutsav.Technical.FlipItUp;
import com.college.heritageutsav.Technical.Precision;
import com.college.heritageutsav.Technical.ScamJam;
import com.college.heritageutsav.Technical.XWings;

import java.util.ArrayList;
import java.util.List;

class Tech3ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView eventName;
    private ItemClickListener itemClickListener;

    View view;
    public Tech3ViewHolder(@NonNull View itemView) {
        super(itemView);
        eventName=itemView.findViewById(R.id.event_name);
        view=itemView;
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition());

    }
}
public class Tech3Adapter extends RecyclerView.Adapter<Tech3ViewHolder>{

    private List<Event> eventList;
    private final Context context;

    public Tech3Adapter(List<Event> eventList, Context context) {
        this.eventList = eventList;
        this.context = context;
    }

    @NonNull
    @Override
    public Tech3ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View itemView=layoutInflater.inflate(R.layout.list_item2,viewGroup,false);

        return new Tech3ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Tech3ViewHolder tech3ViewHolder, int i) {
        tech3ViewHolder.eventName.setText(eventList.get(i).getName());

        tech3ViewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position) {

                final Intent intent;
                switch (position){
                    case 0:
                        intent =  new Intent(context, LeagueofBots.class);
                        break;
                    case 1:
                        intent =  new Intent(context, ChemicalInd.class);
                        break;
                    case 2:
                        intent =  new Intent(context, CodeIt.class);
                        break;
                    case 3:
                        intent =  new Intent(context, Precision.class);
                        break;
                    case 4:
                        intent =  new Intent(context, ScamJam.class);
                        break;
                    case 5:
                        intent =  new Intent(context, BizTech.class);
                        break;
                    case 6:
                        intent =  new Intent(context, ElectroSprint.class);
                        break;
                    case 7:
                        intent =  new Intent(context, InnovationChallenge.class);
                        break;
                    case 8:
                        intent =  new Intent(context, XWings.class);
                        break;
                    case 9:
                        intent =  new Intent(context, FlipItUp.class);
                        break;
                    case 10:
                        intent =  new Intent(context, PlaneWorkshop.class);
                        break;

                    default:
                        intent =  new Intent(context, Day1Activity.class);
                        break;
                }
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}
