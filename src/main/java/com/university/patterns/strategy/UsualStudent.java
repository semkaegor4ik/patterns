package com.university.patterns.strategy;

public class UsualStudent implements Student {
    @Override
    public void doHomeWork() {
        System.out.println("сделаю дз перд парой");
    }
}
