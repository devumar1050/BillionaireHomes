package com.example.billionairehomes.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.billionairehomes.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvSeeAll,tvSeeAll2;
    ImageView logo;

    private RecyclerView recommendedRecyclerView, nearYouRecyclerView;
    private RecommendedAdapter recommendedAdapter;
    private NearYouAdapter nearYouAdapter;

    BottomNavigationView nav;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSeeAll = findViewById(R.id.tv4);
        tvSeeAll2 = findViewById(R.id.tv6);
        logo=findViewById(R.id.logo);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DetailActivity.class));
            }
        });
        tvSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AllProperty.class));
            }
        });
        tvSeeAll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AllPropertySecond.class));
            }
        });


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
    public void onHouseClick(House house) {

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        startActivity(intent);
    }
}
