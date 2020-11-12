package com.university.patterns.strategy;

public class GoodEmployee implements Employee {
    @Override
    public String doWork() {
        return "сделаю все и сразу за всю команду";
    }
}
