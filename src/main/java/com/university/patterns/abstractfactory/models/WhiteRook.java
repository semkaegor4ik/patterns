package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IRook;

public class WhiteRook implements IRook {
    @Override
    public void show() {
        System.out.println("I'm white rock");
    }
}
