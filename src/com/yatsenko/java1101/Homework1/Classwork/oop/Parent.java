package com.yatsenko.java1101.Homework1.Classwork.oop;


public class Parent extends GrandParent{

        static {
            System.out.println("Hello this is static from Parent");
        }

        {
            System.out.println("Hello this is non-static 1 from Parent");
        }

        {
            System.out.println("Hello this is non-static 2  from Parent");
        }

        public Parent() {
            System.out.println("This is Parent constructor");
        }
    }

