package com.truth.neogames.Adam.Items.GearPackage;

import com.truth.neogames.Adam.Items.Item;
import com.truth.neogames.Enums.Affixes.GearMaterial;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.GearStats;

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

    public WornSlot getSlot() {
        return slot;
    }

    public void setSlot(WornSlot slot) {
        this.slot = slot;
    }
}
