package com.yatsenko.java1101.Homework1.Classwork.Collection.Entity;

public class Car {
    private String vendor;
    private String mark;
    private String model;

    public Car() {
    }

    public Car(String vendor, String mark, String model) {
        this.vendor = vendor;
        this.mark = mark;
        this.model = model;
    }

    public String getVendor() {
        return vendor;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }


}

