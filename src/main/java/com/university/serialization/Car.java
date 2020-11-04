package com.university.serialization;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@AllArgsConstructor
@JsonAutoDetect
public class Car implements Serializable {
    protected int horsePower;
    protected String model;

    public Car() {
    }

    public void startEngine(){
        System.out.println("Вжууух...");
    }
}
