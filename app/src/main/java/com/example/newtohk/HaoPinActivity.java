package com.example.newtohk;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class HaoPinActivity extends AppCompatActivity {
    private Button mBtn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hao_pin);
        mBtn = findViewById(R.id.button_hao);
        mBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HaoPinActivity.this,haopin.class);
                startActivity(intent);
            }
        });
    }


}
