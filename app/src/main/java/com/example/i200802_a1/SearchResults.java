package com.example.i200802_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SearchResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        ImageView back = findViewById(R.id.backArrow);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchResults.this, Home.class);
                startActivity(intent);
            }
        });

        ImageView itemCard = findViewById(R.id.itemCard);
        itemCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchResults.this, Item.class);
                startActivity(intent);
            }
        });
    }
}