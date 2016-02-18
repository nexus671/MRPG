package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 11/9/2015.
 * Class Description: Suffixes for weapons: some of them give the weapon a certain elemental type,
 * which provides a bonus.
 */
public enum WeaponSuffix {
    NONE("None"), TRIUMPH("Triumph"), FEROCITY("Ferocity"), VICTORY("Victory"), CHAOS("Chaos"), EONS("Eons"),
    OBLIVION("Oblivion"), INCANDESCENCE("Incandescence", ElementalType.LIGHT), RADIANCE("Radiance", ElementalType.LIGHT),
    TWILIGHT("Twilight", ElementalType.DARK), SHADOW("Shadow", ElementalType.DARK), FLAME("Flame", ElementalType.FIRE),
    BURNING("Burning", ElementalType.FIRE), ICE("Ice", ElementalType.FROST), FREEZING("Freezing", ElementalType.FROST);

    private ElementalType elementalType;
    private String lowercase;

    WeaponSuffix(String lowercase) {
        elementalType = ElementalType.NONE;
        this.lowercase = lowercase;
    }

    WeaponSuffix(String lowercase, ElementalType elementalType) {
        this.elementalType = elementalType;
        this.lowercase = lowercase;
    }

    public ElementalType getElementalType() {
        return elementalType;
    }

    public boolean isElemental() {
        return elementalType == ElementalType.NONE;
    }

    public String toString() {
        return lowercase;
    }
}
