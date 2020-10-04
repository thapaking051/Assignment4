package com.example.assignment4;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecipePage extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_page);

        getExtras();
    }
    private void getExtras(){
        if(getIntent().hasExtra("foodName")){
            setText(getIntent().getStringExtra("foodName"));
        }
        else{
            setText("Error");
        }
    }
    private void setText(String s){
        final TextView textView =findViewById(R.id.fullRecipe);
        switch (s){
            case "Error":
                textView.setText(getString(R.string.error));
                break;
            case "Cake":
                textView.setText(getString(R.string.cake));
                break;
            case "Chicken":
                textView.setText(getString(R.string.chicken));
                break;
            case "Beef":
                textView.setText(getString(R.string.beef));
                break;
            default:
                textView.setText("Error");
        }
    }
}
