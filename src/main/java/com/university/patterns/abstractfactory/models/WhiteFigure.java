package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IWhiteFigure;

public class WhiteFigure implements IWhiteFigure {
    @Override
    public void show(){
        System.out.println("your figures start first");
    }
}
