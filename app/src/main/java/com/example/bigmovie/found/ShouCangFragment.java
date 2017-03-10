package com.example.bigmovie.found;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bigmovie.R;

import java.util.ArrayList;

/**
 * Created by 且以白首共余生。 on 2017/3/10.
 */
public class ShouCangFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<ShouCangData> shouCanglist;
    private MyControll myControll;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_found_shoucang,null);

        //获取数据(从收藏数据库里面获取)
        myControll=new MyControll(getContext());
        shouCanglist=myControll.queryAll();

        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerview);
        //设置布局管理器(非常重要的一步)
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new ShouCangRecyclerAdapter(getContext(),shouCanglist));

        return view;
    }
}
