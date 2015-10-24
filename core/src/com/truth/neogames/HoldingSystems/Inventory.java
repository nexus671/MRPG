package com.truth.neogames.HoldingSystems;

import com.truth.neogames.Items.Item;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Inventory {
    public static final int SIZE = 20;
    private Item[] inv;

    public Inventory() {
        inv = new Item[SIZE];
    }

    public boolean add(Item i) {
        int index = getFirstEmptySpace();
        if(index == -1) {
            return false;
        }
        else {
            inv[index] = i;
            return true;
        }
    }

    /**
     * Adds an item at a specified index. Be careful when using this, because it will overwrite
     * any item at the specified index.
     * @param i The item to be added.
     * @param index The index in the array.
     * @return True if the index was in the valid range 0 - SIZE.
     */
    public boolean add(Item i, int index) {
        if(index < 0 || index > SIZE) {
            return false;
        }
        else {
            inv[index] = i;
            return true;
        }
    }

    /**
     * @return The index of the first null object in the array, or -1 if the array is full.
     */
    public int getFirstEmptySpace() {
        for(int i = 0; i < SIZE; i++) {
            if(inv[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @return True if the inventory is full of items.
     */
    public boolean isFull() {
        for(Item i:inv) {
            if(i == null) {
                return false;
            }
        }
        return true;
    }
}

