package com.example.bigmovie.found;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by 且以白首共余生。 on 2017/3/6.
 */
public class MyControll {
    private Context context;
    private MySQLite_Shoucang mySQLite_shoucang;
    private SQLiteDatabase db;
    private ArrayList<ShouCangData> list;

    public MyControll(Context context){
        this.context=context;
        mySQLite_shoucang=new MySQLite_Shoucang(context);
        db=mySQLite_shoucang.getWritableDatabase();
    }


    public void shoucang(String title,String img){
        String sql="insert into "+MySQLite_Shoucang.Table_name+" values(null,'"+title+"','"+img+"')";
        db.execSQL(sql);
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
