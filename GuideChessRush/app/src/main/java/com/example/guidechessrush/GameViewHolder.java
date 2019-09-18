package com.example.guidechessrush;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

class GameViewHolder extends RecyclerView.ViewHolder {
    private TextView tvName;
    private TextView tvFrom;
    private ImageView imgHero;
    private LinearLayout linearLayout;
    GameViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_item_name);
        tvFrom = itemView.findViewById(R.id.tv_item_from);
        imgHero = itemView.findViewById(R.id.img_item_foto);
        linearLayout = itemView.findViewById(R.id.linear_row);
    }
    void fetchData(final Game game, final Context context){
        tvName.setText(game.getName());
        tvFrom.setText(game.getDesc());
        Glide.with(itemView.getContext())
                .load(game.getImg())
                .apply(new RequestOptions().override(55,55))
                .into(imgHero);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Detail.class);
                intent.putExtra("name", game.getName());
                intent.putExtra("desc", game.getDesc());
                intent.putExtra("image", game.getImg());
                context.startActivity(intent);
            }
        });
    }
}
