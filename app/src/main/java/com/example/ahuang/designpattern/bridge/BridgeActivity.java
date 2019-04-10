package com.example.ahuang.designpattern.bridge;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BridgeActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);
        ButterKnife.bind(this);

        // 原味的
        OrdinaryMilkTea ordinaryMilkTea = new OrdinaryMilkTea();
        // 加糖
        SugerAddMilkTea sugerAddMilkTea = new SugerAddMilkTea();

        // 大杯原味
        LargeMilkTea largeMilkTeaOrdinary = new LargeMilkTea(ordinaryMilkTea);
        largeMilkTeaOrdinary.makeMilkTea();

        // 大杯加糖
        LargeMilkTea largeMilkTeaSuger = new LargeMilkTea(sugerAddMilkTea);
        largeMilkTeaSuger.makeMilkTea();

        // 小杯原味
        SmallMilkTea smallMilkTeaOrdinary = new SmallMilkTea(ordinaryMilkTea);
        smallMilkTeaOrdinary.makeMilkTea();

        // 小杯加糖
        SmallMilkTea smallMilkTeaSuger = new SmallMilkTea(sugerAddMilkTea);
        smallMilkTeaSuger.makeMilkTea();

        //中杯原味
        MiddleMilkTea middleMilkTeaOrdinary = new MiddleMilkTea(ordinaryMilkTea);
        middleMilkTeaOrdinary.makeMilkTea();

        // 中杯加糖
        MiddleMilkTea middleMilkTeaSuger = new MiddleMilkTea(sugerAddMilkTea);
        middleMilkTeaSuger.makeMilkTea();

        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/3a7eb444b466");

    }
}
