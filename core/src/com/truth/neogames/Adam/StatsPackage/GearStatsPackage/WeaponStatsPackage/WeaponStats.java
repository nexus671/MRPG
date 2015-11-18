package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage;

import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.GearStats;
import com.truth.neogames.Enums.AttackStyle;
import com.truth.neogames.Enums.AbilityRange;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A collective class of all the stats for a weapon.
 */
public class WeaponStats extends GearStats {
    private WeaponStat physicalDamage;
    private WeaponStat elementalDamage;
    private WeaponStat critChance;
    private AttackStyle style;
    private int range;

    /************* Constructors *************/

    public WeaponStats(WeaponStat physicalDamage, WeaponStat elementalDamage, WeaponStat critChance, AttackStyle style, int range) {
        this.physicalDamage = physicalDamage;
        this.elementalDamage = elementalDamage;
        this.critChance = critChance;
        this.style = style;
        this.range = range;
    }

    /************* Getters and Setters *************/

    public WeaponStat getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(WeaponStat physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public WeaponStat getElementalDamage() {
        return elementalDamage;
    }

    public void setElementalDamage(WeaponStat elementalDamage) {
        this.elementalDamage = elementalDamage;
    }

    public AttackStyle getStyle() {
        return style;
    }

    public void setStyle(AttackStyle style) {
        this.style = style;
    }

    public WeaponStat getCritChance() {
        return critChance;
    }

    public void setCritChance(WeaponStat critChance) {
        this.critChance = critChance;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
