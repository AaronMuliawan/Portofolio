package com.example.guidechessrush;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridGameAdapter extends RecyclerView.Adapter<GridGameViewHolder> {
    private ArrayList<Game> games;

    @NonNull
    @Override
    public GridGameViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_grid,viewGroup,false);
        return new GridGameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridGameViewHolder gridGameViewHolder, @SuppressLint("RecyclerView") final int i) {
        Glide.with(gridGameViewHolder.itemView.getContext()).load(games.get(i).getImg()).apply(new RequestOptions().override(350,550))
                .into(gridGameViewHolder.imageView);

        gridGameViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridGameViewHolder.itemView.getContext(),Detail.class);
                intent.putExtra("name", games.get(i).getName());
                intent.putExtra("desc", games.get(i).getDesc());
                intent.putExtra("image", games.get(i).getImg());
                gridGameViewHolder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    void setGames(ArrayList<Game> games){
        this.games = games;
    }
}
