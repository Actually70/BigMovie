package com.example.bigmovie.found;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bigmovie.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by 且以白首共余生。 on 2017/2/28.
 */
public class Found_item extends Fragment {
    private String type;
    private Retrofit retrofit;
    private TextView textView;
    private RecyclerView recyclerView;//ListView的替代品
    private RecyclerViewAdapter recyclerViewAdapter;
    private SwipeRefreshLayout refreshLayout;

    public Found_item(){//此处不宜构造传值

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //采用Bundle传值之获取值方法一
//        Bundle bundle=new Bundle();
//        type=bundle.getString("type");
        //采用Bundle传值之获取值方法二
        type=getArguments().getString("type");

        View view=inflater.inflate(R.layout.activity_found_item,null);
        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerview);
        //设置布局管理器，决定布局样式
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //设置适配器
        recyclerViewAdapter=new RecyclerViewAdapter(getContext());
        getRetrofit(type,false);
        recyclerView.setAdapter(recyclerViewAdapter);
        //设置动画
//        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //为recyclerView设置监听器
        recyclerViewAdapter.setOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent=new Intent(getContext(),Found_item_tiaozhuan.class);
                String url=recyclerViewAdapter.getList().get(position).getUrl();
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });




        //下拉刷新
        refreshLayout= (SwipeRefreshLayout) view.findViewById(R.id.refreshlayout);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //显示进度条
                refreshLayout.setRefreshing(true);
                //下拉后的操作
                getRetrofit(type,true);
            }
        });

        return view;
    }


    //网络获取json数据
    //Android网络框架之：Retrofit
    public void getRetrofit(String type, final boolean isupdate){

        //初始化Retrofit对象
        retrofit=new Retrofit.Builder().baseUrl("http://v.juhe.cn/toutiao/").addConverterFactory(GsonConverterFactory.create()).build();
        //准备请求网络
        setWeatherService weatherService= retrofit.create(setWeatherService.class);
        //回调获得结果
        Call<MyNowData> call=weatherService.getBean(type,"8b41621da64fb5a7db660117a62cfa36");
        //请求加入调度
        call.enqueue(new Callback<MyNowData>() {

            @Override
            public void onFailure(Call<MyNowData> call, Throwable t) {
                //当网络加载失败也收起（隐藏）进度条
                refreshLayout.setRefreshing(false);
            }

            @Override
            public void onResponse(Call<MyNowData> call, Response<MyNowData> response) {
                List<MyNowData.ResultBean.DataBean> datalist=response.body().getResult().getData();
                //判断什么时候刷新
                if (isupdate){//如果是true
                    recyclerViewAdapter.updateList(datalist);
                    //当加载成功后收起（隐藏）进度条
                    refreshLayout.setRefreshing(false);
                }else {//是false
                    recyclerViewAdapter.addList(datalist);
                }
                recyclerViewAdapter.addList(datalist);

            }
        });
    }

    //定义接口
    public interface setWeatherService{
        @GET("index")
        Call<MyNowData> getBean(@Query("type") String type, @Query("key") String key);
    }

}
