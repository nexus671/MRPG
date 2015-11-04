package com.truth.neogames.Enums;

/**
 * Created by Adam on 10/23/2015.
 * Class Description:
 */
public enum ProfessionName {
    BARBARIAN("Barbarian"), BARD("Bard"), CLERIC("Cleric"), DRUID("Druid"), FIGHTER("Fighter"), PALADIN("Paladin"), RANGER("Ranger"), ROGUE("Rogue"), SORCERER("Sorcerer");

    private final String lowercase;


    /**
     * @param lowercase Sets the lowercase field to the lowercase version of
     *                  the object name.
     */
    ProfessionName(String lowercase) {
        this.lowercase = lowercase;
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
