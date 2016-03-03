package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 10/26/2015.
 * Class Description: An enumerator for the names of stats.
 */
public enum EntityStatName {
    HEALTH, HEALTHREGEN, MANA, MANAREGEN,
    STRENGTH, CONSTITUTION, WISDOM, DEXTERITY, SPEED;

    private String lowercase;

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