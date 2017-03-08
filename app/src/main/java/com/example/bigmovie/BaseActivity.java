package com.example.bigmovie;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout();
        initView();
        initAfter();
    }

    public abstract void initAfter();

    public abstract void initView();

    public abstract void setLayout();

    //跳转
    public void gotoActivity(Context context,Class<?> activity){
        startActivity(new Intent(context,activity));
    }
}
