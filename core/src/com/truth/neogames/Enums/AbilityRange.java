package com.truth.neogames.Enums;

/**
 * Created by acurr on 2/12/2016.
 */
public enum AbilityRange {
    /**
     * None ability range.
     */
    NONE(0, "PERSONAL"), /**
     * Touch ability range.
     */
    TOUCH(1, "Close"), /**
     * Small ability range.
     */
    SMALL(3, "Small"), /**
     * Medium ability range.
     */
    MEDIUM(5, "Medium"), /**
     * Large ability range.
     */
    LARGE(10, "Large");

    private final int radius;
    private final String name;

    /**
     * Instantiates a new Ability range.
     *
     * @param r the r
     * @param n the n
     */
    AbilityRange(int r, String n) {
        radius = r;
        name = n;
    }

    /**
     * Gets radius.
     *
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AbilityRange{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
