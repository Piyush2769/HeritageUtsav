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
import com.college.heritageutsav.DebateComp;
import com.college.heritageutsav.Interface.ItemClickListener;
import com.college.heritageutsav.MainActivity;
import com.college.heritageutsav.Model.Event;
import com.college.heritageutsav.R;
import com.college.heritageutsav.Technical.Blood;
import com.college.heritageutsav.Technical.BridgeMaking;
import com.college.heritageutsav.Technical.ECE.Circuitricks;
import com.college.heritageutsav.Technical.ECE.TechTonic;
import com.college.heritageutsav.Technical.Mutex;
import com.college.heritageutsav.Technical.Perpetua;
import com.college.heritageutsav.Technical.RuralLaCarte;
import com.college.heritageutsav.Technical.Sudoku;
import com.college.heritageutsav.Technical.Vishwaparichay;

import java.util.ArrayList;
import java.util.List;

class EventViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView eventName;
    private ItemClickListener itemClickListener;

    View view;
    public EventViewHolder(@NonNull View itemView) {
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
public class EventAdapter extends RecyclerView.Adapter<EventViewHolder>{

    private List<Event> eventList;
    private final Context context;

    public EventAdapter(List<Event> eventList, Context context) {
        this.eventList = eventList;
        this.context = context;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View itemView=layoutInflater.inflate(R.layout.list_item2,viewGroup,false);

        return new EventViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder eventViewHolder, int i) {
        eventViewHolder.eventName.setText(eventList.get(i).getName());

        eventViewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position) {

                final Intent intent;
                switch (position){
                    case 0:
                        intent =  new Intent(context, Blood.class);
                        break;
                    case 1:
                        intent =  new Intent(context, Sudoku.class);
                        break;
                    case 2:
                        intent =  new Intent(context, BridgeMaking.class);
                        break;
                    case 3:
                        intent =  new Intent(context, Mutex.class);
                        break;
                    case 4:
                        intent =  new Intent(context, TechTonic.class);
                        break;
                    case 5:
                        intent =  new Intent(context, Circuitricks.class);
                        break;
                    case 6:
                        intent =  new Intent(context, RuralLaCarte.class);
                        break;
                    case 7:
                        intent =  new Intent(context, Vishwaparichay.class);
                        break;
                    case 8:
                        intent =  new Intent(context, Perpetua.class);
                        break;
                    case 9:
                        intent =  new Intent(context, DebateComp.class);
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
