package com.example.newtohk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class playlist extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);
        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.park_button);
        btn2 = (Button) findViewById(R.id.hiking_button);
        btn3 = (Button) findViewById(R.id.island_button);
        btn4 = (Button) findViewById(R.id.scenery_button);

        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(playlist.this, parklist.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(playlist.this, hikinglist.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(playlist.this, islandlist.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(playlist.this, scenerylist.class);
                                        startActivity(intent);
                                    }
                                }
        );



    }
}