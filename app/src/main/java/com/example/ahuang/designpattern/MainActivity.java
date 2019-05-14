package com.example.ahuang.designpattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.ahuang.designpattern.SimpleFactory.SimpleFactoryActivity;
import com.example.ahuang.designpattern.abstractfactory.AbstractFactoryActivity;
import com.example.ahuang.designpattern.adapter.MainAdapter;
import com.example.ahuang.designpattern.adaptermode.AdapterActivity;
import com.example.ahuang.designpattern.bridge.BridgeActivity;
import com.example.ahuang.designpattern.builderpattern.BuilderActivity;
import com.example.ahuang.designpattern.commandmode.CommandModeActivity;
import com.example.ahuang.designpattern.decoratemode.DecorateActivity;
import com.example.ahuang.designpattern.facademode.FacadeActivity;
import com.example.ahuang.designpattern.factorymethod.FactoryMethodActivity;
import com.example.ahuang.designpattern.flyweight.FlyweightActivity;
import com.example.ahuang.designpattern.mediator.MediatorActivity;
import com.example.ahuang.designpattern.prototype.PrototypeActivity;
import com.example.ahuang.designpattern.proxymode.ProxyActivity;
import com.example.ahuang.designpattern.responsiblechain.ResponsibilityChainActivity;
import com.example.ahuang.designpattern.singleton.SingletonActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    private MainAdapter mMainAdapter;
    private List<String> dataList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        dataList.add("单例模式");
        dataList.add("简单工厂模式");
        dataList.add("工厂方法模式");
        dataList.add("抽象工厂模式");
        dataList.add("Builder模式");
        dataList.add("原型模式");
        dataList.add("适配器模式");
        dataList.add("桥接模式");
        dataList.add("装饰模式");
        dataList.add("外观模式");
        dataList.add("享元模式");
        dataList.add("代理模式");
        dataList.add("责任链模式");
        dataList.add("命令模式");
        dataList.add("中介者模式");

        // 设置RecyclerView
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        mMainAdapter=new MainAdapter(R.layout.item_main_layout,dataList);
        recyclerView.setAdapter(mMainAdapter);
        mMainAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (position){
                    case 0:
                       startActivity(new Intent(MainActivity.this,SingletonActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this,SimpleFactoryActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this,FactoryMethodActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this,AbstractFactoryActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this,BuilderActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this,PrototypeActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this,AdapterActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(MainActivity.this,BridgeActivity.class));
                        break;
                    case 8:
                        startActivity(new Intent(MainActivity.this,DecorateActivity.class));
                        break;
                    case 9:
                        startActivity(new Intent(MainActivity.this,FacadeActivity.class));
                        break;
                    case 10:
                        startActivity(new Intent(MainActivity.this,FlyweightActivity.class));
                        break;
                    case 11:
                        startActivity(new Intent(MainActivity.this, ProxyActivity.class));
                        break;
                    case 12:
                        startActivity(new Intent(MainActivity.this, ResponsibilityChainActivity.class));
                        break;
                    case 13:
                        startActivity(new Intent(MainActivity.this, CommandModeActivity.class));
                        break;
                    case 14:
                        startActivity(new Intent(MainActivity.this, MediatorActivity.class));
                        break;
                }
            }
        });
    }
}
