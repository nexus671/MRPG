package com.truth.neogames.Enums;

/**
 * Created by Adam on 10/23/2015.
 * Class Description: Enumerator class for race names.
 */
public enum Race {
    HUMAN("human"), ELF("elf"), ORC("orc"), UNDEAD("undead");

    private String lowercase;


    /**
     * @param lowercase Sets the lowercase field to the lowercase version of
     *                  the object name.
     */
    Race(String lowercase) {
        this.lowercase = lowercase;
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
