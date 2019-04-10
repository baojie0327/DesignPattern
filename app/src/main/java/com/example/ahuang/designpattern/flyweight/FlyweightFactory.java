package com.example.ahuang.designpattern.flyweight;

import java.util.HashMap;

/*
 * FlyweightFactory  2019-04-10
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 10
 */
public class FlyweightFactory {
    // 定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    // 享元工厂
    public static Flyweight getFlyweight(String Extrinsic) {

        // 需要返回的对象
        Flyweight flyweight=null;

        // 在池中没有该对象
        if (pool.containsKey(Extrinsic)){
            flyweight=pool.get(Extrinsic);
            System.out.print("已有 " + Extrinsic + " 直接从池中取---->\n");
        }else {
            // 根据外部状态创建享元对象
            flyweight=new ConcreteFlyweight(Extrinsic);
            // 放置到池中
            pool.put(Extrinsic,flyweight);
            System.out.print("创建 " + Extrinsic + " 并从池中取出---->\n");
        }

        return flyweight;

    }
}