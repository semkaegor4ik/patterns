package com.university.patterns.flyweight;

public class BlueFootballFan implements FootballFan {
    @Override
    public void createFan(int row, int chair) {
        System.out.println("Был создан болельщик в синей форме, сидящий на " + row + " ряду " + chair + " месте");
    }
}
