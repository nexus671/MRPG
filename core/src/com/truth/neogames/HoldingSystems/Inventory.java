package com.truth.neogames.HoldingSystems;

import com.truth.neogames.Items.GearPackage.Gear;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahmane on 10/21/2015.
 */
public class Inventory {
    final List<Gear> inv;

    public Inventory() {
        inv = new ArrayList<Gear>(20);
    }

    //Does this add to the first empty slot or to the end?

    public boolean addItem(Gear i) {
        if (inv.size() == 30) {
            return false;
        } else {
            inv.add(i);
            return true;
        }
    }

    public void removeItem(Gear i) {
        inv.remove(i);
    }

    public Gear getItem(int i) {
        return inv.get(i);
    }
}
