package com.truth.neogames.Adam.Items.GearPackage.Wearables;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WearableStatsPackage.WearableStats;
import com.truth.neogames.Enums.WornSlot;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class Wearable extends Gear {
    private WearableStats stats;

    public Wearable(WearableStats stats, WornSlot slot) {
        this.stats = stats;
        this.slot = slot;
    }

    public WearableStats getStats() {
        return stats;
    }

    public void setStats(WearableStats stats) {
        this.stats = stats;
    }
}
