package com.university.patterns.flyweight;

import lombok.Data;

@Data
public class BlueFootballFan implements FootballFan {
    private final String color = "Blue fan";
    @Override
    public String createFan(int row, int chair) {
        //System.out.println("Был создан болельщик в синей форме, сидящий на " + row + " ряду " + chair + " месте");
        return "Row: "+row+" chair: "+ chair;
    }
}
