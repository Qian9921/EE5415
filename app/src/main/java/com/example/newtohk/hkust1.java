package com.example.newtohk;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class hkust1 extends AppCompatActivity {

    private TextView tv = null;
    private ScrollView scrollView = null;
    private Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hkust1);
        mBtn = findViewById(R.id.button7);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hkust1.this,roomrentActivity.class);
                startActivity(intent);
            }
        });
        mBtn = findViewById(R.id.button2);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hkust1.this,hse.class);
                startActivity(intent);
            }
        });
        mBtn = findViewById(R.id.button6);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hkust1.this,ZhuYeActivity.class);
                startActivity(intent);
            }
        });
    }

}
