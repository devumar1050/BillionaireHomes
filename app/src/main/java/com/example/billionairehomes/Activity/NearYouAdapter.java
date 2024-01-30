package com.example.billionairehomes.Activity;

// NearYouAdapter.java
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

public class NearYouAdapter extends RecyclerView.Adapter<NearYouAdapter.NearYouViewHolder> {

    private List<Property> propertyList;
    private Context context;

    public NearYouAdapter(List<Property> propertyList, Context context) {
        this.propertyList = propertyList;
        this.context = context;
    }

    @NonNull
    @Override
    public NearYouViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nearyou_viewholder, parent, false);
        return new NearYouViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NearYouViewHolder holder, int position) {
        Property property = propertyList.get(position);

        // Populate the ViewHolder with data
        holder.imageView.setImageResource(property.getImageResourceId());
        holder.nameTextView.setText(property.getName());
        holder.ratingTextView.setText(String.valueOf(property.getRating()));
        holder.priceTextView.setText(property.getPrice());
        holder.locationTextView.setText(property.getLocation());
        holder.sizeTextView.setText(property.getSize());
    }

    @Override
    public int getItemCount() {
        return propertyList.size();
    }

    public static class NearYouViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView ratingTextView;
        TextView priceTextView;
        TextView locationTextView;
        TextView sizeTextView;

        public NearYouViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView7);
            nameTextView = itemView.findViewById(R.id.tv11);
            ratingTextView = itemView.findViewById(R.id.tv12);
            priceTextView = itemView.findViewById(R.id.tv13);
            locationTextView = itemView.findViewById(R.id.tv14);
            sizeTextView = itemView.findViewById(R.id.tv15);
        }
    }
}

