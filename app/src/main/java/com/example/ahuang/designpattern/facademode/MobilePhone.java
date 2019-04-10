package com.example.ahuang.designpattern.facademode;

/*
 * MobilePhone  2019-03-26
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * 统一的外部接口
 * @author Jackson
 * @version 1.0.0
 * since 2019 03 26
 */
public class MobilePhone {

    private Phone mPhone=new PhoneImpl();
    private Camera mCamera=new CameraImpl();
    private Internet mInternet=new InternetImpl();


    public void dail(){
        System.out.println("---------使用打电话功能----------");
        mPhone.call();
        mPhone.hangup();
    }

    public void takePicture(){
        System.out.println("---------使用拍照功能----------");
        mCamera.openCamera();
        mCamera.takePicture();
        mCamera.close();
    }

    public void videoChat(){
        System.out.println("---------使用视频聊天----------");
        mInternet.netPlay();
        mCamera.openCamera();
        mPhone.call();
    }



}