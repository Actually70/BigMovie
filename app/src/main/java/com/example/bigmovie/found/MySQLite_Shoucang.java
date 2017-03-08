package com.example.bigmovie.found;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 且以白首共余生。 on 2017/3/6.
 */
public class MySQLite_Shoucang extends SQLiteOpenHelper{

    public static final String Table_name="shoucang";
    private static final String SQLite_name="actually.db";

    public MySQLite_Shoucang(Context context) {
        super(context, SQLite_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table "+Table_name+" (id integer primary key autoincrement,title varchar(100) not null,img varchar(100) not null)";
        db.execSQL(sql);//添加数据表

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
