package com.example.newtohk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class chinesefood extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinesefood);
        initView();
    }
    private void initView() {
        btn1 = (Button) findViewById(R.id.xiangshu_Btn);
        btn2 = (Button) findViewById(R.id.xiji_Btn);
        btn3 = (Button) findViewById(R.id.siji_Btn);
        btn4 = (Button) findViewById(R.id.jibao_Btn);



        btn1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(chinesefood.this, chinesefoodexample.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(chinesefood.this, chinesefoodexample.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(chinesefood.this, chinesefoodexample.class);
                                        startActivity(intent);
                                    }
                                }
        );

        btn4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Intent intent = new Intent(chinesefood.this, chinesefoodexample.class);
                                        startActivity(intent);
                                    }
                                }
        );





    }


}

