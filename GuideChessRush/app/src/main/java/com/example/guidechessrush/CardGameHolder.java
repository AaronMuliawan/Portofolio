package com.example.guidechessrush;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

class CardGameHolder extends RecyclerView.ViewHolder {
    TextView textViewName;
    TextView textViewDesc;
    ImageView imageView;
    CardView linearLayout;
    CardGameHolder(@NonNull View itemView) {
        super(itemView);
        textViewDesc = itemView.findViewById(R.id.tv_item_desc);
        textViewName = itemView.findViewById(R.id.txt_item_name);
        imageView = itemView.findViewById(R.id.img_item_foto);
        linearLayout = itemView.findViewById(R.id.linear_card);
    }
}
