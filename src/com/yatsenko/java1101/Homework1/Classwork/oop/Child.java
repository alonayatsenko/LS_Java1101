package com.yatsenko.java1101.Homework1.Classwork.oop;


public class Child extends Parent {

    static {
        System.out.println("Hello this is static from Child");
    }

    {
        System.out.println("Hello this is non-static 1 from Child");
    }

    {
        System.out.println("Hello this is non-static 2  from Child");
    }

    public Child() {
        System.out.println("This is Child constructor");
    }
}
