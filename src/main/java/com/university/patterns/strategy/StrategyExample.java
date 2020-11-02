package com.university.patterns.strategy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrategyExample {
    public void start() {
        new OurGroup(Stream
                .of(new LazyStudent(), new GoodStudent(), new UsualStudent(), new LazyStudent(), new UsualStudent())
                .collect(Collectors.toList()))
                .doAllHomeWork();
    }
}
