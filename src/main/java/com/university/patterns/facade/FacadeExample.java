package com.university.patterns.facade;

import com.university.patterns.abstractfactory.AbstractFactoryExample;
import com.university.patterns.adapter.AdapterExample;
import com.university.patterns.decorator.DecoratorExample;

public class FacadeExample {
    public void start(){
        PatternsFacade patternsFacade = new PatternsFacade(new AbstractFactoryExample(), new AdapterExample(), new DecoratorExample());
        patternsFacade.showAllPatterns();
    }
}
