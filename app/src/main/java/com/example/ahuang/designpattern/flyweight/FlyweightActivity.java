package com.example.ahuang.designpattern.flyweight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FlyweightActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyweight);
        ButterKnife.bind(this);

        Flyweight flyweightX = FlyweightFactory.getFlyweight("X");
        Flyweight flyweightY = FlyweightFactory.getFlyweight("Y");
        Flyweight flyweightZ = FlyweightFactory.getFlyweight("Z");
        Flyweight flyweightReX = FlyweightFactory.getFlyweight("X");
        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight("X");


        Ticket ticket01 = TicketFactory.getTicket("北京", "青岛");
        ticket01.showTicketInfo("business");

        Ticket ticket02 = TicketFactory.getTicket("北京", "青岛");
        ticket02.showTicketInfo("one");

        Ticket ticket03 = TicketFactory.getTicket("北京", "青岛");
        ticket03.showTicketInfo("two");

        Ticket ticket04 = TicketFactory.getTicket("北京", "济南");
        ticket04.showTicketInfo("two");

        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(false);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/2d53af718ad0");


    }
}
