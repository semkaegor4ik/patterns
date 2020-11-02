package com.university.patterns.strategy;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class OurGroup {
    private List<Student> students;

    void doAllHomeWork(){
        students.forEach(student -> student.doHomeWork());
    }
}
