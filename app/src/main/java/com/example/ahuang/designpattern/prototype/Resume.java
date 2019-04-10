package com.example.ahuang.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

/*
 * Resume  2019-01-03
 * Copyright (c) 2019 HYB Co.Ltd. All right reserved.
 *
 */
/*
 * class description here
 * @author Jackson
 * @version 1.0.0
 * since 2019 01 03
 */
public class Resume implements Cloneable {

    private String name;
    private String birthday;
    private String school;

    private ArrayList<String> company=new ArrayList<String>();


    /**
     * 添加公司
     * @param company
     */
    public void addCompany(String company){
        this.company.add(company);
    }


    public void display(){
        System.out.println("姓名:"+name);
        System.out.println("生日："+birthday+" 毕业院校："+school);
        for (String company:company){
            System.out.println("company:"+company);
        }
    }

    /**
     * 克隆该实例
     * @return
     */
    @Override
    protected Object clone(){
        Resume resume=null;

        try {
            resume= (Resume) super.clone();
            // 对List<String> company对象也调用clone()
            resume.company=(ArrayList<String>)this.company.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resume;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public List<String> getCompany() {
        return company;
    }


}