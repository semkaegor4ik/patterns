package com.university.patterns.facade;

import com.university.patterns.abstractfactory.AbstractFactoryExample;
import com.university.patterns.adapter.AdapterExample;
import com.university.patterns.decorator.DecoratorExample;
import com.university.patterns.flyweight.FlyWeightExample;
import com.university.patterns.strategy.StrategyExample;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PatternsFacade {
    private AbstractFactoryExample abstractFactoryExample;
    private AdapterExample adapterExample;
    private DecoratorExample decoratorExample;
    private StrategyExample strategyExample;
    private FlyWeightExample flyWeightExample;

    public void showAllPatterns(){
        System.out.println("Abstract factory:");
        abstractFactoryExample.start();
        System.out.println("Adapter:");
        adapterExample.start();
        System.out.println("Decorator:");
        decoratorExample.start();
        System.out.println("Strategy:");
        strategyExample.start();
        System.out.println("FlyWeight:");
        flyWeightExample.start();
    }
}
