package com.example.psmupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView tv_psm, tv_string;
    ImageView img_logo;
    Animation logo, brand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Enlever la barre de titre
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);

        //Déclarer les animations
        logo = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.logo_animation);
        brand = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.brand_animation);

        tv_psm = (TextView)findViewById(R.id.tv_brand);
        tv_string = (TextView)findViewById(R.id.tv_slogan);
        img_logo = (ImageView)findViewById(R.id.img_splash);

        //Set les animations
        img_logo.setAnimation(logo);
        tv_psm.setAnimation(brand);
        tv_string.setAnimation(brand);


        Handler handlerDelay = new Handler();
        //Afficher la MainActivity après 2sec
        Runnable goToHome = new Runnable() {
            public void run() {
                Intent in = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(in);
                finish();
            }
        };
        handlerDelay.postDelayed(goToHome, 2000);
    }
}