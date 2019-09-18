package com.example.guidechessrush;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView textViewNameDetail = findViewById(R.id.txt_name_detail);
        TextView textViewDescDetail = findViewById(R.id.txt_detail_desc);

        Glide.with(this).load(getIntent().getStringExtra("image")).into(imageView);
        textViewNameDetail.setText(getIntent().getStringExtra("name"));
        textViewDescDetail.setText(getIntent().getStringExtra("desc"));
    }
}
