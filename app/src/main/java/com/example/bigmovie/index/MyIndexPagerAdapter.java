package com.example.bigmovie.index;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

/**
 * Created by 且以白首共余生。 on 2017/2/26.
 */
public class MyIndexPagerAdapter extends PagerAdapter{
    private ImageView[] imageViews;

    public MyIndexPagerAdapter(ImageView[] imageViews) {
        this.imageViews = imageViews;
    }

    @Override
    public int getCount() {
//        return this.imageViews.length;
        return this.imageViews.length*100;
//        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        position%=this.imageViews.length;
        if (position<0){
            position=position+this.imageViews.length;
        }
        ImageView imageView=imageViews[position];
        //
        ViewParent viewParent=imageView.getParent();
        if (viewParent!=null){
            ViewGroup viewGroup= (ViewGroup) viewParent;
            viewGroup.removeView(imageView);
        }
        container.addView(imageView);


//        container.addView(imageViews[position]);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //如果
//        container.removeView(imageViews[position]);
    }
}
