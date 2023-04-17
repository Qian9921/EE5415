package com.example.newtohk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class roomrentActivity extends AppCompatActivity {

    private Button mBtn;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roomrent);
        mBtn = findViewById(R.id.uni3);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(roomrentActivity.this,hkust1.class);
                startActivity(intent);
            }
        });

        mBtn = findViewById(R.id.uni1);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(roomrentActivity.this,hku1.class);
                startActivity(intent);
            }
        });

        mBtn = findViewById(R.id.uni2);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(roomrentActivity.this,cuhk1.class);
                startActivity(intent);
            }
        });

        mBtn = findViewById(R.id.uni4);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(roomrentActivity.this,polyu1.class);
                startActivity(intent);
            }
        });
        mBtn = findViewById(R.id.uni5);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(roomrentActivity.this,cityu1.class);
                startActivity(intent);
            }
        });
        mBtn = findViewById(R.id.uni6);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(roomrentActivity.this,hkbu1.class);
                startActivity(intent);
            }
        });
        mBtn = findViewById(R.id.uni7);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(roomrentActivity.this,lingnan1.class);
                startActivity(intent);
            }
        });
        mBtn = findViewById(R.id.uni8);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(roomrentActivity.this,eduhk1.class);
                startActivity(intent);
            }
        });




    }
}