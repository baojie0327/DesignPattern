package com.example.ahuang.designpattern.prototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PrototypeActivity extends AppCompatActivity {


    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        ButterKnife.bind(this);


        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(false);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/c0489979f60b");

        Resume resume1 = new Resume();
        resume1.setName("Jackson");
        resume1.setBirthday("1990-05-23");
        resume1.setSchool("华中科技大学");
        resume1.addCompany("腾讯");
        resume1.addCompany("阿里巴巴");
        resume1.addCompany("百度");


        Resume resume2 = (Resume) resume1.clone();
        resume2.setName("Lucy");
        resume2.setBirthday("1992-05-17");
        resume2.setSchool("华东师范大学");

        resume2.addCompany("小米");


        System.out.println("-------------------- resume1 ----------------------");
        resume1.display();
        System.out.println("-------------------- resume2 ----------------------");
        resume2.display();

    }
}
