package com.example.billionairehomes.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.billionairehomes.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recommendedRecyclerView, nearYouRecyclerView;
    private RecommendedAdapter recommendedAdapter;
    private NearYouAdapter nearYouAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assuming you have a list of houses and properties to display
        List<House> houseList = createDummyHouseList();
        List<Property> propertyList = createDummyPropertyList();

        // Initialize your RecyclerViews
        recommendedRecyclerView = findViewById(R.id.recommendedView);
        nearYouRecyclerView = findViewById(R.id.nearView);

        // Initialize and set layout manager for RecyclerViews
        LinearLayoutManager recommendedLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager nearYouLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recommendedRecyclerView.setLayoutManager(recommendedLayoutManager);
        nearYouRecyclerView.setLayoutManager(nearYouLayoutManager);

        // Initialize and set adapters for RecyclerViews
        recommendedAdapter = new RecommendedAdapter(houseList, this);
        nearYouAdapter = new NearYouAdapter(propertyList, this);

        recommendedRecyclerView.setAdapter(recommendedAdapter);
        nearYouRecyclerView.setAdapter(nearYouAdapter);
    }

    private List<House> createDummyHouseList() {
        // Create a list of dummy houses for testing
        List<House> houseList = new ArrayList<>();
        houseList.add(new House(R.drawable.h_1, "Johar Town Lahore", 5, "Rs 2,250,000", "House No 212, Block D"));
        houseList.add(new House(R.drawable.h_1, "Johar Town Lahore", 5, "Rs 2,250,000", "House No 212, Block D"));
        houseList.add(new House(R.drawable.h_1, "Johar Town Lahore", 5, "Rs 2,250,000", "House No 212, Block D"));
        houseList.add(new House(R.drawable.h_1, "Johar Town Lahore", 5, "Rs 2,250,000", "House No 212, Block D"));
        houseList.add(new House(R.drawable.h_1, "Johar Town Lahore", 5, "Rs 2,250,000", "House No 212, Block D"));
        houseList.add(new House(R.drawable.h_1, "Johar Town Lahore", 5, "Rs 2,250,000", "House No 212, Block D"));
        houseList.add(new House(R.drawable.h_1, "Johar Town Lahore", 5, "Rs 2,250,000", "House No 212, Block D"));
        houseList.add(new House(R.drawable.h_1, "Johar Town Lahore", 5, "Rs 2,250,000", "House No 212, Block D"));
        // Add more houses as needed
        return houseList;
    }

    private List<Property> createDummyPropertyList() {
        // Create a list of dummy properties for testing
        List<Property> propertyList = new ArrayList<>();
        propertyList.add(new Property(R.drawable.img, "Ali Hamza Mansion", 4.8, "$250/month", "45 Ali Town Lahore, Punjab, Pk", "1 Kanal"));
        propertyList.add(new Property(R.drawable.img, "Ali Hamza Mansion", 4.8, "$250/month", "45 Ali Town Lahore, Punjab, Pk", "1 Kanal"));
        propertyList.add(new Property(R.drawable.img, "Ali Hamza Mansion", 4.8, "$250/month", "45 Ali Town Lahore, Punjab, Pk", "1 Kanal"));
        propertyList.add(new Property(R.drawable.img, "Ali Hamza Mansion", 4.8, "$250/month", "45 Ali Town Lahore, Punjab, Pk", "1 Kanal"));
        propertyList.add(new Property(R.drawable.img, "Ali Hamza Mansion", 4.8, "$250/month", "45 Ali Town Lahore, Punjab, Pk", "1 Kanal"));
        propertyList.add(new Property(R.drawable.img, "Ali Hamza Mansion", 4.8, "$250/month", "45 Ali Town Lahore, Punjab, Pk", "1 Kanal"));
        propertyList.add(new Property(R.drawable.img, "Ali Hamza Mansion", 4.8, "$250/month", "45 Ali Town Lahore, Punjab, Pk", "1 Kanal"));
        propertyList.add(new Property(R.drawable.img, "Ali Hamza Mansion", 4.8, "$250/month", "45 Ali Town Lahore, Punjab, Pk", "1 Kanal"));
        propertyList.add(new Property(R.drawable.img, "Ali Hamza Mansion", 4.8, "$250/month", "45 Ali Town Lahore, Punjab, Pk", "1 Kanal"));
        // Add more properties as needed
        return propertyList;
    }
}
