package com.example.bigmovie.found;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 且以白首共余生。 on 2017/3/10.
 */
public class Fragment_Adapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragmentlist;

    public Fragment_Adapter(FragmentManager fm,ArrayList<Fragment> fragmentlist) {
        super(fm);
        this.fragmentlist=fragmentlist;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentlist.size();
    }
}
