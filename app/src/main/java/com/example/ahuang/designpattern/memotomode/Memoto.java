package com.example.ahuang.designpattern.memotomode;

/*
 * Memoto  2019-05-20
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 05 20
 */
public class Memoto {

    // 用户名
    private String userName;
    // 密码
    private String password;
    // 电话号码
    private String phoneNumber;


    public Memoto(String username,String password, String phone){
        this.userName=username;
        this.password=password;
        this.phoneNumber=phone;
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