package com.example.bigmovie.found;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 且以白首共余生。 on 2017/2/28.
 */
public class MyAdapter extends FragmentPagerAdapter{
    private ArrayList<Found_item> fragmentList;
    private String[] titlename;

    public MyAdapter(FragmentManager fm, ArrayList<Found_item> fragmentList, String[] titlename) {
        super(fm);
        this.fragmentList=fragmentList;
        this.titlename=titlename;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    //获得页面标题
    @Override
    public CharSequence getPageTitle(int position) {
        //返回当前标题
        return titlename[position];
    }
}
