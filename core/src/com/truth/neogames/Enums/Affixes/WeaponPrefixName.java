package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 11/9/2015.
 * Class Description:
 */
public enum WeaponPrefixName {
    NONE, DRACONIC, EXILED, WICKED, VICIOUS, HONED, GLEAMING(ElementalType.LIGHT), SHROUDED(ElementalType.DARK),
    BLAZING(ElementalType.FIRE), FRIGID(ElementalType.FROST);

    private ElementalType elementalType;

    WeaponPrefixName() {
        elementalType = ElementalType.NONE;
    }

    WeaponPrefixName(ElementalType elementalType) {
        this.elementalType = elementalType;
    }

    public ElementalType getElementalType() {
        return elementalType;
    }

    public boolean isElemental() {
        return elementalType == ElementalType.NONE;
    }
}
