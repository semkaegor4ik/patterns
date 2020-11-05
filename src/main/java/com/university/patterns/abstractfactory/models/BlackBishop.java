package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IBishop;

public class BlackBishop implements IBishop {
    @Override
    public void show() {
        System.out.println("I'm black bishop");
    }
}
