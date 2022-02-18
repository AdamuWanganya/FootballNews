package com.moringa.footballnews.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter {

        private ArrayList<Fragment> fragmentList;
        private  ArrayList<String> titlesList;

public PagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> fragments,ArrayList<String> titlesList){
    super(fragmentManager);
    this.titlesList = titlesList;
    this.fragmentList = fragments;
}

    public String getPageTitle(int position) {
        return titlesList.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

}
