package com.example.ahuang.designpattern.decoratemode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 装饰模式
 */

public class DecorateActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorate);
        ButterKnife.bind(this);

        // 首先要现有一杯奶茶
        MilkTea milkTea = new MilkTea();
        System.out.println("------制作蓝莓奶茶-------");
        // 制作蓝莓奶茶
        BlueberryDecorator blueberryDecorator = new BlueberryDecorator(milkTea);
        blueberryDecorator.makeBeverage();
        // 制作珍珠奶茶
        System.out.println("------制作珍珠奶茶-------");
        PearlDecorator pearlDecorator = new PearlDecorator(milkTea);
        pearlDecorator.makeBeverage();


        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(false);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/9d0d06bceeb0");

    }
}
