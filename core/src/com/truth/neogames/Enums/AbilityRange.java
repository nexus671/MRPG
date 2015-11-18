package com.truth.neogames.Enums;

/**
 * Created by Adam on 11/2/2015.
 * Class Description:
 */
public enum AbilityRange {
    CLOSE("CLOSE", 5), PERSONAL("PERSONAL", 0), TOUCH("TOUCH", 1), MEDIUM("MEDIUM", 20), LONG("LONG", 80), UNLIMITED("UNLIMITED", 100);
    private final int range;
    private final String type;


    AbilityRange(String t, int r) {
        range = r;
        type = t;
    }

    public int getRange() {
        return range;
    }

    public String getType() {
        return type;
    }
}
