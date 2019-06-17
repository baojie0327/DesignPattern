package com.example.ahuang.designpattern.memotomode;

/*
 * UserInfoOriginator  2019-05-20
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 20
 */
public class UserInfoOriginator {

    // 用户名
    private String userName;
    // 密码
    private String password;
    // 电话号码
    private String phoneNumber;


    /**
     * 保存一个备忘录
     * @return 返回一个新的备忘录对象
     */
    public Memoto saveMemoto(){
        return new Memoto(userName,password,phoneNumber);
    }

    /**
     * 恢复备忘录对象
     * @param memoto
     */
    public void restoreMemoto(Memoto memoto){
        this.userName=memoto.getUserName();
        this.password=memoto.getPassword();
        this.phoneNumber=memoto.getPhoneNumber();
    }


    /**
     * 显示用户信息
     */
    public void show(){
        System.out.println("userName:"+userName);
        System.out.println("password:"+password);
        System.out.println("phone:"+phoneNumber);
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}