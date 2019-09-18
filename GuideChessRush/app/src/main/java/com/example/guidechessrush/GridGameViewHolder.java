package com.example.guidechessrush;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class GridGameViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    GridGameViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView= itemView.findViewById(R.id.img_item_foto);
    }
}
