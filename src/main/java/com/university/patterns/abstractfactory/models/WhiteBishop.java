package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IBishop;

public class WhiteBishop implements IBishop {
    @Override
    public void show() {
        System.out.println("I'm white bishop");
    }
}
