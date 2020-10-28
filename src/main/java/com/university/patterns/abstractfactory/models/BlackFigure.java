package com.university.patterns.abstractfactory.models;

import com.university.patterns.abstractfactory.interfaces.IBlackFigure;

public class BlackFigure implements IBlackFigure {
    @Override
    public void show(){
        System.out.println("your figures start last");
    }
}
