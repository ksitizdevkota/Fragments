package com.classpractice.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TableLayout;

import com.classpractice.fragments.fragment.AreaOfCircle;
import com.classpractice.fragments.fragment.FirstFragment;
import com.classpractice.fragments.adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;


public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager=findViewById(R.id.viewPager);
        tableLayout=findViewById(R.id.tabId);

        tableLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));

        ViewPagerAdapter pagerAdapter= new ViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new FirstFragment(),"Sum");
        pagerAdapter.addFragment(new AreaOfCircle(),"Area Of Circle");

        viewPager.setAdapter(pagerAdapter);
        tableLayout.setupWithViewPager(viewPager);


    }
}
