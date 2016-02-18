package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 11/9/2015.
 * Class Description: Suffixes for armor: some of them give the armor a certain elemental type, which
 * gives special bonuses.
 */
public enum ArmorSuffix {
    NONE("None"), HARDINESS("Hardiness"), ENLIGHTENING("Enlightening"), BRAWLING("Brawling"), APTITUDE("Aptitude"),
    PROSPERITY("Prosperity"), INCANDESCENCE("Incandescence", ElementalType.LIGHT), RADIANCE("Radiance", ElementalType.LIGHT),
    TWILIGHT("Twilight", ElementalType.DARK), SHADOW("Shadow", ElementalType.DARK), FLAME("Flame", ElementalType.FIRE),
    BURNING("Burning", ElementalType.FIRE), ICE("Ice", ElementalType.FROST), FREEZING("Freezing", ElementalType.FROST);

    private ElementalType elementalType;
    private String lowercase;

    ArmorSuffix(String lowercase) {
        this.lowercase = lowercase;
        elementalType = ElementalType.NONE;
    }

    ArmorSuffix(String lowercase, ElementalType type) {
        this.lowercase = lowercase;
        elementalType = type;
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
