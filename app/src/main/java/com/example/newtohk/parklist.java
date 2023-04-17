package com.example.newtohk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class parklist extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parklist);
        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.disney_Button);
        btn2 = (Button) findViewById(R.id.ocean_Button);
        btn3 = (Button) findViewById(R.id.hk_Button);
        btn4 = (Button) findViewById(R.id.nanlian_Button);


        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(parklist.this, parklistexample.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(parklist.this, parklistexample.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(parklist.this, parklistexample.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(parklist.this, parklistexample.class);
                                        startActivity(intent);
                                    }
                                }
        );


    }
}