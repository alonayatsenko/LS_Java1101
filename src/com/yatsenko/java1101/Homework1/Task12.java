package com.yatsenko.java1101.Homework1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance=0.0;
        double time = 0.0;
        System.out.print("Введите растояние до места назначения: ");
        distance= scanner.nextDouble();
        System.out.println();
        System.out.println("Введите время за которое вы бы хотели доехать (в часах): ");
        time=scanner.nextDouble();
        System.out.println("Вам необходимо ехать со скоростью: " + distance/time);
        }
    }
