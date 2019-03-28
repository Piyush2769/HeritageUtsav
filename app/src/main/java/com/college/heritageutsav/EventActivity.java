package com.college.heritageutsav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.GridLayoutAnimationController;
import android.widget.GridLayout;
import android.widget.ImageButton;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.college.heritageutsav.Model.Event;

public class EventActivity extends AppCompatActivity {

    ImageButton day1,day2,day3,day4,day5,day6;
    GridLayout mGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        mGrid=findViewById(R.id.grid);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Events");
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //Animation animation = AnimationUtils.loadAnimation(EventActivity.this,R.anim.grid_item_anim);
        //GridLayoutAnimationController controller = new GridLayoutAnimationController(animation, .2f, .2f);
        //mGrid.setLayoutAnimation(controller);

        day1=findViewById(R.id.day1);
        day2=findViewById(R.id.day2);
        day3=findViewById(R.id.day3);
        day4=findViewById(R.id.day4);
        day5=findViewById(R.id.day5);
        day6=findViewById(R.id.day6);

        day1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EventActivity.this, Day1Activity.class));
                Animatoo.animateZoom(EventActivity.this);
            }
        });

        day2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EventActivity.this,Day2Activity.class);
                startActivity(i);
                Animatoo.animateZoom(EventActivity.this);
            }
        });

        day3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EventActivity.this,Day3Activity.class);
                startActivity(i);
                Animatoo.animateSlideDown(EventActivity.this);
            }
        });

        day4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EventActivity.this,Day4Activity.class);
                startActivity(i);
                Animatoo.animateSlideUp(EventActivity.this);
            }
        });

        day5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EventActivity.this,Day5Activity.class);
                startActivity(i);
                Animatoo.animateDiagonal(EventActivity.this);
            }
        });

        day6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(EventActivity.this,Day6Activity.class);
                startActivity(i);
                Animatoo.animateInAndOut(EventActivity.this);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
