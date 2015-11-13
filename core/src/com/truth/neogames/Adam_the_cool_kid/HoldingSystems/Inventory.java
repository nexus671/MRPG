package com.truth.neogames.Adam_the_cool_kid.HoldingSystems;

import com.truth.neogames.Adam_the_cool_kid.Items.Item;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: The inventory system for the player.
 */
public class Inventory {
    public static int size = 20;

    private Item[] inv;

    /************* Constructors *************/

    public Inventory() {
        inv = new Item[size];
    }

    /************* Specific Methods *************/

    public static int getSIZE() {
        return size;
    }

    /**
     * Adds an item to the inventory. If an item is stackable and already contained in the
     * inventory, it's added to that stack.
     * @param i The item to be added.
     * @return True if the item was added successfully, false if inventory was full.
     */
    public boolean add(Item i) {
        int indexInArray = getIndexOf(i);
        if(i.isStackable() && indexInArray != -1) {
            inv[indexInArray].setStackCount(inv[indexInArray].getStackCount() + i.getStackCount());
            return true;
        }
        else if(!isFull()) {
            int index = getFirstEmptySpace();
            inv[index] = i;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @return The index of the first null object in the array, or -1 if the array is full.
     */
    public int getFirstEmptySpace() {
        for (int i = 0; i < size; i++) {
            if(inv[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Gets the index of an item in the inventory.
     * @param i The item to be checked for.
     * @return The first index the item is located at, or -1 if the item is not
     * found in the inventory.
     */
    public int getIndexOf(Item i) {
        Item check;
        for (int count = 0; count < size; count++) {
            check = inv[count];
            if (i.equals(check)) {
                return count;
            }
        }
        return -1;
    }

    /**
     * Checks whether the inventory contains a specific item.
     *
     * @param i The item to be checked.
     * @return True if the inventory contains the item somewhere.
     */
    public boolean contains(Item i) {
        for (Item check : inv) {
            if (check.equals(i)) {
                return true;
            }
        }
        return false;
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

    /************* Getters *************/

    public Item[] getInv() {
        return inv;
    }
}

