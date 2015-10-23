package com.truth.neogames.HoldingSystems;

import com.truth.neogames.Items.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Inventory {
    final List<Item> inv;

    public Inventory() {
        inv = new ArrayList<Item>(20);

    }

    public boolean addItem(Item i) {
        if (inv.size() == 30) {
            return false;
        } else {
            inv.add(i);
            return true;
        }
    }

    public void removeItem(Item i) {
        inv.remove(i);
    }

    public Item getItem(int i) {
        return inv.get(i);
    }
}
