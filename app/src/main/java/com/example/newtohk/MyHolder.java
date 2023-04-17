package com.example.newtohk;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    //Views
    RelativeLayout mRelativeLayout;
    ImageView mImageFlag;
    TextView mCountryName, mCountryArea;
    public MyHolder(View itemView) {
        super(itemView);
        this.mRelativeLayout = itemView.findViewById(R.id.relative);
        this.mImageFlag = itemView.findViewById((R.id.cardImageflag));
        this.mCountryName = itemView.findViewById((R.id.cardCountryName));
        this.mCountryArea = itemView.findViewById((R.id.cardCountryArea));
    }
}
