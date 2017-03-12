package com.example.bigmovie.found;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 且以白首共余生。 on 2017/3/6.
 */
public class MyControll {
    private Context context;
    private MySQLite_Shoucang mySQLite_shoucang;
    private SQLiteDatabase db;
    private ArrayList<ShouCangData> list;

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Toast.makeText(context,(String)msg.obj,Toast.LENGTH_SHORT).show();
        }
    };

    public MyControll(Context context){
        this.context=context;
        mySQLite_shoucang=new MySQLite_Shoucang(context);
        db=mySQLite_shoucang.getWritableDatabase();
    }


    public void addNews(ArrayList<MyNowData.ResultBean.DataBean> datalist,int position,Context context){
        String sql="insert into "+MySQLite_Shoucang.Table_name+" values(null,'"+datalist.get(position).getTitle()+"','"+datalist.get(position).getThumbnail_pic_s()+"')";
        boolean flag=false;

        for (ShouCangData data:queryAll()){
            do {
                if (datalist.get(position).getTitle().equals(data.getTv_title())){
                    flag=true;
                }else {

                }
            }while (flag==true);
        }

        if (flag==false){
            db.execSQL(sql);
            Log.e("msg","收藏");
            Toast.makeText(context,"收藏！",Toast.LENGTH_SHORT).show();
        }else {
            String str="对不起，你已经收藏该条新闻了！";
            Message msg=new Message();
            msg.obj=str;
            handler.sendMessage(msg);
        }

    }

    //查询
    public ArrayList<ShouCangData> queryAll(){
        String sql="select * from "+MySQLite_Shoucang.Table_name;
        Cursor cursor=db.rawQuery(sql,null);
        ShouCangData shouCangData;
        list=new ArrayList<ShouCangData>();
        while (cursor.moveToNext()){
            shouCangData=new ShouCangData();
            shouCangData.setTv_title(cursor.getString(cursor.getColumnIndex("title")));
            shouCangData.setImg_title(cursor.getString(cursor.getColumnIndex("img")));
            list.add(shouCangData);
        }
        return list;
    }

}
