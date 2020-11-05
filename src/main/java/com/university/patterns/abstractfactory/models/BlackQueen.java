package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IQueen;

public class BlackQueen implements IQueen {
    @Override
    public void show() {
        System.out.println("I'm black queen");
    }
}
