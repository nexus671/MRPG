package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Gemstones that can be embedded in jewelry.
 */
public enum JewelryGem {
    NONE(0.2), AMETHYST(0.3), OPAL(0.4), GARNET(0.5), TOPAZ(0.6), JADE(0.7), TANZANITE(0.8), IOLITE(0.9), SAPPHIRE(1),
    MORGANITE(1.1), ALEXANDRITE(1.2), EMERALD(1.3), RUBY(1.4), DIAMOND(1.5);

    final double powerModifier; //multiplied by the stats of an enchanted piece of jewelry
    final String lowercase;

    JewelryGem(double powerModifier) {
        this.powerModifier = powerModifier;
        lowercase = StringManip.toLowercase(super.toString());
    }

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
