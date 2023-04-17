package com.example.newtohk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Foodlist extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);
        initView();
    }



    private void initView() {
        btn1 = (Button) findViewById(R.id.localBtn);
        btn2 = (Button) findViewById(R.id.cnBtn);
        btn3 = (Button) findViewById(R.id.westBtn);
        btn4 = (Button) findViewById(R.id.jkBtn);
        btn5 = (Button) findViewById(R.id.southeastBtn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Foodlist.this, localfoodlist.class);
                startActivity(intent);
            }
        }
        );

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Foodlist.this, chinesefood.class);
                startActivity(intent);
            }
        }
        );

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Foodlist.this, westfood.class);
                startActivity(intent);
            }
        }
        );

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Foodlist.this, jkfood.class);
                startActivity(intent);
            }
        }
        );

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Foodlist.this, southeastfood.class);
                startActivity(intent);
                                    }
                                }
        );



    }


}

