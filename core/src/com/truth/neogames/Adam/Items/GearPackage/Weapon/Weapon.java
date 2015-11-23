package com.truth.neogames.Adam.Items.GearPackage.Weapon;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Enums.Affixes.GearMaterial;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage.WeaponStats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A weapon.
 */
public class Weapon extends Gear {
    private boolean isTwoHanded;
    private WeaponStats stats;

    public Weapon(boolean isTwoHanded, WeaponStats stats) {
        this.isTwoHanded = isTwoHanded;
        this.stats = stats;
        slot = WornSlot.MAINHAND;
    }

    public boolean isTwoHanded() {
        return isTwoHanded;
    }

    public void setIsTwoHanded(boolean isTwoHanded) {
        this.isTwoHanded = isTwoHanded;
    }

    @Override
    public WeaponStats getStats() {
        return stats;
    }

    public void setStats(WeaponStats stats) {
        this.stats = stats;
    }
}
