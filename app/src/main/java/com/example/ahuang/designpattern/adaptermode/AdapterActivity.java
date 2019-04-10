package com.example.ahuang.designpattern.adaptermode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    /**
     * 适配器模式
     *
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        ButterKnife.bind(this);

        VoltAdapter adapter = new VoltAdapter();
        System.out.println("输出电压: " + adapter.getVole5());

        VoltsAdapter adapter1 = new VoltsAdapter(new Volt220());
        System.out.println("输出电压: " + adapter1.getVole5());

        WebSettings webSettings = webView.getSettings();
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webSettings.setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/7e4f8458d81c");

    }


}
