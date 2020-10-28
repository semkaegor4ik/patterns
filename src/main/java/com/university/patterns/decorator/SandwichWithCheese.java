package com.university.patterns.decorator;

public class SandwichWithCheese implements ISandwich {
    String info = ", with cheese";

    public SandwichWithCheese(ISandwich sandwich) {
        this.info = sandwich.getInfo().concat(info);
    }

    @Override
    public String getInfo() {
        return info;
    }
}
