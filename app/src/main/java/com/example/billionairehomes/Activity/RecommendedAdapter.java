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

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.RecommendedViewHolder> {

    private List<House> houseList;
    private Context context;

    public RecommendedAdapter(List<House> houseList, Context context) {
        this.houseList = houseList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecommendedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recommended_viewholder, parent, false);
        return new RecommendedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedViewHolder holder, int position) {
        House house = houseList.get(position);

        // Populate the ViewHolder with data
        holder.imageView.setImageResource(house.getImageResourceId());
        holder.locationTextView.setText(house.getLocation());
        holder.ratingTextView.setText(String.valueOf(house.getRating()));
        holder.priceTextView.setText(house.getPrice());
        holder.addressTextView.setText(house.getAddress());
    }

    @Override
    public int getItemCount() {
        return houseList.size();
    }

    public static class RecommendedViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView locationTextView;
        TextView ratingTextView;
        TextView priceTextView;
        TextView addressTextView;

        public RecommendedViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView3);
            locationTextView = itemView.findViewById(R.id.tv7);
            ratingTextView = itemView.findViewById(R.id.tv8);
            priceTextView = itemView.findViewById(R.id.tv9);
            addressTextView = itemView.findViewById(R.id.tv10);
        }
    }
}

