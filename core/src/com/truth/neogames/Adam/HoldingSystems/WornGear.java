package com.truth.neogames.Adam.HoldingSystems;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Enums.WornSlot;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: The array of worn gear for a player or monster.
 */
public class WornGear {
    private final Gear[] gear;

    /*************
     * Constructors
     *************/

    public WornGear() {
        this.gear = new Gear[9];
    }

    /**************
     * Specific Methods
     *************/

    public boolean contains(Gear g) {
        WornSlot slot = g.getSlot();
        return gear[slot.getSlotNumber()].equals(g);
    }

    /*************
     * Getters
     *************/

    public Gear[] getGear() {
        return gear;
    }
}
