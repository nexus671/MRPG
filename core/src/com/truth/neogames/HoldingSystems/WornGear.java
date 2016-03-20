package com.truth.neogames.HoldingSystems;

import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Items.GearPackage.Gear;
import com.truth.neogames.RPGObject;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: The array of worn gear for a player or monster.
 */
public class WornGear extends RPGObject {
    private final Gear[] gear;

    /*************
     * Constructors
     *************/

    public WornGear() {
        gear = new Gear[9];
    }

    /**************
     * Specific Methods
     *************/

    public boolean contains(Gear g) {
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

    public Gear[] getGear() {
        return gear;
    }

    public Gear getFromSlot(WornSlot slot) {
        return gear[slot.getSlotNumber()];
    }

    public String toString() {
        String str = "";
        int i = 0;
        for (Gear g : gear) {
            str += WornSlot.getSlotTitle(i) + ": " + g + '\n';
            i++;
        }
        return str;
    }
}
