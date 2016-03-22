package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/3/2015.
 * Class Description:
 */
public enum DamageType {
    /**
     * Piercing damage type.
     */
    PIERCING, /**
     * Slashing damage type.
     */
    SLASHING, /**
     * Crushing damage type.
     */
    CRUSHING, /**
     * Arcane damage type.
     */
    ARCANE;

    /**
     * The Lowercase.
     */
    final String lowercase;

    /**
     * Instantiates a new Damage type.
     */
    DamageType() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
