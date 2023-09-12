package com.example.i200802_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class Search extends AppCompatActivity {

    private LinearLayout searchResultsView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchResultsView = findViewById(R.id.SearchResultsLL);

    }

    public void searchTextBox(LinearLayout ll)
    {
        if (searchResultsView.getVisibility() == LinearLayout.GONE)
        {
            searchResultsView.setVisibility(LinearLayout.VISIBLE); // Show
        } else
        {
            searchResultsView.setVisibility(LinearLayout.GONE); // Hide
        }
    }
}