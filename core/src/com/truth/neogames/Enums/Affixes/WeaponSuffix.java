package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 11/9/2015.
 * Class Description: Suffixes for weapons: some of them give the weapon a certain elemental type,
 * which provides a bonus.
 */
public enum WeaponSuffix {
    NONE, TRIUMPH, FEROCITY, VICTORY, CHAOS, EONS, OBLIVION, INCANDESCENCE(ElementalType.LIGHT), RADIANCE(ElementalType.LIGHT),
    TWILIGHT(ElementalType.DARK), SHADOW(ElementalType.DARK), FLAME(ElementalType.FIRE), BURNING(ElementalType.FIRE),
    ICE(ElementalType.FROST), FREEZING(ElementalType.FROST);

    private ElementalType elementalType;

    WeaponSuffix() {
        elementalType = ElementalType.NONE;
    }

    WeaponSuffix(ElementalType elementalType) {
        this.elementalType = elementalType;
    }

    public ElementalType getElementalType() {
        return elementalType;
    }

    public boolean isElemental() {
        return elementalType == ElementalType.NONE;
    }
}
