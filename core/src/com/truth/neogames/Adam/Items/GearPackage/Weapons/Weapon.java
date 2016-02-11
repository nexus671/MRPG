package com.truth.neogames.Adam.Items.GearPackage.Weapons;

import com.truth.neogames.Adam.Items.GearPackage.CombatGear;
import com.truth.neogames.Enums.Affixes.Material;
import com.truth.neogames.Enums.Affixes.WeaponSuffix;
import com.truth.neogames.Enums.AttackStyle;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.WeaponType;
import com.truth.neogames.Enums.WornSlot;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A weapon.
 */
public class Weapon extends CombatGear {
    private double maxDamage;
    private double minDamage;
    private WeaponSuffix suffix;
    private WeaponType type;

    /************* Constructors *************/

    public Weapon(Material material, WeaponSuffix suffix, WeaponType type) {
        double avgDamage = material.getAvgDamage() * type.getDamageModifier();
        maxDamage = avgDamage + avgDamage * type.getRangeModifier();
        minDamage = avgDamage - avgDamage * type.getRangeModifier();
        this.suffix = suffix;
        this.type = type;
        this.slot = WornSlot.MAINHAND;
    }

    public Weapon(WornSlot slot, Material material, WeaponSuffix suffix, WeaponType type) {
        this.slot = slot;
        double avgDamage = material.getAvgDamage() * type.getDamageModifier();
        maxDamage = avgDamage + avgDamage * type.getRangeModifier();
        minDamage = avgDamage - avgDamage * type.getRangeModifier();
        this.suffix = suffix;
        this.type = type;
    }

    /************* Getters and Setters *************/

    public double getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(double maxDamage) {
        this.maxDamage = maxDamage;
    }

    public double getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(double minDamage) {
        this.minDamage = minDamage;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public WeaponSuffix getSuffix() {
        return suffix;
    }

    public void setSuffix(WeaponSuffix suffix) {
        this.suffix = suffix;
    }

    public WeaponType getType() {
        return type;
    }

    public AttackStyle getAttackStyle() {
        return type.getStyle();
    }

    public double getCritChance() {
        return type.getCritChance();
    }

    public int getRange() {
        return type.getRange();
    }

    public ElementalType getElementalType() {
        return suffix.getElementalType();
    }
}
