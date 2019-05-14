package com.example.ahuang.designpattern.responsiblechain;

/*
 * Leader  2019-04-24
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 24
 */
public abstract class Leader {

    protected Leader nextHandler;  // 上级领导处理者

    /**
     * 处理合同
     * @param money
     */
    public void handleRequest(int money){
        if (money<=getLimit()){
            handle(money);
        }else {
            if (nextHandler!=null){
                nextHandler.handleRequest(money);
            }
        }
    }


    /**
     * 自身能批复的额度权限
     * @return
     */
    protected abstract int getLimit();

    /**
     * 处理合同行为
     * @param money
     */
    protected abstract void handle(int money);


}