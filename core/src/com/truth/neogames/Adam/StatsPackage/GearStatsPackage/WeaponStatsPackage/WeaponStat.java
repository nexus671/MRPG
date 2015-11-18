package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage;

import com.truth.neogames.Adam.StatsPackage.Stat;
import com.truth.neogames.Enums.WeaponStatName;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A damage stat for a weapon.
 */
public class WeaponStat extends Stat {
    private WeaponStatName name;
    private double min;
    private double max;

    public WeaponStat(WeaponStatName name, double min, double max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    /************* Getters and Setters *************/

    public WeaponStatName getName() {
        return name;
    }

    public void setName(WeaponStatName name) {
        this.name = name;
    }

    public double getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
