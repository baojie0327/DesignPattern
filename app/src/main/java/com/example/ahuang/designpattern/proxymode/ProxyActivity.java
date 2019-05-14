package com.example.ahuang.designpattern.proxymode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import java.lang.reflect.Proxy;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProxyActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        ButterKnife.bind(this);

        // 构造一个租房者小明
        IRent XiaoMing = new XiaoMing();
        // 构造一个租房代理，将小明作为构造参数传递进去
        IRent agency = new RentAgency(XiaoMing);
        // 中介帮忙查找房源
        agency.findHouse();
        // 中介帮忙协商房租
        agency.consult();
        // 中介帮忙，签订租房合同
        agency.contract();
        // 完成租房
        agency.finish();

        // 构造一个动态代理
        DynamicRentProxy proxy = new DynamicRentProxy(XiaoMing);
        // 获取被代理类的ClassLoader
        ClassLoader loader = XiaoMing.getClass().getClassLoader();
        // 动态构造一个租房中介
        IRent renter = (IRent) Proxy.newProxyInstance(loader, new Class[]{IRent.class}, proxy);
        // 中介帮忙查找房源
        renter.findHouse();
        // 中介帮忙协商房租
        renter.consult();
        // 中介帮忙，签订租房合同
        renter.contract();
        // 完成租房
        renter.finish();

        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(false);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/e93633f8fc54");

    }
}
