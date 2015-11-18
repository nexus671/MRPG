package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WearableStatsPackage;

import com.truth.neogames.Adam.StatsPackage.Affix;
import com.truth.neogames.Enums.Affixes.WearablePrefixName;

/**
 * Created by Adam on 11/16/2015.
 * Class Description: A suffix for a wearable piece of gear.
 */
public class WearableSuffix extends Affix {
    private WearablePrefixName name;

    public WearableSuffix(WearablePrefixName name) {
        this.name = name;
    }

    public WearablePrefixName getName() {
        return name;
    }

    public void setName(WearablePrefixName name) {
        this.name = name;
    }
}
