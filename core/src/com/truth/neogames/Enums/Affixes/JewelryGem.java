package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Gemstones that can be embedded in jewelry.
 */
public enum JewelryGem {
    /**
     * None jewelry gem.
     */
    NONE(0.2), /**
     * Amethyst jewelry gem.
     */
    AMETHYST(0.3), /**
     * Opal jewelry gem.
     */
    OPAL(0.4), /**
     * Garnet jewelry gem.
     */
    GARNET(0.5), /**
     * Topaz jewelry gem.
     */
    TOPAZ(0.6), /**
     * Jade jewelry gem.
     */
    JADE(0.7), /**
     * Tanzanite jewelry gem.
     */
    TANZANITE(0.8), /**
     * Iolite jewelry gem.
     */
    IOLITE(0.9), /**
     * Sapphire jewelry gem.
     */
    SAPPHIRE(1),
    /**
     * Morganite jewelry gem.
     */
    MORGANITE(1.1), /**
     * Alexandrite jewelry gem.
     */
    ALEXANDRITE(1.2), /**
     * Emerald jewelry gem.
     */
    EMERALD(1.3), /**
     * Ruby jewelry gem.
     */
    RUBY(1.4), /**
     * Diamond jewelry gem.
     */
    DIAMOND(1.5);

    /**
     * The Power modifier.
     */
    final double powerModifier; //multiplied by the stats of an enchanted piece of jewelry
    /**
     * The Lowercase.
     */
    final String lowercase;

    /**
     * Instantiates a new Jewelry gem.
     *
     * @param powerModifier the power modifier
     */
    JewelryGem(double powerModifier) {
        this.powerModifier = powerModifier;
        lowercase = StringManip.toLowercase(super.toString());
    }

    /**
     * Gets power modifier.
     *
     * @return the power modifier
     */
    public double getPowerModifier() {
        return powerModifier;
    }

    @Override
    public String toString() {
        return "JewelryGem{" +
                "powerModifier=" + powerModifier +
                ", lowercase='" + lowercase + '\'' +
                '}';
    }
}
