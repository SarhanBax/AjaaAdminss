package com.example.ajaaadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    Animation topAnim, bottomAmim;
    ImageView image;
    TextView text;
    private static int SPLASH_SCREEN=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAmim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        text=findViewById(R.id.icontext);
        image=findViewById(R.id.ajaaicon);

        image.setAnimation(topAnim);
        text.setAnimation(bottomAmim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this, Login.class);
                startActivity(intent);
            }
        },SPLASH_SCREEN);
    }
}
