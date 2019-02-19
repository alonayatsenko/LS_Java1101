package com.yatsenko.java1101.Homework1.Homework4;

import java.util.Scanner;

public class Math2 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите градус чтобы получить sin, cos ");
        double degree = in.nextDouble();
        double rad=Math.toRadians(degree);
        System.out.println("sin "+ degree +" = "+ Math.sin(rad));
        System.out.println("cos "+ degree +" = " + Math.cos(rad));

    }
}
