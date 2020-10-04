package com.example.assignment4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<String> titleList = new LinkedList<>();
    private LinkedList<String> descriptionList = new LinkedList<>();
    private LinkedList<String> recipeList = new LinkedList<>();


    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleList.addLast(getString(R.string.air_fryer_chicken_thighs_title));
        descriptionList.addLast(getString(R.string.air_fryer_chicken_thighs_description));
        recipeList.addLast(getString(R.string.air_fryer_chicken_thighs_recipe));

        titleList.addLast(getString(R.string.italian_sausage_title));
        descriptionList.addLast(getString(R.string.italian_sausage_description));
        recipeList.addLast(getString(R.string.italian_sausage_recipe));

        titleList.addLast(getString(R.string.quesadillas_title));
        descriptionList.addLast(getString(R.string.quesadillas_description));
        recipeList.addLast(getString(R.string.quesadillas_recipe));

        titleList.addLast(getString(R.string.teriyaki_title));
        descriptionList.addLast(getString(R.string.teriyaki_description));
        recipeList.addLast(getString(R.string.teriyaki_recipe));

        titleList.addLast(getString(R.string.curry_title));
        descriptionList.addLast(getString(R.string.curry_description));
        recipeList.addLast(getString(R.string.curry_recipe));

        titleList.addLast(getString(R.string.trout_title));
        descriptionList.addLast(getString(R.string.trout_description));
        recipeList.addLast(getString(R.string.trout_recipe));

        // Create recycler view.
        recyclerView = findViewById(R.id.recycleView);
        // Create an adapter and supply the data to be displayed.
        recipeAdapter = new RecipeAdapter(this, titleList, descriptionList, recipeList);
        // Connect the adapter with the recycler view.
        recyclerView.setAdapter(recipeAdapter);
        // Give the recycler view a default layout manager.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}