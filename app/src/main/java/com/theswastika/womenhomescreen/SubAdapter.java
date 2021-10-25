package com.theswastika.womenhomescreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubAdapter extends RecyclerView.Adapter<SubAdapter.ProductViewHolder>{
    private Context mCtx;
    private List<Product> productList;

    public SubAdapter(Context mCtx, List<Product> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public SubAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator= LayoutInflater.from(mCtx);
        View view=inflator.inflate(R.layout.sub_list_item,null);
        SubAdapter.ProductViewHolder holder=new SubAdapter.ProductViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SubAdapter.ProductViewHolder holder, int position) {
        Product product = productList.get(position);
        String title = product.getTitle();
        holder.textViewTitle.setText(product.getTitle());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textViewTitle;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.subTextView);
            imageView = itemView.findViewById(R.id.subImageView);
        }
    }
}
