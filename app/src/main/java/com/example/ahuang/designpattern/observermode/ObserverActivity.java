package com.example.ahuang.designpattern.observermode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ObserverActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        ButterKnife.bind(this);

        // 创建一个被观察者
        ConcreteSubject subject = new ConcreteSubject();
        // 定义一个观察者
        Observer observer = new ConcreteObserver();
        // 注册观察者
        subject.addObserver(observer);
        // 开始观察
        subject.doSomething();

        // 被观察者
        DevelopTribune developTribune = new DevelopTribune();
        // 观察者
        Developer developer1 = new Developer("Lucy");
        Developer developer2 = new Developer("James");
        Developer developer3 = new Developer("Jackson");
        // 注册观察者
        developTribune.addObserver(developer1);
        developTribune.addObserver(developer2);
        developTribune.addObserver(developer3);

        // 发布更新
        developTribune.postNewPublish("新技术来袭！");


        WebSettings webSettings = webView.getSettings();
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webSettings.setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/bab1dee3d5cc");
    }
}
