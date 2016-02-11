package com.truth.neogames.Enums.Affixes;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Gemstones that can be embedded in jewelry.
 */
public enum JewelryGem {
    NONE(.2), AMETHYST(.3), OPAL(.4), GARNET(.5), TOPAZ(.6), JADE(.7), TANZANITE(.8), IOLITE(.9), SAPPHIRE(1),
    MORGANITE(1.1), ALEXANDRITE(1.2), EMERALD(1.3), RUBY(1.4), DIAMOND(1.5);

    double powerModifier; //multiplied by the stats of an enchanted piece of jewelry

    JewelryGem(double powerModifier) {
        this.powerModifier = powerModifier;
    }

    public double getPowerModifier() {
        return powerModifier;
    }
}
