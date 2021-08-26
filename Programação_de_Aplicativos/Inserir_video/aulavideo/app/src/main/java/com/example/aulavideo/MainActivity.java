package com.example.aulavideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView video = (VideoView) findViewById(R.id.v);

        String caminho = "android.resource://"+getPackageName()+"/"+R.raw.videoapp;
        Uri uri = Uri.parse(caminho);
        video.setVideoURI(uri);
        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
    }
}