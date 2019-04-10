package com.example.ahuang.designpattern.builderpattern;

/*
 * ThinkPad  2018-12-25
 * Copyright (c) 2018 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2018 12 25
 */
public class ThinkPad {

    private String mBoard;
    private String mDisplay;
    private String mOs;

    private ThinkPad(Builder builder){
        this.mBoard=builder.mBoard;
        this.mDisplay=builder.mDisplay;
        this.mOs=builder.mOs;
    }

    public String getBoard() {
        return mBoard;
    }

    public String getDisplay() {
        return mDisplay;
    }


    public String getOs() {
        return mOs;
    }


    static class Builder{

        private String mBoard;
        private String mDisplay;
        private String mOs;

        public Builder setBoard(String board){
            this.mBoard=board;
            return this;
        }

        public Builder setDisplay(String display){
            this.mDisplay=display;
            return this;
        }

        public Builder setOs(String os){
            this.mOs=os;
            return this;
        }

        public ThinkPad builder(){
            return new ThinkPad(this);
        }


    }




}