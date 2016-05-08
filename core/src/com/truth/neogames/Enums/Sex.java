package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by caleb on 5/7/2016.
 */
public enum Sex {
    MALE,

    FEMALE,

    NONE;

    private final String lowercase;
    Sex(){ lowercase = StringManip.toLowercase(super.toString());}

    @Override
    public String toString(){ return lowercase;}
}
