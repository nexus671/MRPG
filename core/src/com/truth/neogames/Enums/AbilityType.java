package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 2/29/2016.
 * Class Description:
 */
public enum AbilityType {
    AOE, TARGETED, PASSIVE;

    final String lowercase;

    AbilityType() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    public String toString() {
        return lowercase;
    }
}
