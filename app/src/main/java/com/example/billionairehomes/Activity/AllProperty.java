package com.example.billionairehomes.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.billionairehomes.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AllProperty extends AppCompatActivity {

    private RecyclerView allView;
    TextView tvUserName;
    private AllAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_property);
        allView=findViewById(R.id.allView);
        tvUserName=findViewById(R.id.tvUserName);
        List<Property> propertyList = createDummyPropertyList();


        GridLayoutManager AllLayoutManager = new GridLayoutManager(getApplicationContext(), 2);


        allView.setLayoutManager(AllLayoutManager);


        // Initialize and set adapters for RecyclerViews
        adapter = new AllAdapter(propertyList,this);


        allView.setAdapter(adapter);

    }

    private void retrieveUsername() {
       FirebaseDatabase.getInstance().getReference().addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Retrieve username from dataSnapshot
                String username = dataSnapshot.child("name").getValue(String.class);
                // Set username to TextView
                   tvUserName.setText(username);
            }

           @Override
           public void onCancelled(@NonNull DatabaseError error) {

           }

        });
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
