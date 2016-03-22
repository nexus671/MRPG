package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Metal types for rings, amulets, etc.
 */
public enum JewelryMetal {
    /**
     * Copper jewelry metal.
     */
    COPPER(0.3), /**
     * Silver jewelry metal.
     */
    SILVER(0.6), /**
     * Gold jewelry metal.
     */
    GOLD(1);

    private final double powerModifier;
    private final String lowercase;

    /**
     * Instantiates a new Jewelry metal.
     *
     * @param powerModifier the power modifier
     */
    JewelryMetal(double powerModifier) {
        lowercase = StringManip.toLowercase(super.toString());
        this.powerModifier = powerModifier;
    }

    /**
     * Gets power modifier.
     *
     * @return the power modifier
     */
    public double getPowerModifier() {
        return powerModifier;
    }

    @Override
    public String toString() {
        return "JewelryMetal{" +
                "powerModifier=" + powerModifier +
                ", lowercase='" + lowercase + '\'' +
                '}';
    }
}
