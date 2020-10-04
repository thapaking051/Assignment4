package com.example.assignment4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>
{
    private final LinkedList<String> tList;
    private final LinkedList<String> dList;
    private final LinkedList<String> rList;

    private final LayoutInflater rInflater;
    private Context context;

    class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView recipeItemView;
        public final TextView recipeDescription;
        final RecipeAdapter rAdapter;

        public RecipeViewHolder(View itemView, RecipeAdapter adapter) {
            super(itemView);
            recipeItemView = itemView.findViewById(R.id.recipeTitle);
            recipeDescription = itemView.findViewById(R.id.recipeDescription);
            this.rAdapter = adapter;
            itemView.setOnClickListener(this);
        }
        public void onClick(View view) {
            // Get the position of the item that was clicked.
            int rPosition = getLayoutPosition();
            String element = rList.get(rPosition);

            Intent intent = new Intent(context, RecipePage.class);
            intent.putExtra("recipe", element);

            context.startActivity(intent);
        }
    }

    public RecipeAdapter(Context mcontext, LinkedList<String> titleList, LinkedList<String> descriptionList, LinkedList<String> recipeList) {
        context = mcontext;
        rInflater = LayoutInflater.from(context);
        this.tList = titleList;
        this.dList = descriptionList;
        this.rList = recipeList;
    }

    public RecipeAdapter.RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = rInflater.inflate(
                R.layout.recipelist_item, parent, false);
        return new RecipeViewHolder(mItemView, this);
    }

    public void onBindViewHolder(@NonNull RecipeViewHolder holder, int position) {
        // Retrieve the data for that position.
        String title = tList.get(position);
        String description = dList.get(position);
        // Add the data to the view holder.
        holder.recipeItemView.setText(title);
        holder.recipeDescription.setText(description);
    }


    public int getItemCount() {
        return tList.size();
    }
}
