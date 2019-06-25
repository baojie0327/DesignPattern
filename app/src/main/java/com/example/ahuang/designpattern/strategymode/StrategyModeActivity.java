package com.example.ahuang.designpattern.strategymode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StrategyModeActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_mode);
        ButterKnife.bind(this);

        // 创建具体策略实现

        // 新客户
        IDiscountStrategy newDiscountStrategy = new NewCustomerStrategy();
        StrategyContext newStrategyContext = new StrategyContext(newDiscountStrategy);
        System.out.println("您消费的金额是：" + newStrategyContext.offerPrice(1000));

        // 老客户
        IDiscountStrategy oldDiscountStrategy = new OldCustomerStrategy();
        StrategyContext oldStrategyContext = new StrategyContext(oldDiscountStrategy);
        System.out.println("您消费的金额是：" + oldStrategyContext.offerPrice(900));

        // vip客户
        IDiscountStrategy vipDiscountStrategy = new VipCustomerStrategy();
        StrategyContext vipStrategyContext = new StrategyContext(vipDiscountStrategy);
        System.out.println("您消费的金额是：" + vipStrategyContext.offerPrice(800));

        WebSettings webSettings = webView.getSettings();
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webSettings.setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/9430dc6b322d");
    }
}
