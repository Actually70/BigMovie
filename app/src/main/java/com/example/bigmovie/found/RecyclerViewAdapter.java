package com.example.bigmovie.found;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bigmovie.R;
import com.example.bigmovie.found.MyNowData.ResultBean.DataBean;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 且以白首共余生。 on 2017/3/2.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<DataBean> datalist;
    private Context context;

    public RecyclerViewAdapter(Context context) {
        this.context=context;
        datalist=new ArrayList<DataBean>();
    }

    //添加数据
    public void addList(List<DataBean> datalist){
        if (this.datalist.containsAll(datalist)){//如果两个集合的数据全部相等
            return;
        }
        this.datalist.addAll(datalist);//将数据追加到新的集合后面
        notifyDataSetChanged();//刷新

    }

    //更新数据
    public void updateList(List<DataBean> datalist){
        this.datalist=datalist;
        notifyDataSetChanged();//刷新
    }

    //获得数据集合
   public List<DataBean> getList(){
       return datalist;
   }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            RecyclerView.ViewHolder myViewHolder;
            View view;
        if (viewType==1){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_found_adapter,parent,false);
            myViewHolder=new MyViewHolder(view);
        }else {
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_found_adapter2,parent,false);
            myViewHolder=new MyViewHolder2(view);
        }


//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_found_adapter,null);//这样写不能使CardView在屏幕上充满

        return myViewHolder;
    }

    //复写类型设置方法
    public int getItemViewType(int position){
        if (position%3==0){//偶数
            return 1;
        }else{
            return 2;
        }
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        //为recyclerView设置监听器
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context,"位置:"+position, Toast.LENGTH_SHORT).show();
                onItemClickListener.onItemClick(v,position);
            }
        });

        if (holder instanceof MyViewHolder){//如果holder是MyViewholder的实体
            final MyViewHolder myViewHolder=(MyViewHolder)holder;
            myViewHolder.tv_title.setText(datalist.get(position).getTitle());
            Picasso.with(context).load(datalist.get(position).getThumbnail_pic_s()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(myViewHolder.img_title);

            myViewHolder.tv_shoucang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MyControll myControll=new MyControll(context);
                    myControll.shoucang(datalist.get(position).getTitle(),datalist.get(position).getThumbnail_pic_s());

                    Toast.makeText(context,"这条新闻已经收藏好了",Toast.LENGTH_SHORT).show();
                }
            });

        }else{
            MyViewHolder2 myViewHolder2=(MyViewHolder2)holder;
            myViewHolder2.tv_title.setText(datalist.get(position).getTitle());
            Picasso.with(context).load(datalist.get(position).getThumbnail_pic_s()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(myViewHolder2.img_title1);
            Picasso.with(context).load(datalist.get(position).getThumbnail_pic_s02()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(myViewHolder2.img_title2);
            Picasso.with(context).load(datalist.get(position).getThumbnail_pic_s03()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(myViewHolder2.img_title3);

            myViewHolder2.tv_shoucang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MyControll myControll=new MyControll(context);
                    myControll.shoucang(datalist.get(position).getTitle(),datalist.get(position).getThumbnail_pic_s());

                    Toast.makeText(context,"这条新闻已经收藏好了",Toast.LENGTH_SHORT).show();
                }
            });
        }



    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_title,tv_shoucang;
        ImageView img_title;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_title= (TextView) itemView.findViewById(R.id.tv_title);
            img_title= (ImageView) itemView.findViewById(R.id.img_title);
            tv_shoucang= (TextView) itemView.findViewById(R.id.tv_shoucang);
        }
    }

    class MyViewHolder2 extends RecyclerView.ViewHolder{
        TextView tv_title,tv_shoucang;
        ImageView img_title1,img_title2,img_title3;
        public MyViewHolder2(View itemView) {
            super(itemView);
            tv_title= (TextView) itemView.findViewById(R.id.tv_title);
            tv_shoucang= (TextView) itemView.findViewById(R.id.tv_shoucang);
            img_title1= (ImageView) itemView.findViewById(R.id.img_title1);
            img_title2= (ImageView) itemView.findViewById(R.id.img_title2);
            img_title3= (ImageView) itemView.findViewById(R.id.img_title3);
        }
    }

    private OnItemClickListener onItemClickListener;
    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener=onItemClickListener;
    }
    //定义接口
    public interface OnItemClickListener{
        public void onItemClick(View view,int position);
    }
}
