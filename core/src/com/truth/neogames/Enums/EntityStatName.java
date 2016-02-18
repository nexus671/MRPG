package com.truth.neogames.Enums;

/**
 * Created by Adam on 10/26/2015.
 * Class Description: An enumerator for the names of stats.
 */
public enum EntityStatName {
    HEALTH("Health"), HEALTHREGEN("Health Regen"), MANA("Mana"), MANAREGEN("Mana Regen"),
    STRENGTH("Strength"), CONSTITUTION("Constitution"), WISDOM("Wisdom");

    private String lowercase;

    EntityStatName(String lowercase) {
        this.lowercase = lowercase;
    }

    @Override
    public String toString() {
        return lowercase;
    }

    /**
     * TODO: Add descriptions for stats (in comments)
     */
}