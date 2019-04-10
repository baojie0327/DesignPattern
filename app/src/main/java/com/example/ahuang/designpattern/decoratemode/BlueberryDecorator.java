package com.example.ahuang.designpattern.decoratemode;

/*
 * BlueberryDecorator  2019-03-13
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 具体装饰者，加蓝莓
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 13
 */
public class BlueberryDecorator extends Decorator{
    /**
     * 构造方法
     *
     * @param beverage
     */
    public BlueberryDecorator(Beverage beverage) {
        super(beverage);
    }


    @Override
    public void makeBeverage() {
        // 顺序:加冰--加饮料--加蓝莓--收钱，顺序按照需求可变
        addIce();
        super.makeBeverage();
        addBlueberry();
        price();

    }

    /**
     * 添加冰块
     */
    private void addIce(){
        System.out.println("    添加冰块   ");
    }


    /**
     * 添加蓝莓
     */
    private void addBlueberry(){
        System.out.println("     添加蓝莓    ");
    }

    /**
     * 计算价格
     */
    private void price(){
        System.out.println("     蓝莓奶茶的价格是5元    ");
    }

}