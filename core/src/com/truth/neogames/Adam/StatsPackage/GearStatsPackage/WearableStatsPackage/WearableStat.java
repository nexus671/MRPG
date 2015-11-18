package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WearableStatsPackage;

import com.truth.neogames.Adam.StatsPackage.Stat;
import com.truth.neogames.Enums.WearableStatName;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A statistic for a piece of wearable gear.
 */
public class WearableStat extends Stat {
    private WearableStatName name;
    private double value;

    public WearableStat(WearableStatName name, double value) {
        this.value = value;
        this.name = name;
    }

    public WearableStatName getName() {
        return name;
    }

    public void setName(WearableStatName name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
