package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/2/2015.
 * Class Description: Elemental types based on suffix, which apply different effects on hit.
 */
public enum ElementalType {
    /**
     * Light elemental type.
     */
    LIGHT, /**
     * Dark elemental type.
     */
    DARK, /**
     * Fire elemental type.
     */
    FIRE, /**
     * Frost elemental type.
     */
    FROST, /**
     * None elemental type.
     */
    NONE;

    // These constants are multiplied by (CombatGear.getLevel() / Gear.getMAXLEVEL());
    private static final double LIGHT_SCALING = 0.05;
    private static final double DARK_SCALING = 0.1;
    private static final double FIRE_SCALING = 0.05;
    private static final double FROST_SCALING = 0.3;
    private final String lowercase;

    /**
     * Instantiates a new Elemental type.
     */
    ElementalType() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    /**
     * Gets light scaling.
     *
     * @return the light scaling
     */
    public static double getLightScaling() {
        return LIGHT_SCALING;
    }

    /**
     * Gets dark scaling.
     *
     * @return the dark scaling
     */
    public static double getDarkScaling() {
        return DARK_SCALING;
    }

    /**
     * Gets fire scaling.
     *
     * @return the fire scaling
     */
    public static double getFireScaling() {
        return FIRE_SCALING;
    }

    /**
     * Gets frost scaling.
     *
     * @return the frost scaling
     */
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
