package com.example.ahuang.designpattern.factoryproblem51;

/**
 * Created by Frank on 2016/11/2 19:50.
 * Email:512395540@qq.com
 */
public class Client {
    public static void main(String[] args){
        ComputerEngineer computerEngineer=new ComputerEngineer();
        computerEngineer.makeComputer(1,1);
      //  computerEngineer.makeComputer(1,2);
    }
}
