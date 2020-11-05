package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IPawn;

public class WhitePawn implements IPawn {
    @Override
    public void show() {
        System.out.println("I'm white pawn");
    }
}
