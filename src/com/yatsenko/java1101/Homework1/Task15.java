package com.yatsenko.java1101.Homework1;

public class Task15 {
    public static void main (String [] args){
        int a = 10;
        int b = 15;
// гипотенуза: a^2+b^2=c^2
        double c = Math.sqrt(a*a+b*b);
        // периметр=a+b+c
        double p=a+b+c;
        //площадь=a*b/2
        double s = a*b/2;
        System.out.println("Гипотенуза равна"+ c + " см");
        System.out.println("Периметр равен " + p + " см");
        System.out.println("Площадь равна "+ s + " см");
    }
}
