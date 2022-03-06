package com.edulifesolutions.tabfragement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout TabLayout;
    private ViewPager ViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabLayout = findViewById(R.id.TabLayout);
        ViewPager = findViewById(R.id.ViewPager);

        TabLayout.setupWithViewPager(ViewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new Fragment1(),"CHATS");
        vpAdapter.addFragment(new Fragment2(),"STATUS");
        vpAdapter.addFragment(new Fragment3(),"CALLS");

        ViewPager.setAdapter(vpAdapter);

    }
}