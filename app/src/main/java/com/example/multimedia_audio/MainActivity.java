package com.example.multimedia_audio;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    Button b1,b2,b3,b4;
    //Button b1=(Button)findViewById(R.id.b1);
    //Button b2=(Button)findViewById(R.id.b2);
    //Button b3=(Button)findViewById(R.id.b3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       b1=findViewById(R.id.b1);
       b2=findViewById(R.id.b2);
       b3=findViewById(R.id.b3);
       b4=findViewById(R.id.b4);

       // b1.setOnClickListener(this);
       // b2.setOnClickListener(this);
       // b3.setOnClickListener(this);


      final MediaPlayer mp=MediaPlayer.create(getApplicationContext(),R.raw.pr1);
         b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,Main2Activity.class);
                Toast.makeText(MainActivity.this, "Going to video player", Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
       /* mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                                mp.release();
            }
        });*/


    }



   /*final MediaPlayer mp=MediaPlayer.create(getApplicationContext(),R.raw.pr1);
    boolean playing = false;

    @Override
    public void onClick(View v) {
      int i = v.getId();
      if (i == R.id.b1) {
          if (!playing)
              mp.start();
          playing = true;
      } else if (i == R.id.b2) {
          if (playing)
              mp.pause();
          playing = false;
      } else if (i == R.id.b3) {
          mp.stop();
      }
    }*/
}
