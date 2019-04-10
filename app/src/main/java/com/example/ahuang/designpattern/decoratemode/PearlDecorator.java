package com.example.ahuang.designpattern.decoratemode;

/*
 * BlueberryDecorator  2019-03-13
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 具体装饰者，珍珠奶茶
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 13
 */
public class PearlDecorator extends Decorator{
    /**
     * 构造方法
     *
     * @param beverage
     */
    public PearlDecorator(Beverage beverage) {
        super(beverage);
    }


    @Override
    public void makeBeverage() {
        // 顺序:收钱--加珍珠丸子--加饮料，顺序按照需求可变
        price();
        addPearl();
        super.makeBeverage();
    }

    /**
     * 添加珍珠丸子
     */
    private void addPearl(){
        System.out.println("   添加珍珠丸子   ");
    }

    /**
     * 计算价格
     */
    private void price(){
        System.out.println("   珍珠奶茶的价格是6元   ");
    }


}