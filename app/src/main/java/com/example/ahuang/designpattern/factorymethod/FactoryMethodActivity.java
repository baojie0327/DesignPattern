package com.example.ahuang.designpattern.factorymethod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;
import com.example.ahuang.designpattern.factorymethod.factory.AudiFactory;
import com.example.ahuang.designpattern.factorymethod.factory.BenzFactory;
import com.example.ahuang.designpattern.factorymethod.factory.Factory;
import com.example.ahuang.designpattern.factorymethod.product.Product;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FactoryMethodActivity extends AppCompatActivity {


    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method);
        ButterKnife.bind(this);

        // Audi
        Factory audiFactory = new AudiFactory();  // 工厂
        Product audiProduct = audiFactory.creatProduct();  // 产品
        audiProduct.drive();
        // Benz
        Factory benzFactory = new BenzFactory(); // 工厂
        Product benzProduct = benzFactory.creatProduct(); // 产品
        benzProduct.drive();

        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(false);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/2b86b88523fd");


    }
}
