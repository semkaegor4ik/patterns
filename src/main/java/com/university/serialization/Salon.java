package com.university.serialization;

import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.util.List;
@AllArgsConstructor
@JsonAutoDetect
public class Salon implements Serializable {
    private List<Car> cars;
    public void startAll(){
        cars.forEach(car-> car.startEngine());
    }
}
