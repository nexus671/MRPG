package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 11/9/2015.
 * Class Description:
 */
public enum ArmorSuffix {
    NONE, HARDINESS, ENLIGHTENING, BRAWLING, APTITUDE, PROSPERITY, INCANDESCENCE(ElementalType.LIGHT), RADIANCE(ElementalType.LIGHT),
    TWILIGHT(ElementalType.DARK), SHADOW(ElementalType.DARK), FLAME(ElementalType.FIRE), BURNING(ElementalType.FIRE),
    ICE(ElementalType.FROST), FREEZING(ElementalType.FROST);

    private ElementalType elementalType;

    ArmorSuffix() {
        elementalType = ElementalType.NONE;
    }

    ArmorSuffix(ElementalType type) {
        elementalType = type;
    }

    public ElementalType getElementalType() {
        return elementalType;
    }

    public boolean isElemental() {
        return elementalType == ElementalType.NONE;
    }
}
