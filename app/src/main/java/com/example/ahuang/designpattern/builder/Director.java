package com.example.ahuang.designpattern.builder;

/**
 * Created by Hbj on 2016/11/8 17:23.
 * Email:512395540@qq.com
 */

/**
 * Director类，负责构造Computer
 */
public class Director {
    Builder mBuilder=null;
    //构造方法
    public Director(Builder builder){
        this.mBuilder=builder;
    }
    /**
     * 构建对象
     */
    public void construct(String board,String display,String os){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs(os);
    }


}
