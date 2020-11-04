package com.university.serialization;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonAutoDetect
public class SportCar extends Car{
    private int horsePower;
    private String model;

    @Override
    public void startEngine() {
        System.out.println("ВРУУУММ ВРУМММ...");
    }
}
