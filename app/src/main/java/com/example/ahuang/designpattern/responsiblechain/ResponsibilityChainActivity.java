package com.example.ahuang.designpattern.responsiblechain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResponsibilityChainActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responsibility_chain);
        ButterKnife.bind(this);


        // 构造一个ConcreteHandler1对象
        ConcreteHandler1 handler1 = new ConcreteHandler1();

        // 构造一个ConcreteHandler2对象
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        // 设置handler1的下一个节点
        handler1.successor = handler2;

        // 设置handler2的下一个节点
        handler2.successor = handler1;

        // 处理请求
        handler1.handleRequest("ConcreteHandler1");


        // 构造三个处理对象
        AbstractHandler handler11 = new Handler1();
        AbstractHandler handler12 = new Handler2();
        AbstractHandler handler13 = new Handler3();
        // 设置当前处理对象的下一个节点的处理者对象
        handler11.nexthandler = handler12;
        handler12.nexthandler = handler13;
        // 构造三个请求对象
        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request2("Request2");
        AbstractRequest request3 = new Request3("Request3");

        // 从链式的首端发起请求
        handler11.handleRequest(request1);
        handler11.handleRequest(request2);
        handler11.handleRequest(request3);


        // 构建各个领导
        Leader groupLeader = new GroupLeader();
        Leader departmentLeader = new DepartmnetLeader();
        Leader companyLeader = new CompanyLeader();
        // 设置上一级领导处理者
        groupLeader.nextHandler = departmentLeader;
        departmentLeader.nextHandler = companyLeader;

        // 发起合同申请
        groupLeader.handleRequest(10000);
        groupLeader.handleRequest(30000);
        groupLeader.handleRequest(80000);

        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(false);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/bf27498455ae");


    }
}
