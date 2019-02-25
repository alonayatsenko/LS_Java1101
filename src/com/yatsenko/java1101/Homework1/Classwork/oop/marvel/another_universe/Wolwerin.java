package com.yatsenko.java1101.Homework1.Classwork.oop.marvel.another_universe;


import com.yatsenko.java1101.Homework1.Classwork.oop.marvel.another_universe.marvel.SuperHero;
import com.yatsenko.java1101.Homework1.Classwork.oop.marvel.another_universe.marvel.SuperPower;

public class Wolwerin extends SuperHero {

    @Override
    public void useSuperPower (){
        System.out.println("I use this shit");

    }

    @Override
    public void fightWithVillain (){
        super.fightWithVillain();
        System.out.println("And I kill that badasses");

    }

    @Override
    public void sayWhatIsYourSuperPower() {
        System.out.println("I can survive");

    }
}

