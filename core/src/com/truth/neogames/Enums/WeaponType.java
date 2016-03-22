package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/25/2015.
 * Class Description: Describes the type of weapon.
 */
public enum WeaponType {
    /**
     * Sword weapon type.
     */
    SWORD(false, DamageType.SLASHING, 1, 0.05, 0.15, 1), /**
     * Mace weapon type.
     */
    MACE(false, DamageType.CRUSHING, 1, 0.3, 0.25, 1),
    /**
     * Dagger weapon type.
     */
    DAGGER(false, DamageType.PIERCING, 0.95, 0.15, 0.05, 1), /**
     * Scimitar weapon type.
     */
    SCIMITAR(false, DamageType.SLASHING, 0.98, 0.1, 0.2, 1),
    /**
     * Battleaxe weapon type.
     */
    BATTLEAXE(true, DamageType.SLASHING, 1.7, 0.5, 0.3, 2), /**
     * Warhammer weapon type.
     */
    WARHAMMER(true, DamageType.CRUSHING, 1.7, 0.6, 0.3, 2),
    /**
     * Broadsword weapon type.
     */
    BROADSWORD(true, DamageType.SLASHING, 1.7, 0.4, 0.4, 2), /**
     * Pike weapon type.
     */
    PIKE(true, DamageType.PIERCING, 1.7, 0.2, 0.2, 3),
    /**
     * Halberd weapon type.
     */
    HALBERD(true, DamageType.SLASHING, 1.1, 0.2, 0.1, 3), /**
     * Flail weapon type.
     */
    FLAIL(true, DamageType.CRUSHING, 2, 0.95, 0, 2),
    /**
     * Bow weapon type.
     */
    BOW(true, DamageType.PIERCING, 0.8, 0.2, 0.2, 10), /**
     * Crossbow weapon type.
     */
    CROSSBOW(false, DamageType.PIERCING, 0.6, 0.3, 0.1, 8),
    /**
     * Staff weapon type.
     */
    STAFF(true, DamageType.CRUSHING, 0.2, 0.2, 0, 1), /**
     * Wand weapon type.
     */
    WAND(false, DamageType.CRUSHING, 0.1, 0.1, 0, 1);

    private final boolean twoHanded;
    private final String lowercase;
    private final DamageType style;
    private final double damageModifier; //multiplied by the avgDamage from the material to determine avg damage
    private final double rangeModifier; // avgDamage +/- (avgDamage * rangeModifier) = max/min damage
    private final double critChance;
    private final int range;

    /**
     * Instantiates a new Weapon type.
     *
     * @param twoHanded      the two handed
     * @param style          the style
     * @param damageModifier the damage modifier
     * @param rangeModifier  the range modifier
     * @param critChance     the crit chance
     * @param range          the range
     */
    WeaponType(boolean twoHanded, DamageType style, double damageModifier, double rangeModifier, double critChance, int range) {
        this.twoHanded = twoHanded;
        this.style = style;
        this.damageModifier = damageModifier;
        this.rangeModifier = rangeModifier;
        this.critChance = critChance;
        this.range = range;
        lowercase = StringManip.toLowercase(super.toString());
    }

    /**
     * Is two handed boolean.
     *
     * @return the boolean
     */
    public boolean isTwoHanded() {
        return twoHanded;
    }

    /**
     * Gets lowercase.
     *
     * @return the lowercase
     */
    public String getLowercase() {
        return lowercase;
    }

    /**
     * Gets style.
     *
     * @return the style
     */
    public DamageType getStyle() {
        return style;
    }

    /**
     * Gets damage modifier.
     *
     * @return the damage modifier
     */
    public double getDamageModifier() {
        return damageModifier;
    }

    /**
     * Gets range modifier.
     *
     * @return the range modifier
     */
    public double getRangeModifier() {
        return rangeModifier;
    }

    /**
     * Gets crit chance.
     *
     * @return the crit chance
     */
    public double getCritChance() {
        return critChance;
    }

    /**
     * Gets range.
     *
     * @return the range
     */
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
