package com.university.patterns.strategy;

public class LazyStudent implements Student {
    @Override
    public void doHomeWork() {
        System.out.println("Нафиг дз, скатаю все перед экзом, если попросят");
    }
}
