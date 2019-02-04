package com.yatsenko.java1101.Homework1;

import java.util.Scanner;

public class Task11 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        tablUmn(scan.nextInt());
    }
    public static void tablUmn(int a) {
        for (int b=1; b<=10; b++){
            int result = a*b;
            System.out.println(a+"*"+b+"=" + result);
        }

    }
}
