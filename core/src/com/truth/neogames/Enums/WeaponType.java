package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/25/2015.
 * Class Description: Describes the type of weapon.
 */
public enum WeaponType {
    SWORD(false, DamageType.SLASHING, 1, .05, .15, 1), MACE(false, DamageType.CRUSHING, 1, .3, .25, 1),
    DAGGER(false, DamageType.PIERCING, .95, .15, .05, 1), SCIMITAR(false, DamageType.SLASHING, .98, .1, .2, 1),
    BATTLEAXE(true, DamageType.SLASHING, 1.7, .5, .3, 2), WARHAMMER(true, DamageType.CRUSHING, 1.7, .6, .3, 2),
    BROADSWORD(true, DamageType.SLASHING, 1.7, .4, .4, 2), PIKE(true, DamageType.PIERCING, 1.7, .2, .2, 3),
    HALBERD(true, DamageType.SLASHING, 1.1, .2, .1, 3), FLAIL(true, DamageType.CRUSHING, 2, .95, 0, 2),
    BOW(true, DamageType.PIERCING, .8, .2, .2, 10), CROSSBOW(false, DamageType.PIERCING, .6, .3, .1, 8),
    STAFF(true, DamageType.CRUSHING, .2, .2, 0, 1), WAND(false, DamageType.CRUSHING, .1, .1, 0, 1);

    private boolean twoHanded;
    private String lowercase;
    private DamageType style;
    private double damageModifier; //multiplied by the avgDamage from the material to determine avg damage
    private double rangeModifier; // avgDamage +/- (avgDamage * rangeModifier) = max/min damage
    private double critChance;
    private int range;

    WeaponType(boolean twoHanded, DamageType style, double damageModifier, double rangeModifier, double critChance, int range) {
        this.twoHanded = twoHanded;
        this.style = style;
        this.damageModifier = damageModifier;
        this.rangeModifier = rangeModifier;
        this.critChance = critChance;
        this.range = range;
        lowercase = StringManip.toLowercase(super.toString());
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }

    public String getLowercase() {
        return lowercase;
    }

    public DamageType getStyle() {
        return style;
    }

    public double getDamageModifier() {
        return damageModifier;
    }

    public double getRangeModifier() {
        return rangeModifier;
    }

    public double getCritChance() {
        return critChance;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
