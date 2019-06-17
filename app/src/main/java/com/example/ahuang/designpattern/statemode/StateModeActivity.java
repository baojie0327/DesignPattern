package com.example.ahuang.designpattern.statemode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StateModeActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_mode);
        ButterKnife.bind(this);

        LiftController liftController = new LiftController();
        liftController.setState(new OpenningState());  // 打开电梯门
        liftController.open();   // 此时不会生效
        liftController.close();
        liftController.run();   // 此时不会生效
        liftController.stop();  // 此时不会生效

        // 关闭电梯门
        liftController.setState(new ClosingState());
        liftController.open();
        liftController.close();  // 此时不会生效
        liftController.run();
        liftController.stop();   // 此时不会生效

        WebSettings webSettings = webView.getSettings();
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        webSettings.setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/02a0bfbc4db1");
    }
}
