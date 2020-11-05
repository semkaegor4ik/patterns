package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IQueen;

public class WhiteQueen implements IQueen {
    @Override
    public void show() {
        System.out.println("I'm white queen");
    }
}
