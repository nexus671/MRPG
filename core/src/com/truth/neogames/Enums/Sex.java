package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by caleb on 5/7/2016.
 */
public enum Sex {
    /**
     * Male sex.
     */
    MALE,

    /**
     * Female sex.
     */
    FEMALE,

    /**
     * None sex.
     */
    NONE;

    private final String lowercase;

    /**
     * Instantiates a new Sex.
     */
    Sex(){ lowercase = StringManip.toLowercase(super.toString());}

    @Override
    public String toString(){ return lowercase;}
}
