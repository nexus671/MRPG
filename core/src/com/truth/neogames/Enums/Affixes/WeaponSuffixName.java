package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 11/9/2015.
 * Class Description:
 */
public enum WeaponSuffixName {
    NONE, TRIUMPH, FEROCITY, VICTORY, CHAOS, EONS, OBLIVION,  INCANDESCENCE(ElementalType.LIGHT),
    DARKNESS(ElementalType.DARK), FLAME(ElementalType.FIRE), ICE(ElementalType.FROST);

    private ElementalType elementalType;

    WeaponSuffixName() {
        elementalType = ElementalType.NONE;
    }

    WeaponSuffixName(ElementalType elementalType) {
        this.elementalType = elementalType;
    }

    public ElementalType getElementalType() {
        return elementalType;
    }

    public boolean isElemental() {
        return elementalType == ElementalType.NONE;
    }
}
