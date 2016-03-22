package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 2/29/2016.
 * Class Description:
 */
public enum AbilityType {
    /**
     * Aoe ability type.
     */
    AOE, /**
     * Targeted ability type.
     */
    TARGETED, /**
     * Passive ability type.
     */
    PASSIVE;

    /**
     * The Lowercase.
     */
    final String lowercase;

    /**
     * Instantiates a new Ability type.
     */
    AbilityType() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    public String toString() {
        return lowercase;
    }
}
