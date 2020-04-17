package com.example.multimedia_audio;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        VideoView v1;
        v1=findViewById(R.id.v1);
        MediaController m1=new MediaController(this);
        m1.setAnchorView(v1);
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
        v1.setVideoURI(uri);
        v1.setMediaController(m1);
        v1.requestFocus();
        v1.start();

    }
}
