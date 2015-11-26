package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WearableStatsPackage;

import com.truth.neogames.Adam.StatsPackage.Stat;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A statistic for a piece of wearable gear.
 */
public class WearableStat extends Stat {
    private String name;
    private double value;

    public WearableStat(String name, double value) {
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
}
