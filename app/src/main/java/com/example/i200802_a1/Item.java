package com.example.i200802_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        ImageView back = findViewById(R.id.backArrowIcon);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ImageView chat = findViewById(R.id.chatButtonBg);
        chat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Item.this, ChatMessages.class);
                startActivity(intent);
            }
        });

        TextView report = findViewById(R.id.reportButton);
        report.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Item.this, Report.class);
                startActivity(intent);
            }
        });
    }
}