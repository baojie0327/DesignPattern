package com.example.ahuang.designpattern.commandmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.ahuang.designpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CommandModeActivity extends AppCompatActivity {

    @BindView(R.id.webView)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_mode);
        ButterKnife.bind(this);

        // 构造一个接收者对象
        Receiver receiver = new Receiver();
        // 根据接收者对象构造一个命令对象
        Command command = new ConcreteCommand(receiver);
        // 根据具体的对象构造请求者对象
        Invoker invoker = new Invoker(command);
        // 执行请求方法
        invoker.action();


        // 首先要有一个接收者对象
        ChangeReceiver changeReceiver = new ChangeReceiver();
        // 构造四个命令
        AddItemCommand addItemCommand = new AddItemCommand(changeReceiver);
        SubtractItemCommand subtractItemCommand = new SubtractItemCommand(changeReceiver);
        AddVoiceCommand addVoiceCommand = new AddVoiceCommand(changeReceiver);
        SubtractVoiceCommand subtractVoiceCommand = new SubtractVoiceCommand(changeReceiver);

        // 组装遥控器，把代表不同命令的按键组装到遥控器上
        RemoteControler remoteControler = new RemoteControler();
        remoteControler.setAddItemCommand(addItemCommand);
        remoteControler.setSubtractItemCommand(subtractItemCommand);
        remoteControler.setAddVoiceCommand(addVoiceCommand);
        remoteControler.setSubtractVoiceCommand(subtractVoiceCommand);

        // 我们可以愉快地通过遥控器对电视发出遥控指令了
        remoteControler.addItem();
        remoteControler.subtractItem();
        remoteControler.addVoice();
        remoteControler.subtractVoice();


        WebSettings webSettings = webView.getSettings();
        webSettings .setSupportZoom(false);
        webSettings .setUseWideViewPort(true);
        webSettings .setLoadWithOverviewMode(true);
        webSettings .setDefaultTextEncodingName("utf-8");
        webSettings .setLoadsImagesAutomatically(true);

        webView.loadUrl("https://www.jianshu.com/p/aa3e2fbe503b");

    }

}
