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

public class CardGameAdapter extends RecyclerView.Adapter<CardGameHolder> {
    private ArrayList<Game> games;
    @NonNull
    @Override
    public CardGameHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_card,viewGroup,false);
        return new CardGameHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardGameHolder cardGameHolder, @SuppressLint("RecyclerView") final int i) {
        cardGameHolder.textViewName.setText(games.get(i).getName());
        cardGameHolder.textViewDesc.setText(games.get(i).getDesc());
        Glide.with(cardGameHolder.itemView.getContext()).load(games.get(i).getImg()).apply(new RequestOptions().override(350,550))
                .into(cardGameHolder.imageView);

        cardGameHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cardGameHolder.itemView.getContext(),Detail.class);
                intent.putExtra("name", games.get(i).getName());
                intent.putExtra("desc", games.get(i).getDesc());
                intent.putExtra("image", games.get(i).getImg());
                cardGameHolder.itemView.getContext().startActivity(intent);
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
