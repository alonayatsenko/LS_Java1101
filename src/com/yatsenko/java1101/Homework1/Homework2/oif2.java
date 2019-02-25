package com.yatsenko.java1101.Homework1.Homework2;

public class oif2 {
    public static void main(String[] args) {
        String art = "Art Lemon";
        char[] array = art.toCharArray();
        for (int i = array.length - 1; i >=0; i--) {
            System.out.print(array[i]);
        }
    }
}