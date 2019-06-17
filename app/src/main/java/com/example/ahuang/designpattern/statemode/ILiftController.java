package com.example.ahuang.designpattern.statemode;

public interface ILiftController {

    public void setState(ILiftState state);
    public void open();
    public void close();
    public void run();
    public void stop();
}
