package com.example.ahuang.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/*
 * TicketFactory  2019-04-10
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 10
 */
public class TicketFactory {

    // 定义一个池容器
    private static Map<String,Ticket> pool=new HashMap<>();


    // 享元工厂
    public static Ticket getTicket(String from,String to){
        String key=from+"-"+to;
        if (pool.containsKey(key)){
            System.out.println("使用缓存==>"+key);
            return pool.get(key);
        }else {
            System.out.println("创建对象==>"+key);
            Ticket ticket=new TrainTicket(from,to);
            pool.put(key, ticket);
            return ticket;
        }
    }
}