package com.yatsenko.java1101.Homework1.Classwork;

import java.util.ArrayList;
import java.util.List;

public class TestPerfomanse {
    public static void main (String[]args){
        List<Integer> list = new ArrayList();
        long start = System.currentTimeMillis();

        for(int i=0; i<10000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        long result = end-start;
        System.out.println("Time for adding 10000 integer elements " + result);

        }
    }


// коммент в консоле, дз: 