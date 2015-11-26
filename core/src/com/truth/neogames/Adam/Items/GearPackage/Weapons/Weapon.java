package com.truth.neogames.Adam.Items.GearPackage.Weapons;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Enums.Affixes.GearMaterial;
import com.truth.neogames.Enums.WeaponType;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage.WeaponStats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A weapon.
 */
public class Weapon extends Gear {
    private WeaponStats stats;

    public Weapon(WeaponStats stats) {
        this.stats = stats;
        slot = WornSlot.MAINHAND;
    }

    public WeaponType getType() {
        return stats.getType();
    }

    public WeaponStats getStats() {
        return stats;
    }

    public void setStats(WeaponStats stats) {
        this.stats = stats;
    }
}
