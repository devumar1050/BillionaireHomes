package com.example.billionairehomes.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.billionairehomes.R;

public class SplashScreen extends AppCompatActivity {

    ImageView ivLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
        Animation logoAnim= AnimationUtils.loadAnimation(SplashScreen.this,R.anim.bhl);
        ivLogo.setAnimation(logoAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){

                SharedPreferences sPref = getSharedPreferences("userdata", MODE_PRIVATE);
                String text = sPref.getString("USERNAME_KEY", "");
                Intent intent;
                if(text.isEmpty())
                {
                    intent = new Intent(SplashScreen.this, MainActivity.class);
                }
                else {
                    intent = new Intent(SplashScreen.this, MainActivity.class);
                }
                startActivity(intent);
                finish();

            }
        },5000);
    }
    public void init()
    {
        ivLogo=findViewById(R.id.ivLogo);
    }
}