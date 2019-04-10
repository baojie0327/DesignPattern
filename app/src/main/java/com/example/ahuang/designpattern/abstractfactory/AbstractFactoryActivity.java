package com.example.ahuang.designpattern.abstractfactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;
import com.example.ahuang.designpattern.abstractfactory.factory.Phone1;
import com.example.ahuang.designpattern.abstractfactory.factory.Phone2;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AbstractFactoryActivity extends AppCompatActivity {


    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        ButterKnife.bind(this);

        System.out.println("生产高通CPU+三星屏幕的手机");
        Phone1 phone1 = new Phone1();
        phone1.createCpu().calculate();
        phone1.createScreen().display();
        System.out.println("==============================");
        System.out.println("生产MTK CPU+LG屏幕的手机");
        Phone2 phone2 = new Phone2();
        phone2.createCpu().calculate();
        phone2.createScreen().display();

        WebSettings webSettings = webView.getSettings();
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webSettings.setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/a8a99782f026");
    }
}
