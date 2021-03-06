package com.example.ahuang.designpattern.responsiblechain;

/*
 * GroupLeader  2019-04-24
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 24
 */
public class GroupLeader extends Leader{

    @Override
    protected int getLimit() {
        return 20000;
    }

    @Override
    protected void handle(int money) {
        System.out.println("组领导审批合同金额："+money);
    }
}