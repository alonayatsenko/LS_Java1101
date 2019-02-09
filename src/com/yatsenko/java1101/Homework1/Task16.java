package com.yatsenko.java1101.Homework1;

import java.util.Scanner;

public class Task16 {
    public static void main (String []args) {
        System.out.println("Введите температуру в градусах Цельсия");
        int c = new Scanner(System.in).nextInt();
        convert(c);
    }
    static void convert (int c){
        double f = (c*9/5)+32;
        System.out.println("Температура в Фаренгейтах равна "+ f);
    }
}
