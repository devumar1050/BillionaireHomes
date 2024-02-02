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

    Button btnGetStarted;
    TextView tvSkip2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomesecond);
        init();
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelcomeSecond.this, login.class);
                startActivity(intent);
                finish();
            }
        });
        tvSkip2.setOnClickListener(new View.OnClickListener() {
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
        btnGetStarted=findViewById(R.id.btnGetStarted);
        tvSkip2=findViewById(R.id.tvSkip2);
    }

}