package com.university.patterns.strategy;

public class UsualEmployee implements Employee {
    @Override
    public String doWork() {
        return "сделаю задание перд дедлайном";
    }
}
