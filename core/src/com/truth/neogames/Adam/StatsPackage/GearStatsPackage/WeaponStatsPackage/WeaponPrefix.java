package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage;

import com.truth.neogames.Adam.StatsPackage.Affix;
import com.truth.neogames.Adam.StatsPackage.Stat;
import com.truth.neogames.Enums.Affixes.WeaponPrefixName;

/**
 * Created by Adam on 11/16/2015.
 * Class Description: A prefix for a weapon.
 */
public class WeaponPrefix extends Affix{
    private WeaponPrefixName name;

    public WeaponPrefix(WeaponPrefixName name) {
        this.name = name;
    }

    public WeaponPrefixName getName() {
        return name;
    }

    public void setName(WeaponPrefixName name) {
        this.name = name;
    }
}
