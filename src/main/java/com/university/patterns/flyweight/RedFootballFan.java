package com.university.patterns.flyweight;

public class RedFootballFan implements FootballFan {
    @Override
    public void createFan(int row, int chair) {
        System.out.println("Был создан болельщик в красной форме, сидящий на " + row +" ряду " + chair + " месте");
    }
}
