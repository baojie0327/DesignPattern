package com.example.ahuang.designpattern.SimpleFactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;
import com.example.ahuang.designpattern.SimpleFactory.Impl.AudiCarProduct;
import com.example.ahuang.designpattern.SimpleFactory.Impl.BenzCarProduct;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SimpleFactoryActivity extends AppCompatActivity {


    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        ButterKnife.bind(this);
        // 得到工厂对象
        CarFactory carFactory = new CarFactory();
        // 生产Audi汽车
        AudiCarProduct audiCarProduct = (AudiCarProduct) carFactory.getCarProduct("audi");
        audiCarProduct.drive();
        // 生产Benz汽车
        BenzCarProduct benzCarProduct = (BenzCarProduct) carFactory.getCarProduct("benz");
        benzCarProduct.drive();

        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(false);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/9a2fdedfc630");


    }


}
