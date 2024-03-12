package com.example.zxc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView description;
    public ImageView imageResource;

    public MyViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.item_title);
        description = itemView.findViewById(R.id.item_description);
        imageResource = itemView.findViewById(R.id.item_image);
    }
}
