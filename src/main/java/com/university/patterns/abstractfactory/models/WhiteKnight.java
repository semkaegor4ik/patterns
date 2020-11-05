package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IKnight;

public class WhiteKnight implements IKnight {
    @Override
    public void show() {
        System.out.println("I'm white knight");
    }
}
