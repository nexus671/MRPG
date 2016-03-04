package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 10/23/2015.
 * Class Description:
 */
public enum ProfessionName {
    BARBARIAN, BARD, CLERIC, DRUID, FIGHTER,
    PALADIN, RANGER, ROGUE, SORCERER;

    private final String lowercase;

    ProfessionName() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
