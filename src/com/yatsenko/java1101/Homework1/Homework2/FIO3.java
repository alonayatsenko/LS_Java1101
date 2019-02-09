package com.yatsenko.java1101.Homework1.Homework2;

public class FIO3 {
    public static void main (String [] args){
        String fio = "Yatsenko Alona Eduardovna";
        String oif = new StringBuffer(fio).reverse().toString();
        System.out.println(oif);
    }
}
