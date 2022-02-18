package com.moringa.footballnews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.moringa.footballnews.adapters.PagerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tabLayout)  TabLayout tabLayout;
    @BindView(R.id.viewpager )
    ViewPager viewPager;

    ArrayList<String> titles  = new ArrayList<>();
    ArrayList<Fragment> fragments  = new ArrayList<>();


    private String[] teams = new String[] {"Aresnal","Manu","Liverpool", "Man City","Tottenham"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        titles.add("LEAGUES");
        titles.add("MATCHES");
        titles.add("FAVORITE");

        fragments.add(new LeaguesFragment());
        fragments.add(new MatchesFragment());
        fragments.add(new FavoriteFragment());

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),fragments,titles);

        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


           }



}