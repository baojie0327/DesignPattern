package com.example.ahuang.designpattern.builder;

/**
 * Created by Frank on 2016/11/8 15:36.
 * Email:512395540@qq.com
 */

/**
 * 计算机抽象类，即Product角色
 * 被生成器构建的复杂对象，包含多个部件
 */
public  class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer(){

    }
    //设置机箱
    public void setBoard(String board) {
        mBoard = board;
    }
    //设置显示器
    public void setDisplay(String display) {
        mDisplay = display;
    }
    //设置操作系统
    public void setOS(String OS) {
        mOS = OS;
    }

    @Override
    public String toString() {
        return "Computer:"+"mBoard="+mBoard+",mDisplay="+mDisplay+",mOS="+mOS;
    }
}
