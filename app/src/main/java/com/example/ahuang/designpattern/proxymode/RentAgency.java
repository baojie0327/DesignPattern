package com.example.ahuang.designpattern.proxymode;

/*
 * RentAgency  2019-04-16
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 04 16
 */
public class RentAgency implements IRent{

    private IRent mIRent;

    public RentAgency(IRent rent){
        this.mIRent=rent;
    }



    @Override
    public void findHouse() {
        mIRent.findHouse();
    }

    @Override
    public void contract() {
        mIRent.contract();
    }

    @Override
    public void consult() {
        mIRent.consult();
    }

    @Override
    public void finish() {
        mIRent.finish();
    }
}