package com.example.assignment4;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecipePage extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_page);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getExtras();
    }
    private void getExtras(){
        final TextView textView = findViewById(R.id.fullRecipe);
        if(getIntent().hasExtra("recipe")){
            textView.setText(getIntent().getStringExtra("recipe"));
        }
        else{
            textView.setText("Error");
        }
    }
}
