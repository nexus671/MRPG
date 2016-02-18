package com.truth.neogames.Adam.StatsPackage.GearStatsPackage;

import com.truth.neogames.Utilities.DecimalRounder;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A statistic for a piece of armor.
 */
public class ArmorStat {
    private String name;
    private double value;

    public ArmorStat(String name, double value) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + DecimalRounder.round(value);
    }
}
