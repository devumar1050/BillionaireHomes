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

public class AllSecondAdapter extends RecyclerView.Adapter<AllSecondAdapter.AllSecondViewHolder> {

    private List<Property> houseList;
    private Context context;

    public AllSecondAdapter(List<Property> houseList, Context context) {
        this.houseList = houseList;
        this.context = context;
    }

    @NonNull
    @Override
    public AllSecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.allsecond_viewholder, parent, false);
        return new AllSecondViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllSecondAdapter.AllSecondViewHolder holder, int position) {
        Property house = houseList.get(position);

        holder.imageView.setImageResource(house.getImageResourceId());
        holder.locationTextView.setText(house.getLocation());
        holder.priceTextView.setText(house.getPrice());
    }

    @Override
    public int getItemCount() {

        return houseList.size();
    }

    public static class AllSecondViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView locationTextView;

        TextView priceTextView;
        TextView addressTextView;

        public AllSecondViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView3);
            locationTextView = itemView.findViewById(R.id.tv7);
            priceTextView = itemView.findViewById(R.id.tv9);
            addressTextView = itemView.findViewById(R.id.tv10);
        }
    }
}