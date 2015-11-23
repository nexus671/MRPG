package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage;

import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.GearStats;
import com.truth.neogames.Enums.AttackStyle;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.Affixes.GearMaterial;
import com.truth.neogames.Enums.Affixes.WeaponSuffix;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A collective class of all the stats for a weapon.
 */
public class WeaponStats extends GearStats {
    private WeaponStat styleDamage;
    private GearMaterial material;
    private WeaponSuffix suffix;
    private double critChance;
    private int range;
    private AttackStyle style;

    /************* Constructors *************/

    public WeaponStats(WeaponStat styleDamage, GearMaterial material, WeaponSuffix suffix, double critChance, AttackStyle style, int range) {
        this.styleDamage = styleDamage;
        this.material = material;
        this.suffix = suffix;
        this.critChance = critChance;
        this.style = style;
        this.range = range;
    }

    /************* Getters and Setters *************/

    public WeaponStat getStyleDamage() {
        return styleDamage;
    }

    public void setStyleDamage(WeaponStat styleDamage) {
        this.styleDamage = styleDamage;
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

    public AttackStyle getStyle() {
        return style;
    }

    public void setStyle(AttackStyle style) {
        this.style = style;
    }

    public double getCritChance() {
        return critChance;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public ElementalType getElementalType() {
        return suffix.getElementalType();
    }
}
