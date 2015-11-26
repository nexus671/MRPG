package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage;

import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.GearStats;
import com.truth.neogames.Enums.AttackStyle;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.Affixes.GearMaterial;
import com.truth.neogames.Enums.Affixes.WeaponSuffix;
import com.truth.neogames.Enums.WeaponStatName;
import com.truth.neogames.Enums.WeaponType;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A collective class of all the stats for a weapon.
 */
public class WeaponStats extends GearStats {
    private double maxDamage;
    private double minDamage;
    private WeaponSuffix suffix;
    private WeaponType type;

    /************* Constructors *************/

    public WeaponStats(GearMaterial material, WeaponSuffix suffix, WeaponType type) {
        double avgDamage = material.getAvgDamage() * type.getDamageModifier();
        maxDamage = avgDamage + avgDamage * type.getRangeModifier();
        minDamage = avgDamage - avgDamage * type.getRangeModifier();
        this.material = material;
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

    public GearMaterial getMaterial() {
        return material;
    }

    public void setMaterial(GearMaterial material) {
        this.material = material;
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
