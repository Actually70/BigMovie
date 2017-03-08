package com.example.bigmovie;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by 且以白首共余生。 on 2017/2/25.
 */
public class MyPagerAdapter extends PagerAdapter{
    private ArrayList<View> viewList;

    public MyPagerAdapter(ArrayList<View> viewList) {
        this.viewList = viewList;
    }

    @Override
    public int getCount() {
        return viewList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    //添加当前对象(即：当前View)
    @Override
    public Object instantiateItem(View container, int position) {
        ((ViewPager)container).addView(viewList.get(position));
        return viewList.get(position);
    }

    //移除当前对象(即：当前View)
    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager)container).removeView(viewList.get(position));
    }
}
