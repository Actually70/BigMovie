package com.example.bigmovie.index;

import android.content.Context;
import android.util.Log;
import android.widget.ListView;

import com.example.bigmovie.BaseActivity;
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
 * Created by 且以白首共余生。 on 2017/2/26.
 */
public class IndexActivity_item_1 extends BaseActivity{
    private Retrofit retrofit;
    private ListView listView;
    @Override
    public void initAfter() {

    }

    @Override
    public void initView() {
        getRetrofit(IndexActivity_item_1.this);
    }

    @Override
    public void setLayout() {
        setContentView(R.layout.activity_index_item1);
    }

    //Android网络框架之：Retrofit
    public void getRetrofit(final Context context){
        listView= (ListView) findViewById(R.id.listView);

        //初始化Retrofit对象
        retrofit=new Retrofit.Builder().baseUrl("http://newapi.meipai.com/output/").addConverterFactory(GsonConverterFactory.create()).build();
        //准备请求网络
        setWeatherService weatherService= retrofit.create(setWeatherService.class);
        //回调获得结果
        Call<List<MyBean>> call=weatherService.getBean(16);
        //请求加入调度
        call.enqueue(new Callback<List<MyBean>>() {

            @Override
            public void onFailure(Call<List<MyBean>> call, Throwable t) {

            }

            @Override
            public void onResponse(Call<List<MyBean>> call, Response<List<MyBean>> response) {
                Log.e("msg",response.body().toString());

                listView.setAdapter(new MyAdapter(context,response.body()));
            }
        });
}
    //定义接口
    public interface setWeatherService{
        @GET("channels_topics_timeline.json")
        Call<List<MyBean>> getBean(@Query("id") int id);
    }
}
