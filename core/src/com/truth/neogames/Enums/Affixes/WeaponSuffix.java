package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/9/2015.
 * Class Description: Suffixes for weapons: some of them give the weapon a certain elemental type,
 * which provides a bonus.
 */
public enum WeaponSuffix {
    /**
     * None weapon suffix.
     */
    NONE(), /**
     * Triumph weapon suffix.
     */
    TRIUMPH(), /**
     * Ferocity weapon suffix.
     */
    FEROCITY(), /**
     * Victory weapon suffix.
     */
    VICTORY(), /**
     * Chaos weapon suffix.
     */
    CHAOS(), /**
     * Eons weapon suffix.
     */
    EONS(),
    /**
     * Oblivion weapon suffix.
     */
    OBLIVION(), /**
     * Incandescence weapon suffix.
     */
    INCANDESCENCE(ElementalType.LIGHT), /**
     * Radiance weapon suffix.
     */
    RADIANCE(ElementalType.LIGHT),
    /**
     * Twilight weapon suffix.
     */
    TWILIGHT(ElementalType.DARK), /**
     * Shadow weapon suffix.
     */
    SHADOW(ElementalType.DARK), /**
     * Flame weapon suffix.
     */
    FLAME(ElementalType.FIRE),
    /**
     * Burning weapon suffix.
     */
    BURNING(ElementalType.FIRE), /**
     * Ice weapon suffix.
     */
    ICE(ElementalType.FROST), /**
     * Freezing weapon suffix.
     */
    FREEZING(ElementalType.FROST);

    private final ElementalType elementalType;
    private final String lowercase;

    /**
     * Instantiates a new Weapon suffix.
     */
    WeaponSuffix() {
        elementalType = ElementalType.NONE;
        lowercase = StringManip.toLowercase(super.toString());
    }

    /**
     * Instantiates a new Weapon suffix.
     *
     * @param elementalType the elemental type
     */
    WeaponSuffix(ElementalType elementalType) {
        this.elementalType = elementalType;
        lowercase = StringManip.toLowercase(super.toString());
    }

    /**
     * Gets elemental type.
     *
     * @return the elemental type
     */
    public ElementalType getElementalType() {
        return elementalType;
    }

    /**
     * Is elemental boolean.
     *
     * @return the boolean
     */
    public boolean isElemental() {
        return elementalType == ElementalType.NONE;
    }

    @Override
    public String toString() {
        return "WeaponSuffix{" +
                "elementalType=" + elementalType +
                ", lowercase='" + lowercase + '\'' +
                '}';
    }
}
