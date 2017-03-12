package com.example.bigmovie.found;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.example.bigmovie.BaseActivity;
import com.example.bigmovie.R;

import java.util.ArrayList;

/**
 * Created by 且以白首共余生。 on 2017/3/4.
 */
public class Found_item_tiaozhuan extends BaseActivity{
    private TextView tv_shoucang;
    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentlist;
    private Fragment fragment;

    @Override
    public void initAfter() {

    }

    @Override
    public void initView() {
        tv_shoucang= (TextView) findViewById(R.id.tv_shoucang);
        viewPager= (ViewPager) findViewById(R.id.viewPager);
        fragmentlist=new ArrayList<Fragment>();
        fragmentlist.add(new NewFragment());
        fragmentlist.add(new ShouCangFragment());

        viewPager.setAdapter(new Fragment_Adapter(getSupportFragmentManager(),fragmentlist));

    }

    @Override
    public void setLayout() {
        setContentView(R.layout.activity_found_item_tiaozhuan);
    }
}
