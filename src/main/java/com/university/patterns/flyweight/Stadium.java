package com.university.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stadium {
    private static final Map<String, FootballFan> FANS = new HashMap<>();
    private Map<String, FootballFan> fansPosition = new HashMap<>();
    static {
        FANS.put("Болельщики Chelsea", new BlueFootballFan());
        FANS.put("Болельщики Barcelona", new RedFootballFan());
    }
    public Map<String, FootballFan> getFans(){
        return FANS;
    }

    public void addFan(String position, FootballFan fan){
        fansPosition.put(position, fan);
    }

    public void showAllFansWithPosition(){
        fansPosition.forEach((pos, fan)->{
            System.out.println(fan.getColor()+"sit on position: " + pos);
        });
    }
}
