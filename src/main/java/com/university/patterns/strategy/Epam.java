package com.university.patterns.strategy;

import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class Epam implements Company {
    private List<Employee> employees;
    @Override
    public void work() {
        employees.forEach(employee -> System.out.println("Работник Epam: " + employee.doWork()));
    }
}
