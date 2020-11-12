package com.university.serialization;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
@AllArgsConstructor
@JsonAutoDetect
@JacksonXmlRootElement
public class Car implements Serializable {
    protected int horsePower;
    protected String model;

    public Car() {
    }

    public void startEngine(){
        System.out.println("Вжууух...");
    }
}
