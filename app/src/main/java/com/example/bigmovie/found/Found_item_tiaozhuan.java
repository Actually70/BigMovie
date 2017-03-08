package com.example.bigmovie.found;

import android.webkit.WebView;

import com.example.bigmovie.BaseActivity;
import com.example.bigmovie.R;

/**
 * Created by 且以白首共余生。 on 2017/3/4.
 */
public class Found_item_tiaozhuan extends BaseActivity{
    private WebView webView;
    @Override
    public void initAfter() {

    }

    @Override
    public void initView() {
        String url=getIntent().getStringExtra("url");
        webView= (WebView) findViewById(R.id.webView);
        webView.loadUrl(url);
    }

    @Override
    public void setLayout() {
        setContentView(R.layout.activity_found_item_tiaozhuan);
    }
}
