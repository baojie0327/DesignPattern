package com.example.ahuang.designpattern.facademode;

/**
 * 拍照系统
 */
public interface Camera {

    // 打开照相机
    void openCamera();
    // 拍照
    void  takePicture();
    // 关闭照相机
    void close();

}
