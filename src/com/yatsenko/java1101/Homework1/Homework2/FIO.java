package com.yatsenko.java1101.Homework1.Homework2;

public class FIO {
    public static void main (String [] args){
        String fio = "Yatsenko Alona Eduardovna";
        int []arr = new int [fio.length()];
        System.out.println("Use ASCII my FIO is " );
        for (int i=0; i<arr.length; i++){
            arr[i]=fio.charAt(i);
            System.out.println(arr[i]);
        }

    }
}
