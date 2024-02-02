package com.example.billionairehomes.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.billionairehomes.R;

import java.util.ArrayList;
import java.util.List;

public class AllPropertySecond extends AppCompatActivity {

    private RecyclerView allView2;
    private AllAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_property_second);
        allView2=findViewById(R.id.allView2);

        List<Property> propertyList = createDummyPropertyList();


        LinearLayoutManager AllLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);


        allView2.setLayoutManager(AllLayoutManager);

        adapter = new AllAdapter(propertyList,this);


        allView2.setAdapter(adapter);

    }
    private List<Property> createDummyPropertyList() {
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

        return propertyList;
    }
}