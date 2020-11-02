package com.university.patterns.strategy;

public class GoodStudent implements Student {
    @Override
    public void doHomeWork() {
        System.out.println("сделаю сразу все дз за весь семестр");
    }
}
