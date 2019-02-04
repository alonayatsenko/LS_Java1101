package com.yatsenko.java1101.Homework1;

import java.util.Scanner;

public class Task13 {
    public static void main (String[]args){
        System.out.print("Введите номер дня: ");
        int days = new Scanner(System.in).nextInt();

        convert(days);
    }

        static void convert (int days){
        if (days<=0) throw new IllegalArgumentException();
            System.out.println("В дне прошло:"+days*24+ " часов или"+ days*1440 + " минут или"+ days*86400 + " секунд");
        }
    }


