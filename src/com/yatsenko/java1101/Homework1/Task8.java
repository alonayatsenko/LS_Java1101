package com.yatsenko.java1101.Homework1;

public class Task8 {
    public static void main(String[] args) {
        int a = 76;
        int c = a % 2;
        if (c == 0) {
            System.out.println("Число " + a +  " чётное");
        } else {
            if (c != 0) {

                System.out.println("Число "+ a + " нечётное");
            }
        }
    }
}
