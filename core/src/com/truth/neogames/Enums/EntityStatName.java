package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 10/26/2015.
 * Class Description: An enumerator for the names of stats.
 */
public enum EntityStatName {
    /**
     * Health entity stat name.
     */
    HEALTH, /**
     * Healthregen entity stat name.
     */
    HEALTHREGEN, /**
     * Mana entity stat name.
     */
    MANA, /**
     * Manaregen entity stat name.
     */
    MANAREGEN,
    /**
     * Strength entity stat name.
     */
    STRENGTH, /**
     * Constitution entity stat name.
     */
    CONSTITUTION, /**
     * Wisdom entity stat name.
     */
    WISDOM, /**
     * Dexterity entity stat name.
     */
    DEXTERITY, /**
     * Speed entity stat name.
     */
    SPEED;

    private final String lowercase;

    /**
     * Instantiates a new Entity stat name.
     */
    EntityStatName() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    @Override
    public String toString() {
        return lowercase;
    }

    /**
     * TODO: Add descriptions for stats (in comments)
     */
}