package com.yatsenko.java1101.Homework1.Classwork.oop;

public class GrandParent {
    static {
        System.out.println("Hello this is static from GarndParent");
    }
    {
        System.out.println("Hello this is not GrandParent");
    }
    {
        System.out.println("Hello this is non-static 1 from GrandParent");
    }

    {
        System.out.println("Hello this is non-static 2  from GrandParent");
    }

    public GrandParent() {
        System.out.println("This is GrandParent constructor");
    }
}
