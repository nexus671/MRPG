package com.truth.neogames.Items.GearPackage;

import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Items.Item;
import com.truth.neogames.StatsPackage.GearStatsPackage.GearStats;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Describes any item that can be equipped in the worn gear (weapon or armor).
 */
public class Gear extends Item {

    protected WornSlot slot;
    protected GearStats stats;

    /************* Constructors *************/

    public Gear() {
        stats = new GearStats();
    }

    public Gear(int slotNumber) {
        this.slot = WornSlot.getSlotTitle(slotNumber);
    }

    public Gear(WornSlot slot) {
        this.slot = slot;
    }

    /************* Getters *************/

    public GearStats getStats() {
        return stats;
    }

    public WornSlot getSlot() {
        return slot;
    }

    /************* Setters *************/

    public void setSlot(WornSlot slot) {
        this.slot = slot;
    }

}
