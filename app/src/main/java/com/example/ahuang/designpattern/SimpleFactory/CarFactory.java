package com.example.ahuang.designpattern.SimpleFactory;


import com.example.ahuang.designpattern.SimpleFactory.Impl.AudiCarProduct;
import com.example.ahuang.designpattern.SimpleFactory.Impl.BenzCarProduct;
import com.example.ahuang.designpattern.SimpleFactory.interfaces.CarProduct;

/*
 *   2018-12-06
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 06
 */
public class CarFactory {

    public CarProduct getCarProduct(String type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case "audi":
                return new AudiCarProduct();
            case "benz":
                return new BenzCarProduct();
            default:
                return null;
        }

    }

}