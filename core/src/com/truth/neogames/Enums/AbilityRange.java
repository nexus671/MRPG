package com.truth.neogames.Enums;

/**
 * Created by acurr on 2/12/2016.
 */
public enum AbilityRange {
    NONE(0, "PERSONAL"), TOUCH(1, "Close"), SMALL(3, "Small"), MEDIUM(5, "Medium"), LARGE(10, "Large");

    private final int radius;
    private final String name;

    AbilityRange(int r, String n) {
        radius = r;
        name = n;
    }

    public int getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }
}
