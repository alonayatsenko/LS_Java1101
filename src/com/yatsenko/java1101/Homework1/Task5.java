package com.yatsenko.java1101.Homework1;

import java.util.Scanner;

public class Task5 {

        public static void main (String[] args){
            Scanner keyboard = new Scanner(System.in);
            System.out.println();
            System.out.println("Введите ваш вес:");
            double weightPeopleEarth = keyboard.nextInt();
            double weightPeopleMoon = weightPeopleEarth*0.17;
            System.out.println(" ");
            System.out.println("Ваш вес на Луне равер: " + weightPeopleMoon + "кг");
        }
}
