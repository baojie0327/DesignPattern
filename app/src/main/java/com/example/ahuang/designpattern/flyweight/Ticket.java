package com.example.ahuang.designpattern.flyweight;

/*
 * Ticket  2019-04-10
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 10
 */
public abstract class Ticket {

    // 内部状态
    private String name="和谐号";

    // 外部状态
    protected String from;
    protected String to;

    public Ticket(String from,String to){
        this.from=from;
        this.to=to;
    }

    // 定义业务逻辑，根据座位等级，显示价格
    public abstract void showTicketInfo(String seat);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}