package com.example.billionairehomes.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.billionairehomes.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class WelcomeSecond extends AppCompatActivity {

    Button btnNext;
    TextView tvSkip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelcomeSecond.this, WelcomeSecond.class);
                startActivity(intent);
                finish();
            }
        });
        tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelcomeSecond.this, login.class);
                startActivity(intent);
                finish();
            }
        });
    }
    public void init()
    {
        btnNext=findViewById(R.id.btnNext);
        tvSkip=findViewById(R.id.tvSkip);
    }

}