package com.university.serialization;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.util.List;
@AllArgsConstructor
@JsonAutoDetect
@JacksonXmlRootElement
public class Salon implements Serializable {
    private List<Car> cars;
    public void startAll(){
        cars.forEach(car-> car.startEngine());
    }
}
