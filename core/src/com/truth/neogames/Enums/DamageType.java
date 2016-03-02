package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/3/2015.
 * Class Description:
 */
public enum DamageType {
    PIERCING, SLASHING, CRUSHING, ARCANE;

    String lowercase;

    DamageType() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
