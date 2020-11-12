package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IFigure;

public class WhitePawn implements IFigure {
    @Override
    public void show() {
        System.out.println("I'm white pawn");
    }
}
