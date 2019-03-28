package com.college.heritageutsav;

import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SpecialNightActivity extends AppCompatActivity {

    private ViewPager mPager;
    private int[] layouts={R.layout.first_night, R.layout.second_night};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_night);


        //To set the top to the same colour as that of the viewPager
        if(Build.VERSION.SDK_INT >=19)
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else
        {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }


        mPager=findViewById(R.id.viewPager1);
        MpagerAdapter viewPagerAdapter=new MpagerAdapter(layouts,this);
        mPager.setAdapter(viewPagerAdapter);

    }
}
