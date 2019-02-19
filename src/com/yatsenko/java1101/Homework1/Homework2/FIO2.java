package com.yatsenko.java1101.Homework1.Homework2;

import java.util.Scanner;

public class FIO2 {

    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше ФИО ");
        String FIO = in.nextLine();
        String [] arrFIO = FIO.split(regex:" ");
        FIO=arrFIO[1] + " "+ arrFIO[2] + " " +arrFIO [0];
        System.out.println(FIO);

    }
}
