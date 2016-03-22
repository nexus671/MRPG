package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 10/23/2015.
 * Class Description: Enumerator class for raceName names.
 */
public enum RaceName {
    /**
     * Human race name.
     */
    HUMAN(), /**
     * Elf race name.
     */
    ELF(), /**
     * Orc race name.
     */
    ORC(), /**
     * Dwarf race name.
     */
    DWARF(), /**
     * Gnome race name.
     */
    GNOME(), /**
     * Catfolk race name.
     */
    CATFOLK();

    private final String lowercase;

    /**
     * Instantiates a new Race name.
     */
    RaceName() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
