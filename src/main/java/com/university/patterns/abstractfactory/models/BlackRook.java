package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IRook;

public class BlackRook implements IRook {
    @Override
    public void show() {
        System.out.println("I'm black rock");
    }
}
