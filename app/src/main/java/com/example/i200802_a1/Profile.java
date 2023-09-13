package com.example.i200802_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Bottom Nav Bar
        Button home = findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Home.class);
                startActivity(intent);
            }
        });

        Button search = findViewById(R.id.searchButton);
        search.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Search.class);
                startActivity(intent);
            }
        });

        Button addItem = findViewById(R.id.addButton);
        addItem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, PostItem.class);
                startActivity(intent);
            }
        });

        Button chat = findViewById(R.id.chatButton);
        chat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Chat.class);
                startActivity(intent);
            }
        });

        Button profile = findViewById(R.id.profileButton);
        profile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Profile.class);
                startActivity(intent);
            }
        });


        Button editProf = findViewById(R.id.editProfileButton);
        editProf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, EditProfile.class);
                startActivity(intent);
            }
        });
    }
}