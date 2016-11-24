package com.viriatussoftware.forterepudio;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button viewById = (Button) findViewById(R.id.button);

        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickMic2(v);
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRedirectComercial();
            }
        });
    }

    public void onClickMic2(View view){
        MediaPlayer player = MediaPlayer.create(this, R.raw.forte_repudio);
        player.start();
    }

    public void onRedirectComercial(){
        String url = "http://radiocomercial.iol.pt/videos/5432/praticas-que-repudio-veementemente";

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
