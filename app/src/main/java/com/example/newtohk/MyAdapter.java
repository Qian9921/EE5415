package com.example.newtohk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<Model> models;
    // Constructor of the MyAdapter Class
    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // convert xml to view obj
        View v =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, null);
        return new MyHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, @SuppressLint("RecyclerView") int position) {
        //bind data to our views
        holder.mCountryName.setText(models.get(position).getCountryName());
        holder.mCountryArea.setText(models.get(position).getCountryArea());
        holder.mImageFlag.setImageResource(models.get(position).getImage());
        // Use when you want to put each item data to same activity
        holder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get data from item click
                String countryName = models.get(position).getCountryName();
                String countryArea = models.get(position).getCountryArea();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)
                        holder.mImageFlag.getDrawable();
                // get bitmap from drawable
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                // compress image
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                //convert to bytes array
                byte[] bytes = stream.toByteArray();
                // intent, put data to intent, start activity
                Intent intent = new Intent(c, DetailActivity.class);
                intent.putExtra("cName", countryName);
                intent.putExtra("cArea", countryArea);
                intent.putExtra("cImage", bytes);
                c.startActivity(intent);
            }
        });
        // Animation
        Animation animation = AnimationUtils.loadAnimation(c,
                android.R.anim.slide_in_left);
        holder.itemView.startAnimation(animation);
    }
    @Override
    public int getItemCount() {
        return models.size();
    }
}
