package com.example.newtohk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hikinglist extends AppCompatActivity {
    private Button btn11;
    private Button btn22;
    private Button btn33;
    private Button btn44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hikinglist);
        initView();
    }
    private void initView() {
        btn11 = (Button) findViewById(R.id.mailihaojing_Button);
        btn22 = (Button) findViewById(R.id.taipingshan_Button);
        btn33 = (Button) findViewById(R.id.dayushan_Button);
        btn44 = (Button) findViewById(R.id.shizishan_Button);


        btn11.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(hikinglist.this, hikinglistexample.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn22.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(hikinglist.this, hikinglistexample.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn33.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(hikinglist.this, hikinglistexample.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn44.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(hikinglist.this, hikinglistexample.class);
                                        startActivity(intent);
                                    }
                                }
        );


    }
}