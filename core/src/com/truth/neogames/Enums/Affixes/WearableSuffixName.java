package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 11/9/2015.
 * Class Description:
 */
public enum WearableSuffixName {
    NONE, HARDINESS, ENLIGHTENING, BRAWLING, APTITUDE, PROSPERITY, RADIANCE(ElementalType.LIGHT),
    TWILIGHT(ElementalType.DARK), FLAME(ElementalType.FIRE), ICE(ElementalType.FROST);

    private ElementalType elementalType;

    WearableSuffixName() {
        elementalType = ElementalType.NONE;
    }

    WearableSuffixName(ElementalType type) {
        elementalType = type;
    }

    public ElementalType getElementalType() {
        return elementalType;
    }

    public boolean isElemental() {
        return elementalType == ElementalType.NONE;
    }
}
