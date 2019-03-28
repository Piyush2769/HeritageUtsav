package com.college.heritageutsav.Cultural;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.college.heritageutsav.MpagerAdapter;
import com.college.heritageutsav.R;

public class ScriptWriting extends AppCompatActivity {

    private ViewPager mPager;
    private int[] layouts={R.layout.script1, R.layout.script2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_script_writing);
        final Button b=findViewById(R.id.regscript);

        //To set the top to the same colour as that of the viewPager
        if(Build.VERSION.SDK_INT >=19)
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else
        {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        mPager=findViewById(R.id.viewPager3);
        MpagerAdapter viewPagerAdapter=new MpagerAdapter(layouts,this);
        mPager.setAdapter(viewPagerAdapter);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://61.12.70.61:615/HeritageUtsav19EvtRegd.aspx"));
                startActivity(browserIntent);
            }
        });

    }

}
