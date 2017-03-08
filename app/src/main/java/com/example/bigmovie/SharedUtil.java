package com.example.bigmovie;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by 且以白首共余生。 on 2017/2/25.
 */
public class SharedUtil {
    private static final String SHARED_NAME="actually";
    private Context context;

    public SharedUtil(Context context) {
        this.context = context;
    }

    //保存数据
    public void saveMyTag(int p){
        SharedPreferences sp=context.getSharedPreferences(SHARED_NAME,Context.MODE_PRIVATE);//私有模式
        SharedPreferences.Editor editor=sp.edit();
        editor.putInt("p",p);//保存数据
        editor.commit();//提交
    }

    //获取数据
    public int getMyTag(){
        SharedPreferences sp=context.getSharedPreferences(SHARED_NAME,Context.MODE_PRIVATE);//私有模式
        return sp.getInt("p",0);//若没获取到，则默认为0
    }

}
