package com.yatsenko.java1101.Homework1;

import java.util.Scanner;

public class Task10 {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Пожалуйста, введите Ваше имя: ");
        String name = in.nextLine();
        System.out.println("Вас зовут: " + name);
    }

}
