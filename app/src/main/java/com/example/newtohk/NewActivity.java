package com.example.newtohk;

import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NewActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        // RecyclerView
        mRecyclerView = findViewById(R.id.recyclerView);
        // Set its Properties using LinearLayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Set RecyclerView Adapter
        myAdapter = new MyAdapter(this, this.getCountries());
        mRecyclerView.setAdapter(myAdapter);
        // Set its Properties using GridLayout with 2 column
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }
    // Add Models to arraylist
    private ArrayList<Model> getCountries() {
        final String[] countries =
                getResources().getStringArray(R.array.countries_array);
        final String[] areas =
                getResources().getStringArray(R.array.areas_array);
        final TypedArray flags =
                getResources().obtainTypedArray(R.array.images_array);
        ArrayList<Model> models = new ArrayList<>();
        Model p = new Model();
        for (int i = 0; i < countries.length; i++) {
            if (i !=0) { p = new Model(); }
            p.setCountryName(countries[i]);
            p.setCountryArea(areas[i]);
            p.setImage(flags.getResourceId(i , -1));
            models.add(p);
        }
        return models;
    }
}