package com.university.patterns.strategy;

public class LazyEmployee implements Employee {
    @Override
    public String doWork() {
        return "Сделаю вид, что работаю, потом все скопирую из инета";
    }
}
