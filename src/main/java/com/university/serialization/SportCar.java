package com.university.serialization;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonAutoDetect
@JacksonXmlRootElement
public class SportCar extends Car{
    private int horsePower;
    private String model;

    @Override
    public void startEngine() {
        System.out.println("ВРУУУММ ВРУМММ...");
    }
}
