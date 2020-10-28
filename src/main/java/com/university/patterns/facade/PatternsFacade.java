package com.university.patterns.facade;

import com.university.patterns.abstractfactory.AbstractFactoryExample;
import com.university.patterns.adapter.AdapterExample;
import com.university.patterns.decorator.DecoratorExample;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PatternsFacade {
    private AbstractFactoryExample abstractFactoryExample;
    private AdapterExample adapterExample;
    private DecoratorExample decoratorExample;

    public void showAllPatterns(){
        System.out.println("Abstract factory:");
        abstractFactoryExample.start();
        System.out.println("Adapter:");
        adapterExample.start();
        System.out.println("Decorator:");
        decoratorExample.start();
    }
}
