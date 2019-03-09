package com.yatsenko.java1101.Homework1.Classwork.Collection;

import com.yatsenko.java1101.Homework1.Classwork.Collection.Entity.Car;
import jdk.nashorn.internal.runtime.ListAdapter;

public class SimpleEqualsAndHashCode {
    public static void main(String[] args) {
        Car Lanos = new Car("ZAZ", "Deo", "Lanos");
        Car Lada = new Car("Vaz", "Lada", "Vesta");

        System.out.println("Hash Code Lanos\t\t\t"+ Lanos.hashCode() );
        System.out.println("HAsh Code Lada\t\t\t" + Lada.hashCode());

        System.out.println("Is Lada equals Lanos?\t" + Lada.equals(Lanos));




    }
}
