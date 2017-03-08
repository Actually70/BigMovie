package com.example.bigmovie.index;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bigmovie.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 且以白首共余生。 on 2017/2/27.
 */
public class MyAdapter extends BaseAdapter{
    private Context context;
    private List<MyBean> list;

    public MyAdapter(Context context, List<MyBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_index_adapter, null);
        }
        ImageView img= (ImageView) convertView.findViewById(R.id.img);
        TextView tv_title= (TextView) convertView.findViewById(R.id.tv_title);
        TextView tv_count= (TextView) convertView.findViewById(R.id.tv_count);

        Picasso.with(context).load(list.get(position).getCover_pic())
                //加载过程中显示的图片
                .placeholder(R.mipmap.ic_launcher)
                //加载失败后显示的图片
                .error(R.mipmap.ic_launcher)
                .into(img);
        tv_title.setText(list.get(position).getScreen_name()+"");
        tv_count.setText(list.get(position).getPlays_count()+"");

        return convertView;
    }
}
