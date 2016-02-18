package com.truth.neogames.Enums.Affixes;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Metal types for rings, amulets, etc.
 */
public enum JewelryMetal {
    COPPER("Copper", .3), SILVER("Silver", .6), GOLD("Gold", 1);

    private double powerModifier;
    private String lowercase;

    JewelryMetal(String lowercase, double powerModifier) {
        this.lowercase = lowercase;
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
