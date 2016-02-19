package com.truth.neogames.Enums;

/**
 * Created by Adam on 11/2/2015.
 * Class Description: Elemental types based on suffix, which apply different effects on hit.
 */
public enum ElementalType {
    LIGHT("Light"), DARK("Dark"), FIRE("Fire"), FROST("Frost"), NONE("None");

    // These constants are multiplied by (CombatGear.getLevel() / Gear.getMAXLEVEL());
    private static final double LIGHT_SCALING = .05;
    private static final double DARK_SCALING = .1;
    private static final double FIRE_SCALING = .05;
    private static final double FROST_SCALING = .3;
    private String lowercase;

    ElementalType(String lowercase) {
        this.lowercase = lowercase;
    }

    public static double getLightScaling() {
        return LIGHT_SCALING;
    }

    public static double getDarkScaling() {
        return DARK_SCALING;
    }

    public static double getFireScaling() {
        return FIRE_SCALING;
    }

    public static double getFrostScaling() {
        return FROST_SCALING;
    }

    public String toString() {
        return lowercase;
    }

    /**
     * LIGHT: Buffs defensive bonuses on hit.
     * DARK: Saps a percentage of current mana.
     * FIRE: Applies a burning effect for several turns (drains current health).
     * FROST: Lowers move spaces on next turn.
     */
}
