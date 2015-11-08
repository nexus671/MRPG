package com.truth.neogames.StatsPackage.GearStatsPackage.WearableStatsPackage;

import com.truth.neogames.Enums.WearableStatName;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A statistic for a piece of wearable gear.
 */
public class WearableStat {
    private WearableStatName name;
    private int value;

    public WearableStat(WearableStatName name, int value) {
        this.value = value;
        this.name = name;
    }

    public WearableStatName getName() {
        return name;
    }

    public void setName(WearableStatName name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
