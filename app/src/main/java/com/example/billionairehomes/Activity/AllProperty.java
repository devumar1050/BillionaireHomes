package com.example.billionairehomes.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.billionairehomes.R;

import java.util.ArrayList;
import java.util.List;

public class AllProperty extends AppCompatActivity {

    private RecyclerView allView;
    private AllAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_property);
        allView=findViewById(R.id.allView);
        List<Property> propertyList = createDummyPropertyList();


        GridLayoutManager AllLayoutManager = new GridLayoutManager(getApplicationContext(), 2);


        allView.setLayoutManager(AllLayoutManager);


        // Initialize and set adapters for RecyclerViews
        adapter = new AllAdapter(propertyList,this);


        allView.setAdapter(adapter);

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
