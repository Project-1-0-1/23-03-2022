package com.example.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Timer;
import java.util.TimerTask;

public class splash_screen extends AppCompatActivity {
    private FirebaseAuth mFirebaseAuth;
    private VideoView videoView;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        videoView = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash_screen);
        videoView.setVideoURI(uri);
        videoView.start();
        mFirebaseAuth=FirebaseAuth.getInstance();
        timer =new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
//                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
//                if(mFirebaseUser!=null){
//
//                    Intent intent = new Intent(getApplicationContext(), ChatScreen.class);
//                    startActivity(intent);
//                    finish();
//                }
//                else{
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
//                }

            }
        },5000);

    }
}