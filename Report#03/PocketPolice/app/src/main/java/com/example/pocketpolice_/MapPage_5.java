package com.example.pocketpolice_;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MapPage_5 extends AppCompatActivity {
    private WebView mWebView;
    private WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_page_5);
        mWebView=(WebView)findViewById(R.id.webView);
        mWebView.setWebViewClient(new WebViewClient());
        webSettings=mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://220.125.195.158/");
    }


}
