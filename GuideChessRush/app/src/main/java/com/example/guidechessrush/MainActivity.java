package com.example.guidechessrush;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Game> dataGames = GameData.getlisdata();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showRecyclerViewList();
    }

    private void showRecyclerViewList() {
        AdapterGame adapterGame = new AdapterGame();
        adapterGame.setListGames(dataGames);
        RecyclerView recyclerView = findViewById(R.id.awal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterGame);
        recyclerView.setHasFixedSize(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menus,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    private void showRecyclerGrid(){
        GridGameAdapter adapterGame = new GridGameAdapter();
        adapterGame.setGames(dataGames);
        RecyclerView recyclerView = findViewById(R.id.awal);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        recyclerView.setAdapter(adapterGame);
        recyclerView.setHasFixedSize(true);
    }
    private void showRecyclerCard(){
        CardGameAdapter adapterGame = new CardGameAdapter();
        adapterGame.setGames(dataGames);
        RecyclerView recyclerView = findViewById(R.id.awal);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapterGame);
        recyclerView.setHasFixedSize(true);
    }

    private void setMode(int itemId) {
        switch (itemId){
            case R.id.action_list:
                showRecyclerViewList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_card:
                showRecyclerCard();
                break;
            case R.id.action_about:
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
        }
    }
}
