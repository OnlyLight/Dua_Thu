package com.quangduyv2017.asysnc_task;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        addShow();

        Intent intent = getIntent();

        String link = intent.getStringExtra("Link"); // Lấy đường link
        webView.loadUrl(link); // Load đường link đã lấy ra
        webView.setWebViewClient(new WebViewClient()); // Người dùng bấm vào đường link khác không bị văng ra khỏi app
    }

    public void addShow() {
        webView = (WebView) findViewById(R.id.webView);
    }
}
