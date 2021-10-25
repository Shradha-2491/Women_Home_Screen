package com.theswastika.womenhomescreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.ViewHolder> {
    ArrayList<PopularProduct> popularProducts;
    Context context;

    public  PopularAdapter(Context context, ArrayList<PopularProduct> popularProducts){
        this.context = context;
        this.popularProducts = popularProducts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_hori_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.ViewHolder holder, int position) {
        holder.popularImageView.setImageResource(popularProducts.get(position).getPopularPhoto());
        holder.textPTitle.setText(popularProducts.get(position).getPopularTitles());
        holder.popularPrice.setText(popularProducts.get(position).getPopularPrice());
    }

    @Override
    public int getItemCount() {
        return popularProducts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView popularImageView;
        TextView textPTitle;
        TextView popularPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            popularImageView = itemView.findViewById(R.id.imagePopular);
            textPTitle = itemView.findViewById(R.id.textViewPTitle);
            popularPrice = itemView.findViewById(R.id.textViewPPrice);
        }
    }
}
