package com.truth.neogames.Adam_the_cool_kid.HoldingSystems;

import com.truth.neogames.Enums.WornSlot;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: The array of worn gear for a player or monster.
 */
public class WornGear {
    private final com.truth.neogames.Adam_the_cool_kid.Items.GearPackage.Gear[] gear;

    /*************
     * Constructors
     *************/

    public WornGear() {
        this.gear = new com.truth.neogames.Adam_the_cool_kid.Items.GearPackage.Gear[9];
    }

    /**************
     * Specific Methods
     *************/

    public boolean contains(com.truth.neogames.Adam_the_cool_kid.Items.GearPackage.Gear g) {
        WornSlot slot = g.getSlot();
        return gear[slot.getSlotNumber()].equals(g);
    }

    /*************
     * Getters
     *************/

    public com.truth.neogames.Adam_the_cool_kid.Items.GearPackage.Gear[] getGear() {
        return gear;
    }
}
