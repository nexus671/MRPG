package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/25/2015.
 * Class Description: Describes the type of weapon.
 */
public enum WeaponType {
    SWORD(false, DamageType.SLASHING, 1, 0.05, 0.15, 1), MACE(false, DamageType.CRUSHING, 1, 0.3, 0.25, 1),
    DAGGER(false, DamageType.PIERCING, 0.95, 0.15, 0.05, 1), SCIMITAR(false, DamageType.SLASHING, 0.98, 0.1, 0.2, 1),
    BATTLEAXE(true, DamageType.SLASHING, 1.7, 0.5, 0.3, 2), WARHAMMER(true, DamageType.CRUSHING, 1.7, 0.6, 0.3, 2),
    BROADSWORD(true, DamageType.SLASHING, 1.7, 0.4, 0.4, 2), PIKE(true, DamageType.PIERCING, 1.7, 0.2, 0.2, 3),
    HALBERD(true, DamageType.SLASHING, 1.1, 0.2, 0.1, 3), FLAIL(true, DamageType.CRUSHING, 2, 0.95, 0, 2),
    BOW(true, DamageType.PIERCING, 0.8, 0.2, 0.2, 10), CROSSBOW(false, DamageType.PIERCING, 0.6, 0.3, 0.1, 8),
    STAFF(true, DamageType.CRUSHING, 0.2, 0.2, 0, 1), WAND(false, DamageType.CRUSHING, 0.1, 0.1, 0, 1);

    private final boolean twoHanded;
    private final String lowercase;
    private final DamageType style;
    private final double damageModifier; //multiplied by the avgDamage from the material to determine avg damage
    private final double rangeModifier; // avgDamage +/- (avgDamage * rangeModifier) = max/min damage
    private final double critChance;
    private final int range;

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
        return "WeaponType{" +
                "twoHanded=" + twoHanded +
                ", lowercase='" + lowercase + '\'' +
                ", style=" + style +
                ", damageModifier=" + damageModifier +
                ", rangeModifier=" + rangeModifier +
                ", critChance=" + critChance +
                ", range=" + range +
                '}';
    }
}
