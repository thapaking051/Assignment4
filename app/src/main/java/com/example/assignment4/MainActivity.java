package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<String> rList = new LinkedList<>();
    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 20; i++) {
            rList.addLast("Word " + i);
        }

        // Create recycler view.
        recyclerView = findViewById(R.id.recycleView);
        // Create an adapter and supply the data to be displayed.
        recipeAdapter = new RecipeAdapter(this, rList);
        // Connect the adapter with the recycler view.
        recyclerView.setAdapter(recipeAdapter);
        // Give the recycler view a default layout manager.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}