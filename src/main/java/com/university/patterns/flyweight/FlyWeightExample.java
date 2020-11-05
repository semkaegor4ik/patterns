package com.university.patterns.flyweight;

import java.util.concurrent.atomic.AtomicInteger;

public class FlyWeightExample {
    public void start() {
        Stadium stadium = new Stadium();
        for (AtomicInteger i = new AtomicInteger(1); i.get() < 6; i.getAndIncrement()) {
            for (AtomicInteger j = new AtomicInteger(1); j.get() < 6; ) {
                stadium.getFans().forEach((str,fan)-> {
                    stadium.addFan(fan.createFan(i.get(), j.getAndIncrement()),fan);
                });
            }
        }
        stadium.showAllFansWithPosition();
    }

    public static void main(String[] args) {
        new FlyWeightExample().start();
    }

}
