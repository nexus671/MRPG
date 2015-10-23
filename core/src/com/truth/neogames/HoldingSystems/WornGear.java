package com.truth.neogames.HoldingSystems;

import com.truth.neogames.Items.GearPackage.Gear;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class WornGear {
    private final Gear[] Gear;
    private final Inventory inv;

    public WornGear() {
        Gear = new Gear[9];
        inv = this.inv;
    }

    public boolean equip(Gear item, int s) {
        int index = item.getSlot();
        if (Gear[index] != null) {
            if (!deEquip(index)) {
                return false;
            }
        }
        if (item.isTwoHanded()) {
            if (Gear[7] != null) {
                return false;
            }
        }
        if (Gear[0] != null) {
            if (item.getSlot() == 7) {
                return false;
            }
        }
        Gear[index] = item;
        inv.removeItem(item);
        return true;
    }

    private boolean deEquip(int slot) {
        if (inv.addItem(Gear[slot])) {
            Gear[slot] = null;
            return true;
        }
        return false;
    }
}
