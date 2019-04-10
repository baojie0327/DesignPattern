package com.example.ahuang.designpattern.flyweight;

/*
 * Flyweight  2019-04-10
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 10
 */
public abstract class Flyweight {
    // 内部状态
    private String intrinsic;

    // 外部状态
    protected final String Extrinsic;

    // 要去享元角色必须接收外部状态
    public Flyweight(String extrinsic){
        this.Extrinsic=extrinsic;
    }

    // 定义业务操作
    public abstract void operate();

    // 内部状态的getter/setter

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}