package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 11/4/2015.
 * Class Description:
 */
public enum WearablePrefixName {
    NONE, REFURBISHED, REINFORCED, ENHANCED, AUGMENTED, REFINED, PLATED, POLISHED, MYSTICAL,
    EXQUISITE, LUMINOUS(ElementalType.LIGHT), SHROUDED(ElementalType.DARK), SCORCHING(ElementalType.FIRE),
    GLACIAL(ElementalType.FROST);

    private ElementalType elementalType;

    WearablePrefixName() {
        elementalType = ElementalType.NONE;
    }

    WearablePrefixName(ElementalType elementalType) {
        this.elementalType = elementalType;
    }

    public ElementalType getElementalType() {
        return elementalType;
    }

    public boolean isElemental() {
        return elementalType == ElementalType.NONE;
    }
}
