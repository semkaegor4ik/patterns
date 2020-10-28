package com.university.patterns.decorator;

import lombok.Getter;

@Getter
public class SandwichWithTomato implements ISandwich {
    String info = ", with tomato";

    public SandwichWithTomato(ISandwich sandwich) {
        this.info = sandwich.getInfo().concat(info);
    }
}
