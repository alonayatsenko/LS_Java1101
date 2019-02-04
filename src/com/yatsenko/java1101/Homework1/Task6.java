package com.yatsenko.java1101.Homework1;

import java.util.Scanner;

public class Task6 {

        public static void main (String [] args){
            Scanner keyboard = new Scanner (System.in);
            System.out.println();
            System.out.println("Введите число");
            double number = keyboard.nextDouble();
            double increasenumber = number*0.1 + number;
            System.out.println(" ");
            System.out.println("Результат:" + increasenumber);

        }
}
