package com.university.patterns.decorator;

public class DecoratorExample {
    public void start(){
        ISandwich first = new Sandwich();
        ISandwich second = new SandwichWithCheese(new Sandwich());
        ISandwich third = new SandwichWithTomato(new SandwichWithEgg(new SandwichWithCheese(new Sandwich())));
        System.out.println(first.getInfo());
        System.out.println(second.getInfo());
        System.out.println(third.getInfo());
    }
}
