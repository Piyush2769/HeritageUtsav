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
import com.college.heritageutsav.R;
import com.college.heritageutsav.Technical.BrandAThon;
import com.college.heritageutsav.Technical.CadComp;
import com.college.heritageutsav.Technical.CarpeDiem;
import com.college.heritageutsav.Technical.CodeIt;
import com.college.heritageutsav.Technical.Conundrum;
import com.college.heritageutsav.Technical.ECE.CrossRoads;
import com.college.heritageutsav.Technical.ECE.DriftODrop;
import com.college.heritageutsav.Technical.ECE.GameofRoads;
import com.college.heritageutsav.Technical.Precision;
import com.college.heritageutsav.Technical.Vishwaparichay;

import java.util.ArrayList;
import java.util.List;

class Tech2ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView eventName;
    private ItemClickListener itemClickListener;

    View view;
    public Tech2ViewHolder(@NonNull View itemView) {
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
public class Tech2Adapter extends RecyclerView.Adapter<Tech2ViewHolder>{

    private List<Event> eventList;
    private final Context context;

    public Tech2Adapter(List<Event> eventList, Context context) {
        this.eventList = eventList;
        this.context = context;
    }

    @NonNull
    @Override
    public Tech2ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View itemView=layoutInflater.inflate(R.layout.list_item2,viewGroup,false);

        return new Tech2ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Tech2ViewHolder tech2ViewHolder, int i) {
        tech2ViewHolder.eventName.setText(eventList.get(i).getName());

        tech2ViewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position) {

                final Intent intent;
                switch (position){
                    case 0:
                        intent =  new Intent(context, GameofRoads.class);
                        break;
                    case 1:
                        intent =  new Intent(context, CrossRoads.class);
                        break;
                    case 2:
                        intent =  new Intent(context, CadComp.class);
                        break;
                    case 3:
                        intent =  new Intent(context, CodeIt.class);
                        break;
                    case 4:
                        intent =  new Intent(context, Precision.class);
                        break;
                    case 5:
                        intent =  new Intent(context, CarpeDiem.class);
                        break;
                    case 6:
                        intent =  new Intent(context, Conundrum.class);
                        break;
                    case 7:
                        intent =  new Intent(context, BrandAThon.class);
                        break;
                    case 8:
                        intent =  new Intent(context, Vishwaparichay.class);
                        break;
                    case 9:
                        intent =  new Intent(context, DriftODrop.class);
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
