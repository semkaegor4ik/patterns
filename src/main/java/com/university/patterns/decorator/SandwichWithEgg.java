package com.university.patterns.decorator;

import lombok.Getter;

@Getter
public class SandwichWithEgg implements ISandwich {
    String info = ", with egg";

    public SandwichWithEgg(ISandwich sandwich) {
        this.info = sandwich.getInfo().concat(info);
    }

}
