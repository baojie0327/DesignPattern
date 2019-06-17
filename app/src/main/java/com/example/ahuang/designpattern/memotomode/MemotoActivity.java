package com.example.ahuang.designpattern.memotomode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MemotoActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoto);
        ButterKnife.bind(this);

        // 创建Originator
        UserInfoOriginator originator = new UserInfoOriginator();
        // 创建管理者
        Caretaker caretaker = new Caretaker();

        originator.setUserName("Jackson");
        originator.setPassword("123456");
        originator.setPhoneNumber("18310056896");

        System.out.println("-----初始状态----");
        originator.show();

        // 保存状态
        caretaker.setMemoto(originator.saveMemoto());

        // 修改状态
        originator.setPassword("25268522");
        originator.setPhoneNumber("18598653256");
        System.out.println("-----修改后状态----");
        originator.show();

        //恢复状态
        originator.restoreMemoto(caretaker.getMemoto());
        System.out.println("-----回复后状态----");
        originator.show();

        WebSettings webSettings = webView.getSettings();
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webSettings.setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/111809e74937");

    }
}
