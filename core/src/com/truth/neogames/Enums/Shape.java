package com.truth.neogames.Enums;

/**
 * Created by Ahmane on 2/18/2016.
 * Class Description: Shapes
 */
public enum Shape {
    SQUARE("square"), CIRCLE("circle");

    private final String lowercase;


    /**
     * @param lowercase Sets the lowercase field to the lowercase version of
     *                  the object name.
     */
    Shape(String lowercase) {
        this.lowercase = lowercase;
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
