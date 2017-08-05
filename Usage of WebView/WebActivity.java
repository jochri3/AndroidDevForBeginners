package com.example.lislis.mesexercices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_activity);
        web=(WebView)findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new MonWeb());
        web.loadUrl("http://192.168.1.14:8000/craj/");
    }
}

class MonWeb extends WebViewClient
{
    @Override
    public boolean shouldOverrideUrlLoading(WebView v,String url)
    {
        v.loadUrl(url);
        return true;
    }
}