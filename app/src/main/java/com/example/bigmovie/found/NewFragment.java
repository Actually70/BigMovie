package com.example.bigmovie.found;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.bigmovie.R;

/**
 * Created by 且以白首共余生。 on 2017/3/10.
 */
public class NewFragment extends Fragment {
    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_found_new,null);
        webView= (WebView) view.findViewById(R.id.webView);
        String url=getActivity().getIntent().getStringExtra("url");

        webView.loadUrl(url);

        return view;
    }
}
