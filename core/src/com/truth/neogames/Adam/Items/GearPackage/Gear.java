package com.truth.neogames.Adam.Items.GearPackage;

import com.truth.neogames.Adam.Items.Item;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.GearStats;
import com.truth.neogames.Enums.WornSlot;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Describes any item that can be equipped in the worn gear (weapon or armor).
 */
public class Gear extends Item {

    protected WornSlot slot;
    protected GearStats stats;

    public Gear() {
        stats = new GearStats();
    }

    public GearStats getStats() {
        return stats;
    }

    public void setStats(GearStats stats) {
        this.stats = stats;
    }

    public WornSlot getSlot() {
        return slot;
    }

    public void setSlot(WornSlot slot) {
        this.slot = slot;
    }
}
