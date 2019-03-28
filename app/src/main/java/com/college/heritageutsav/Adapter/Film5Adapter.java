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
import com.college.heritageutsav.Cultural.Pravasana.BaarBaarDekho;
import com.college.heritageutsav.Cultural.Pravasana.ChayaOChobi;
import com.college.heritageutsav.Cultural.Pravasana.ChotoderChobi;
import com.college.heritageutsav.Cultural.Pravasana.Kahaani;
import com.college.heritageutsav.Cultural.Pravasana.ShutterIsland;
import com.college.heritageutsav.Day1Activity;
import com.college.heritageutsav.Day5Activity;
import com.college.heritageutsav.Interface.ItemClickListener;
import com.college.heritageutsav.MainActivity;
import com.college.heritageutsav.Model.Event;
import com.college.heritageutsav.R;

import java.util.ArrayList;
import java.util.List;

class Film5ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView eventName;
    private ItemClickListener itemClickListener;

    View view;
    public Film5ViewHolder(@NonNull View itemView) {
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
public class Film5Adapter extends RecyclerView.Adapter<Film5ViewHolder>{

    private List<Event> eventList;
    private final Context context;

    public Film5Adapter(List<Event> eventList, Context context) {
        this.eventList = eventList;
        this.context = context;
    }

    @NonNull
    @Override
    public Film5ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View itemView=layoutInflater.inflate(R.layout.list_item2,viewGroup,false);

        return new Film5ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Film5ViewHolder film5ViewHolder, int i) {
        film5ViewHolder.eventName.setText(eventList.get(i).getName());

        film5ViewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position) {

                final Intent intent;
                switch (position){
                    case 0:
                        intent =  new Intent(context, ChotoderChobi.class);
                        break;
                    case 1:
                        intent =  new Intent(context, ShutterIsland.class);
                        break;
                    case 2:
                        intent =  new Intent(context, BaarBaarDekho.class);
                        break;
                    case 3:
                        intent =  new Intent(context, ChayaOChobi.class);
                        break;
                    case 4:
                        intent =  new Intent(context, Kahaani.class);
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

