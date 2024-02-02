package com.example.billionairehomes.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.billionairehomes.Activity.Fragments.DescriptionFragment;
import com.example.billionairehomes.Activity.Fragments.ImagesFragment;
import com.example.billionairehomes.Activity.Fragments.ReviewsFragment;
import com.example.billionairehomes.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class DetailActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private MyViewPagerAdapter myViewPagerAdapter;
    private TabLayout tabLayout;
    Button btnBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Initialize ViewPager2 and TabLayout
        viewPager2 = findViewById(R.id.View_pager1);
        myViewPagerAdapter = new MyViewPagerAdapter(this);
        viewPager2.setAdapter(myViewPagerAdapter);
        btnBuy=findViewById(R.id.buyNow);
        tabLayout = findViewById(R.id.tab_layout1);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), login.class));
            }
        });
        // Attach TabLayout to ViewPager2
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Description");
                            break;
                        case 1:
                            tab.setText("Images");
                            break;
                        case 2:
                            tab.setText("Reviews");
                            break;
                    }
                }
        ).attach();
    }

    // Adapter for ViewPager2
    private class MyViewPagerAdapter extends FragmentStateAdapter {

        public MyViewPagerAdapter(@NonNull AppCompatActivity activity) {
            super(activity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return new DescriptionFragment();
                case 1:
                    return new ImagesFragment();
                case 2:
                    return new ReviewsFragment();
                default:
                    return new DescriptionFragment();
            }
        }

        @Override
        public int getItemCount() {
            return 3; // Adjust this according to the number of fragments you have
        }
    }



}

