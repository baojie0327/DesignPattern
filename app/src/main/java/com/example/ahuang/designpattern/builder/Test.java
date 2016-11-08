package com.example.ahuang.designpattern.builder;

/**
 * Created by Hbj on 2016/11/8 17:45.
 * Email:512395540@qq.com
 */

/**
 * 测试代码
 */
public class Test {
    public static void main(String[] args){
        //构建器
        Builder mBuilder=new MacbookBuilder();
        //Director
        Director mDirector=new Director(mBuilder);
        //构建过程
        mDirector.construct("Intel主板","Retina显示器","Windows 10系统");
        System.out.println(mBuilder.create().toString());

    }


}
