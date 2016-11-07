package com.example.ahuang.designpattern.absfactory53;

import com.example.ahuang.designpattern.absfactory53.factory.AbstractFactory;
import com.example.ahuang.designpattern.absfactory53.factory.Schma1;


/**
 * Created by Frank on 2016/11/2 19:50.
 * Email:512395540@qq.com
 */
public class Client {
    public static void main(String[] args){
        //创建装机工程师对象
        ComputerEngineer computerEngineer=new ComputerEngineer();
        //客户选择并创建所需要使用的装机方案
        AbstractFactory schema=new Schma1();
        computerEngineer.makeComputer(schema);
    }
}
