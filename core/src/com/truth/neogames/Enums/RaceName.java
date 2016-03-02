package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 10/23/2015.
 * Class Description: Enumerator class for raceName names.
 */
public enum RaceName {
    HUMAN(), ELF(), ORC(), DWARF(), GNOME(), CATFOLK();

    private final String lowercase;

    RaceName() {
        lowercase = StringManip.toLowercase(super.toString());
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
