package com.truth.neogames.StatsPackage.GearStatsPackage;

import com.truth.neogames.RPGObject;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A statistic for a piece of armor.
 */
public class ArmorStat extends RPGObject {
    private double maxValue;
    private double value;

    /**
     * Instantiates a new Armor stat.
     *
     * @param name     the name
     * @param maxValue the max value
     */
    public ArmorStat(String name, double maxValue) {
        this.maxValue = maxValue;
        value = maxValue;
        super.name = name;
    }

    /**
     * Sets max value.
     *
     * @param maxValue the max value
     */
    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Gets max value.
     *
     * @return the max value
     */
    public double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets max value.
     *
     * @param maxValue the max value
     */
    public void setMaxValue(int maxValue) {
        this.maxValue = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
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
