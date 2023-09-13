package com.example.i200802_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PostItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_item);


        ImageView back = findViewById(R.id.crossIcon);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ImageView img = findViewById(R.id.uploadPhotoButton);
        img.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PostItem.this, Photo.class);
                startActivity(intent);
            }
        });

        ImageView vid = findViewById(R.id.uploadVidButton);
        vid.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PostItem.this, Video.class);
                startActivity(intent);
            }
        });
    }
}