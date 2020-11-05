package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IKnight;

public class BlackKnight implements IKnight {
    @Override
    public void show() {
        System.out.println("I'm black knight");
    }
}
