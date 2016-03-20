package com.truth.neogames.HoldingSystems;

import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.RPGObject;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: The array of worn gear for a player or monster.
 */
public class WornGear extends RPGObject {
    private final com.truth.neogames.Items.GearPackage.Gear[] gear;

    /*************
     * Constructors
     *************/

    public WornGear() {
        gear = new com.truth.neogames.Items.GearPackage.Gear[9];
    }

    /**************
     * Specific Methods
     *************/

    public boolean contains(com.truth.neogames.Items.GearPackage.Gear g) {
        WornSlot slot = g.getSlot();
        return gear[slot.getSlotNumber()].equals(g);
    }

    public boolean slotIsEmpty(WornSlot slot) {
        int index = slot.getSlotNumber();
        return (gear[index] == null);
    }

    /*************
     * Getters
     *************/

    public com.truth.neogames.Items.GearPackage.Gear[] getGear() {
        return gear;
    }

    public com.truth.neogames.Items.GearPackage.Gear getFromSlot(WornSlot slot) {
        return gear[slot.getSlotNumber()];
    }

    public String toString() {
        String str = "";
        int i = 0;
        for (com.truth.neogames.Items.GearPackage.Gear g : gear) {
            str += WornSlot.getSlotTitle(i) + ": " + g + '\n';
            i++;
        }
        return str;
    }
}
