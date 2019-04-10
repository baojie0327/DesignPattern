package com.example.ahuang.designpattern.builderpattern;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BuilderActivity extends AppCompatActivity {


    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        ButterKnife.bind(this);


        Builder builder = new MacbookBulder();
        Director director = new Director(builder);
        director.constract("英特尔主板", "Retina显示器", "Mac OS X系统");
        System.out.println(builder.getComputer().toString());

        ThinkPad thinkPad = new ThinkPad.Builder().setBoard("Intel").setDisplay("JDI").setOs("Windows 10").builder();
        System.out.println("ThinkPad:" + "board=" + thinkPad.getBoard() + " display=" + thinkPad.getDisplay() + " os=" + thinkPad.getOs());

        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("Title")
                .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create()
                .show();

        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(false);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/bc798e5e63b1");

    }
}
