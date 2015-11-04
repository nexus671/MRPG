package com.truth.neogames.Items.GearPackage.Weapon;

import com.truth.neogames.Items.GearPackage.Gear;
import com.truth.neogames.StatsPackage.GearStatsPackage.WeaponStatsPackage.WeaponStats;

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
    }
}
