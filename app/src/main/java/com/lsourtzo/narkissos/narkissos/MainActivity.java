package com.lsourtzo.narkissos.narkissos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ImageView TopView = (ImageView) findViewById(R.id.topimage);
        TopView.setBackgroundResource(R.drawable.top_image_anim);
        AnimationDrawable TopAnimation = (AnimationDrawable) TopView.getBackground();
        TopAnimation.start();

        com.lsourtzo.narkissos.narkissos.TextViewCM marqueeText1 = (com.lsourtzo.narkissos.narkissos.TextViewCM) findViewById(R.id.marquee_text_1);
        marqueeText1.setSelected(true);

    }

    public void callgooglemap(View v) {
        // Creates an Intent that will load a map of Metamorfosis - Narkissos
        Uri gmmIntentUri = Uri.parse("geo:38.064257,23.761464");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

}

