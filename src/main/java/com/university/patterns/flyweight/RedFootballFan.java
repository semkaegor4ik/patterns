package com.university.patterns.flyweight;

import lombok.Data;

@Data
public class RedFootballFan implements FootballFan {
    private final String color = "Red fan";
    @Override
    public String createFan(int row, int chair) {
        //System.out.println("Был создан болельщик в красной форме, сидящий на " + row +" ряду " + chair + " месте");
        return "Row: "+row+" chair: "+ chair;
    }
}
