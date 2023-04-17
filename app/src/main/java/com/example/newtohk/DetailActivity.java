package com.example.newtohk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    ImageView mImageFlag;
    TextView mCountryName, mCountryArea,mDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mImageFlag= findViewById((R.id.imageFlag));
        mCountryName = findViewById((R.id.countryName));
        mCountryArea = findViewById((R.id.countryArea));

        // Action Bar
        ActionBar actionBar = getSupportActionBar();
        // Intent
        Intent intent = getIntent();
        String cName = intent.getStringExtra("cName");
        String cArea = intent.getStringExtra("cArea");
        byte[] mBytes = getIntent().getByteArrayExtra("cImage");
        // decode bytes array to bitmap
        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);
        // set title to actionbar
        actionBar.setTitle(cName);
        // Set data to the views
        mCountryName.setText(cName);
        mCountryArea.setText("Keyword: " + cArea);
        mImageFlag.setImageBitmap(bitmap);
    }
}