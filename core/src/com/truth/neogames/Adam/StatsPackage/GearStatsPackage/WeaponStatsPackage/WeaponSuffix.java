package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage;

import com.truth.neogames.Adam.StatsPackage.Affix;
import com.truth.neogames.Enums.Affixes.WeaponSuffixName;

/**
 * Created by Adam on 11/16/2015.
 * Class Description: A suffix for a weapon.
 */
public class WeaponSuffix extends Affix {
    private WeaponSuffixName name;

    public WeaponSuffix(WeaponSuffixName name) {
        this.name = name;
    }

    public WeaponSuffixName getName() {
        return name;
    }

    public void setName(WeaponSuffixName name) {
        this.name = name;
    }
}
