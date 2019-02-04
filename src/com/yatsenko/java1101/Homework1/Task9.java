package com.yatsenko.java1101.Homework1;

import java.util.Scanner;

public class Task9 {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println();
        System.out.println("Введите число, чтобы проверить целое оно или нет");
        double number = keyboard.nextDouble();
        double checknumber = number%1;
        if (checknumber == 0) {
            System.out.println("Число" + number + " целое");}
        else{
            if (checknumber !=0){
                System.out.println("Число" + number + " не целое");
            }
        }

    }

}
