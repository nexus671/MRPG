package com.truth.neogames.Enums;

/**
 * Created by Adam on 11/2/2015.
 * Class Description: Elemental types based on suffix, which apply different effects on hit.
 */
public enum ElementalType {
    LIGHT, DARK, FIRE, FROST, NONE

    /**
     * LIGHT: Buffs defensive bonuses on hit.
     * DARK: Saps mana and strength.
     * FIRE: Applies a burning effect for several turns (drains health).
     * FROST: Drains constitution and wisdom, lowers move spaces on next turn.
     */
}
