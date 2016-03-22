package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/9/2015.
 * Class Description: Suffixes for armor: some of them give the armor a certain elemental type, which
 * gives special bonuses.
 */
public enum ArmorSuffix {
    /**
     * None armor suffix.
     */
    NONE, /**
     * Hardiness armor suffix.
     */
    HARDINESS, /**
     * Enlightening armor suffix.
     */
    ENLIGHTENING, /**
     * Brawling armor suffix.
     */
    BRAWLING, /**
     * Aptitude armor suffix.
     */
    APTITUDE,
    /**
     * Prosperity armor suffix.
     */
    PROSPERITY, /**
     * Incandescence armor suffix.
     */
    INCANDESCENCE(ElementalType.LIGHT), /**
     * Radiance armor suffix.
     */
    RADIANCE(ElementalType.LIGHT),
    /**
     * Twilight armor suffix.
     */
    TWILIGHT(ElementalType.DARK), /**
     * Shadow armor suffix.
     */
    SHADOW(ElementalType.DARK), /**
     * Flame armor suffix.
     */
    FLAME(ElementalType.FIRE),
    /**
     * Burning armor suffix.
     */
    BURNING(ElementalType.FIRE), /**
     * Ice armor suffix.
     */
    ICE(ElementalType.FROST), /**
     * Freezing armor suffix.
     */
    FREEZING(ElementalType.FROST);

    private final ElementalType elementalType;
    private final String lowercase;

    /**
     * Instantiates a new Armor suffix.
     */
    ArmorSuffix() {
        lowercase = StringManip.toLowercase(super.toString());
        elementalType = ElementalType.NONE;
    }

    /**
     * Instantiates a new Armor suffix.
     *
     * @param type the type
     */
    ArmorSuffix(ElementalType type) {
        lowercase = StringManip.toLowercase(super.toString());
        elementalType = type;
    }

    /**
     * Gets description.
     *
     * @param suffix the suffix
     * @return the description
     */
    public static String getDescription(ArmorSuffix suffix) {
        String description = "";
        if (suffix.elementalType == ElementalType.NONE) {
            description = "Passively increased";
        }
        switch (suffix) {
            case HARDINESS:
                description += " constitution.";
                break;
            case ENLIGHTENING:
                description += " wisdom.";
                break;
            case BRAWLING:
                description += " strength.";
                break;
            case APTITUDE:
                description += " wisdom.";
                break;
            case PROSPERITY:
                description += " luck.";
                break;
            case INCANDESCENCE:
            case RADIANCE:
                description = "Increased defensive stats (light elemental type).";
                break;
            case TWILIGHT:
            case SHADOW:
                description = "Saps enemy mana upon taking damage (dark elemental type).";
                break;
            case FLAME:
            case BURNING:
                description = "Applies a health draining burning effect to enemies for several turns" +
                        " upon taking damage (fire elemental type).";
                break;
            case ICE:
            case FREEZING:
                description += "Reduces enemy movement stat for their next turn upon taking damage (frost elemental type).";
                break;
        }
        return description;
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
        return "ArmorSuffix{" +
                "elementalType=" + elementalType +
                ", lowercase='" + lowercase + '\'' +
                '}';
    }
}
