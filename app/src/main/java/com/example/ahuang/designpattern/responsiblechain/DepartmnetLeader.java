package com.example.ahuang.designpattern.responsiblechain;

/*
 * DepartmnetLeader  2019-04-24
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 24
 */
public class DepartmnetLeader extends Leader{
    @Override
    protected int getLimit() {
        return 50000;
    }

    @Override
    protected void handle(int money) {
        System.out.println("部门领导审批合同金额："+money);
    }
}