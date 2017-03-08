package com.example.bigmovie.found;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by 且以白首共余生。 on 2017/3/6.
 */
public class MyControll {
    private Context context;
    private MySQLite_Shoucang mySQLite_shoucang;
    private SQLiteDatabase db;

    public MyControll(Context context){
        this.context=context;
        mySQLite_shoucang=new MySQLite_Shoucang(context);
        db=mySQLite_shoucang.getWritableDatabase();
    }


    public void shoucang(String title,String img){
        String sql="insert into "+MySQLite_Shoucang.Table_name+" values(null,'"+title+"','"+img+"')";
        db.execSQL(sql);
    }

}
