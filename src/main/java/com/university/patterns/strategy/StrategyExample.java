package com.university.patterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrategyExample {
    public void start() {
        List<Employee> employees = new ArrayList<>();
        employees.addAll(Stream
                .of(new LazyEmployee(), new GoodEmployee(), new UsualEmployee(), new LazyEmployee(), new UsualEmployee())
                .collect(Collectors.toList()));
        Company epam = new Epam(employees);
        Company netcracker = new Netcracker(employees);
        epam.work();
        netcracker.work();
    }

    public static void main(String[] args) {
        new StrategyExample().start();
    }
}
