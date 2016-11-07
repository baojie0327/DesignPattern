package com.example.ahuang.designpattern.enumsingle2;

/**
 * Created by Frank on 2016/11/3 11:46.
 * Email:512395540@qq.com
 */
public class EnumDemo {
    public static void main(String[] args){
        SingletonEnum singletonEnum=SingletonEnum.INSTANCE;
        singletonEnum.setName("company");
        System.out.println(singletonEnum.getName());

        SingletonEnum singletonEnum1=SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2=SingletonEnum.INSTANCE;
        System.out.println("singletonEnum1---"+singletonEnum1+"--singletonEnum2");
        if (singletonEnum1==singletonEnum2){
            System.out.println("是同一个实例");
        }
    }

}
