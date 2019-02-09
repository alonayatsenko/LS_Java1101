package com.yatsenko.java1101.Homework1.Homework2;

public class fio4 {
    public static void main (String [] args){
        String fio = "Yatsenko Alona Eduardovna";
        char [] array = fio.toCharArray();
        for (int i = array.length -1; i>=0; i--){
            System.out.print(array[i]);
        }

    }
}
