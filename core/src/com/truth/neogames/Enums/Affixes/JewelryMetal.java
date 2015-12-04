package com.truth.neogames.Enums.Affixes;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Metal types for rings, amulets, etc.
 */
public enum JewelryMetal {
    COPPER(.3), SILVER(.6), GOLD(1);

    private double powerModifier;

    JewelryMetal(double powerModifier) {
        this.powerModifier = powerModifier;
    }

    public double getPowerModifier() {
        return powerModifier;
    }
}
