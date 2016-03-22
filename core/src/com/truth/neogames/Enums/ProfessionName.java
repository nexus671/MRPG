package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 10/23/2015.
 * Class Description:
 */
public enum ProfessionName {
    /**
     * Barbarian profession name.
     */
    BARBARIAN, /**
     * Bard profession name.
     */
    BARD, /**
     * Cleric profession name.
     */
    CLERIC, /**
     * Druid profession name.
     */
    DRUID, /**
     * Fighter profession name.
     */
    FIGHTER,
    /**
     * Paladin profession name.
     */
    PALADIN, /**
     * Ranger profession name.
     */
    RANGER, /**
     * Rogue profession name.
     */
    ROGUE, /**
     * Sorcerer profession name.
     */
    SORCERER;

    private final String lowercase;

    /**
     * Instantiates a new Profession name.
     */
    ProfessionName() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
