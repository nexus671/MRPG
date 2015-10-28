package com.truth.neogames.HoldingSystems;

import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Items.GearPackage.Gear;

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
