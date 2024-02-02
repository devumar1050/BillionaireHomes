package com.example.billionairehomes.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.billionairehomes.R;

public class Welcome extends AppCompatActivity {

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
                Intent intent=new Intent(getApplicationContext(), WelcomeSecond.class);
                startActivity(intent);
                finish();
            }
        });
       tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Welcome.this, login.class);
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