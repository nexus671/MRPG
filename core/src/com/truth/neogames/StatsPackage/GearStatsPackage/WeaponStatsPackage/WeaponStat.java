package com.truth.neogames.StatsPackage.GearStatsPackage.WeaponStatsPackage;

import com.truth.neogames.Enums.WeaponStatName;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A damage stat for a weapon.
 */
public class WeaponStat {
    private WeaponStatName name;
    private int min, max;

    public WeaponStat(WeaponStatName name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    public WeaponStatName getName() {
        return name;
    }

    public void setName(WeaponStatName name) {
        this.name = name;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
