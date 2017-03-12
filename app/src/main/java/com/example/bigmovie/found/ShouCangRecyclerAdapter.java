package com.example.bigmovie.found;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bigmovie.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by 且以白首共余生。 on 2017/3/10.
 */
public class ShouCangRecyclerAdapter extends RecyclerView.Adapter<ShouCangRecyclerAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<ShouCangData> shouCanglist;

    public ShouCangRecyclerAdapter(Context context,ArrayList<ShouCangData> shouCanglist) {
        this.context = context;
        this.shouCanglist=shouCanglist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_found_shoucang_adapter,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv_title.setText(shouCanglist.get(position).getTv_title());
        Picasso.with(context).load(shouCanglist.get(position).getImg_title()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(holder.img_title);

        Log.e("msg",shouCanglist.get(position).getTv_title());
    }

    @Override
    public int getItemCount() {
        return shouCanglist.size();
    }

    //更新适配器
    public ArrayList<ShouCangData> getList(){
        notifyDataSetChanged();
        return shouCanglist;
    }

    //内部类aa
    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_title;
        private ImageView img_title;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_title= (TextView) itemView.findViewById(R.id.tv_title);
            img_title= (ImageView) itemView.findViewById(R.id.img_title);

        }
    }
}
