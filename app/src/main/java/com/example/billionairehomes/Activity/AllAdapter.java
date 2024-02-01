package com.example.billionairehomes.Activity;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.billionairehomes.R;

import java.util.List;

public class AllAdapter extends RecyclerView.Adapter<AllAdapter.AllViewHolder> {

    private List<Property> houseList;
    private Context context;

    public AllAdapter(List<Property> houseList, Context context) {
        this.houseList = houseList;
        this.context = context;
    }

    @NonNull
    @Override
    public AllViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_viewholder, parent, false);
        return new AllViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllViewHolder holder, int position) {
        Property house = houseList.get(position);

        holder.imageView.setImageResource(house.getImageResourceId());
        holder.locationTextView.setText(house.getLocation());
        holder.priceTextView.setText(house.getPrice());
    }

    @Override
    public int getItemCount() {
        return houseList.size();
    }

    public static class AllViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView locationTextView;

        TextView priceTextView;
        TextView addressTextView;

        public AllViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView3);
            locationTextView = itemView.findViewById(R.id.tv7);
            priceTextView = itemView.findViewById(R.id.tv9);
            addressTextView = itemView.findViewById(R.id.tv10);
        }
    }
}