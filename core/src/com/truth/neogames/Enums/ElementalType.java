package com.truth.neogames.Enums;

/**
 * Created by Adam on 11/2/2015.
 * Class Description: Elemental types based on suffix, which apply different effects on hit.
 */
public enum ElementalType {
    LIGHT("Light"), DARK("Dark"), FIRE("Fire"), FROST("Frost"), NONE("None");

    private String lowercase;

    ElementalType(String lowercase) {
        this.lowercase = lowercase;
    }

    public String toString() {
        return lowercase;
    }

    /**
     * LIGHT: Buffs defensive bonuses on hit.
     * DARK: Saps mana.
     * FIRE: Applies a burning effect for several turns (drains health).
     * FROST: Lowers move spaces on next turn.
     */
}
