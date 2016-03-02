package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Metal types for rings, amulets, etc.
 */
public enum JewelryMetal {
    COPPER(.3), SILVER(.6), GOLD(1);

    private double powerModifier;
    private String lowercase;

    JewelryMetal(double powerModifier) {
        lowercase = StringManip.toLowercase(super.toString());
        this.powerModifier = powerModifier;
    }

    public double getPowerModifier() {
        return powerModifier;
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
