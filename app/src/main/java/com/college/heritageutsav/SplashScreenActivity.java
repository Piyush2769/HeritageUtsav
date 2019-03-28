package com.college.heritageutsav;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class SplashScreenActivity extends AppCompatActivity{

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        videoView=findViewById(R.id.video);

        Uri video=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.finak);
        videoView.setVideoURI(video);

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Intent i=new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        videoView.start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }

}