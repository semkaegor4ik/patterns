package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IKing;

public class BlackKing implements IKing {
    @Override
    public void show() {
        System.out.println("I'm black king");
    }
}
