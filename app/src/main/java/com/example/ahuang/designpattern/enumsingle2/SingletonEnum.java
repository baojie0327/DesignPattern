package com.example.ahuang.designpattern.enumsingle2;

/**
 * Created by Frank on 2016/11/3 11:45.
 * Email:512395540@qq.com
 */
public enum SingletonEnum {
    INSTANCE;

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
