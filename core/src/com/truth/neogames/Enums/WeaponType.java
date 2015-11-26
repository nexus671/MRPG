package com.truth.neogames.Enums;

/**
 * Created by Adam on 11/25/2015.
 * Class Description: Describes the type of weapon.
 */
public enum WeaponType {
    SWORD(false, "Sword", AttackStyle.SLASHING, 1, .05, .15, 1), MACE(false, "Mace", AttackStyle.CRUSHING, 1, .3, .25, 1),
    DAGGER(false, "Dagger", AttackStyle.PIERCING, .95, .15, .05, 1), SCIMITAR(false, "Scimitar", AttackStyle.SLASHING, .98, .1, .2, 1),
    BATTLEAXE(true, "Battleaxe", AttackStyle.SLASHING, 1.7, .5, .3, 2), WARHAMMER(true, "Warhammer", AttackStyle.CRUSHING, 1.7, .6, .3, 2),
    BROADSWORD(true, "Broadsword", AttackStyle.SLASHING, 1.7, .4, .4, 2), PIKE(true, "Pike", AttackStyle.PIERCING, 1.7, .2, .2, 3),
    HALBERD(true, "Halberd", AttackStyle.SLASHING, 1.1, .2, .1, 3), FLAIL(true, "Flail", AttackStyle.CRUSHING, 2, 1.8, 0, 2),
    BOW(true, "Bow", AttackStyle.PIERCING, .8, .2, .2, 10), CROSSBOW(false, "Crossbow", AttackStyle.PIERCING, .6, .3, .1, 8),
    STAFF(true, "Staff", AttackStyle.ARCANE, 1.7, .2, 0, 8), WAND(false, "Wand", AttackStyle.ARCANE, 1, .1, 0, 6);

    private boolean twoHanded;
    private String lowercase;
    private AttackStyle style;
    private double damageModifier; //multiplied by the avgDamage from the material to determine avg damage
    private double rangeModifier; // avgDamage +/- (avgDamage * rangeModifier) = max/min damage
    private double critChance;
    private int range;

    WeaponType(boolean twoHanded, String lowercase, AttackStyle style, double damageModifier, double rangeModifier, double critChance, int range) {
        this.twoHanded = twoHanded;
        this.lowercase = lowercase;
        this.style = style;
        this.damageModifier = damageModifier;
        this.rangeModifier = rangeModifier;
        this.critChance = critChance;
        this.range = range;
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }

    public String getLowercase() {
        return lowercase;
    }

    public AttackStyle getStyle() {
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
}
