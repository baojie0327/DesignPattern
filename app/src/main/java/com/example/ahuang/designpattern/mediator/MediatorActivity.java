package com.example.ahuang.designpattern.mediator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MediatorActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);
        ButterKnife.bind(this);

        // 构造中介者
        ConcreteMediator concreteMediator = new ConcreteMediator();
        // 构造两个同事
        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA(concreteMediator);
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB(concreteMediator);
        // 为中介者设置同事
        concreteMediator.setConcreteColleagueA(concreteColleagueA);
        concreteMediator.setConcreteColleagueB(concreteColleagueB);
        // 执行中介方法
        concreteMediator.method();

        // 构造链家的房地产中介
        LianJiaHouseMediator lianJiaHouseMediator = new LianJiaHouseMediator();
        // 构造买家和卖家
        CustomerBuyer buyer = new CustomerBuyer(lianJiaHouseMediator);
        CustomerSeller seller = new CustomerSeller(lianJiaHouseMediator);
        // 为买家和卖家设置中介
        lianJiaHouseMediator.setCustomerBuyer(buyer);
        lianJiaHouseMediator.setCustomerSeller(seller);
        // 模拟交易过程
        lianJiaHouseMediator.method();


        WebSettings webSettings = webView.getSettings();
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webSettings.setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/7c574a580aca");

    }
}
