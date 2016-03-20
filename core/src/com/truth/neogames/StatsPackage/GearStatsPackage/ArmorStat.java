package com.truth.neogames.StatsPackage.GearStatsPackage;

import com.truth.neogames.RPGObject;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A statistic for a piece of armor.
 */
public class ArmorStat extends RPGObject {
    private double maxValue;
    private double value;

    public ArmorStat(String name, double maxValue) {
        this.maxValue = maxValue;
        value = maxValue;
        super.name = name;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ArmorStat{" +
                "maxValue=" + maxValue +
                ", value=" + value +
                '}';
    }
}