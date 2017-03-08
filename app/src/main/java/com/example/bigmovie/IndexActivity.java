package com.example.bigmovie;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bigmovie.found.MyAdapter;
import com.example.bigmovie.found.Found_item;
import com.example.bigmovie.index.ImageHandler;
import com.example.bigmovie.index.IndexActivity_item_1;
import com.example.bigmovie.index.MyIndexPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 且以白首共余生。 on 2017/2/25.
 */
public class IndexActivity  extends BaseActivity implements View.OnClickListener,ViewPager.OnPageChangeListener{
    public ViewPager viewPager,IndexViewPager;
    private TextView[] tv_=new TextView[4];
    private SharedUtil sharedUtil;
    private ImageView img_new_1;

    private int p;

    private ImageView[] imageViews;//Index首页图片资源
    private ImageView[] points=new ImageView[5];//Index首页圆点资源

    private ArrayList<View> viewList;

    private View view_index,view_found,view_my,view_more;
    public ImageHandler handler;

    @Override
    public void initAfter() {
    }

    @Override
    public void initView() {

        sharedUtil=new SharedUtil(this);
        p=sharedUtil.getMyTag();

        viewList=new ArrayList<>();

        viewPager= (ViewPager) findViewById(R.id.viewPager);

        tv_[0]= (TextView) findViewById(R.id.tv_index);
        tv_[1]= (TextView) findViewById(R.id.tv_found);
        tv_[2]= (TextView) findViewById(R.id.tv_my);
        tv_[3]= (TextView) findViewById(R.id.tv_more);



        //加载子布局
        LayoutInflater inflater=getLayoutInflater();
        view_index=inflater.inflate(R.layout.activity_index,null);
        view_found=inflater.inflate(R.layout.activity_found,null);
        view_my=inflater.inflate(R.layout.activity_my,null);
        view_more=inflater.inflate(R.layout.activity_more,null);



        //将子布局添加到ArrayList集合中
        viewList.add(view_index);
        viewList.add(view_found);
        viewList.add(view_my);
        viewList.add(view_more);

        //1.为TextView设置点击事件监听器
        //2.遍历为所有TextView设置字体颜色为黑色
        for (TextView textView:tv_){
            textView.setOnClickListener(this);
            textView.setTextColor(Color.BLACK);
        }

        //为ViewPager设置适配器
        viewPager.setAdapter(new MyPagerAdapter(viewList));
        //为index页面的ViewPager设置适配器


        //设置当前TextView的颜色为GREEN
        tv_[p].setTextColor(Color.GREEN);
        //设置ViewPager的初始界面为当前界面
        viewPager.setCurrentItem(p);

        //为ViewPager设置监听器
        viewPager.setOnPageChangeListener(this);

//        IndexViewPager();

    }

    //Index页面ViewPager
    public void IndexViewPager(){
        IndexViewPager= (ViewPager) findViewById(R.id.IndexViewPager);
        img_new_1= (ImageView) findViewById(R.id.img_new_1);

//        handler=new ImageHandler(new WeakReference<IndexActivity>(this));

        //数据源（首页图片）
        imageViews=new ImageView[5];
        for (int i=0;i<imageViews.length;i++){
            imageViews[i]=new ImageView(this);
        }

        //为所有ImageView设置初始图片资源
        imageViews[0].setImageResource(R.drawable.dao1);
        imageViews[1].setImageResource(R.drawable.dao2);
        imageViews[2].setImageResource(R.drawable.dao3);
        imageViews[3].setImageResource(R.drawable.dao4);
        imageViews[4].setImageResource(R.drawable.dao5);

        //找Index页面的ImageView(圆点)控件
        points[0]= (ImageView) findViewById(R.id.img_1);
        points[1]= (ImageView) findViewById(R.id.img_2);
        points[2]= (ImageView) findViewById(R.id.img_3);
        points[3]= (ImageView) findViewById(R.id.img_4);
        points[4]= (ImageView) findViewById(R.id.img_5);

        img_new_1.setOnClickListener(this);
        IndexViewPager.setAdapter(new MyIndexPagerAdapter(imageViews));

        IndexViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            //当前页面被选中时调用
            @Override
            public void onPageSelected(int position) {

//                handler.sendMessage(Message.obtain(handler, ImageHandler.MSG_PAGE_CHANGED, position, 0));





                    for (ImageView point:points){
                        point.setImageResource(R.drawable.point_normal);
                    }
                    points[position].setImageResource(R.drawable.point_select);

            }

            @Override
            public void onPageScrollStateChanged(int state) {
//                switch (state) {
//                    case ViewPager.SCROLL_STATE_DRAGGING:
//                        handler.sendEmptyMessage(ImageHandler.MSG_KEEP_SILENT);
//                        break;
//                    case ViewPager.SCROLL_STATE_IDLE:
//                        handler.sendEmptyMessageDelayed(ImageHandler.MSG_UPDATE_IMAGE, ImageHandler.MSG_DELAY);
//                        break;
//                    default:
//                        break;
//                }
            }
        });
//        viewPager.setCurrentItem(Integer.MAX_VALUE/2);//默认在中间，使用户看不到边界
//        开始轮播效果
//        handler.sendEmptyMessageDelayed(ImageHandler.MSG_UPDATE_IMAGE, ImageHandler.MSG_DELAY);
    }

    //Found页面
    public void Found(){
        String[] type={"top","shehui","guonei","guoji","yule","tiyu","junshi","keji","caijing","shishang"};
        String[] titlename={"头条","社会","国内","国际","娱乐","体育","军事","科技","财经","时尚"};
        TabLayout tabLayout;
        //找控件
        tabLayout= (TabLayout) findViewById(R.id.tablayout);
        ViewPager FoundViewPager= (ViewPager) findViewById(R.id.foundviewpager);


        //添加15个子布局(View)到ArrayList集合里面
        ArrayList<Found_item> foundViewList=new ArrayList<Found_item>();
        for (int i=0;i<type.length;i++){
            Found_item fragment=new Found_item();
            Bundle bundle=new Bundle();
            bundle.putString("type",type[i]);
            fragment.setArguments(bundle);
            foundViewList.add(fragment);
        }

        //为FoundViewPager设置适配器
        FoundViewPager.setAdapter(new MyAdapter(getSupportFragmentManager(),foundViewList,titlename));

        //设置tabLayout属性
        tabLayout.setupWithViewPager(FoundViewPager);
}


    @Override
    public void setLayout() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.tv_index:
                    viewPager.setCurrentItem(0);
                    break;
                case R.id.tv_found:
                    viewPager.setCurrentItem(1);
                    break;
                case R.id.tv_my:
                    viewPager.setCurrentItem(2);
                    break;
                case R.id.tv_more:
                    viewPager.setCurrentItem(3);
                    break;
                case R.id.img_new_1:
                    gotoActivity(IndexActivity.this, IndexActivity_item_1.class);
            }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    //当选中当前页的时候执行此方法
    @Override
    public void onPageSelected(int position) {
        p=position;

        //首先把所有TextView的字体颜色设置为白色
        for (TextView textView:tv_){
            textView.setTextColor(Color.BLACK);//黑色
        }
        //然后设置当前TextView的字体颜色为绿色
        tv_[position].setTextColor(Color.GREEN);//绿色

        switch (position){
            case 0:
                IndexViewPager();
                break;
            case 1:
                Found();
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    //生命周期之onStop()
    @Override
    protected void onStop() {//程序退出前保存数据

        sharedUtil=new SharedUtil(this);
        sharedUtil.saveMyTag(p);
        super.onStop();
    }
}
