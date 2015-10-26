package com.truth.neogames.Enums;

/**
 * Created by Adam on 10/26/2015.
 * Class Description: An enumerator for the names of stats.
 */
public enum StatName {
    HEALTH, HEALTHREGEN, MANA, MANAREGEN, STRENGTH, CONSTITUTION, WISDOM, INTELLIGENCE, LUCK, MINDAMAGE(false), MAXDAMAGE(false), MINTYPEDAMAGE(false), MAXTYPEDAMAGE(false);

    private boolean entity;

    StatName() {
        entity = true;
    }

    StatName(boolean isEntity) {
        entity = isEntity;
    }

    /**
     * TODO: Add descriptions for stats (in comments)
     */
}