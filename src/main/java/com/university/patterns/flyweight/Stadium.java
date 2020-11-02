package com.university.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stadium {
    private static final Map<String, FootballFan> FANS = new HashMap<>();
    static {
        FANS.put("Болельщики Chelsea", new BlueFootballFan());
        FANS.put("Болельщики Barcelona", new RedFootballFan());
    }
    public Map<String, FootballFan> getFans(){
        return FANS;
    }
}
