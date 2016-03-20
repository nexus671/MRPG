package com.truth.neogames.Items;

import com.truth.neogames.RPGObject;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Describes a generic item that can be held in the inventory.
 */
public abstract class Item extends RPGObject {
    protected boolean stackable;
    protected int stackCount;

    /*************
     * Constructors
     *************/

    protected Item() {
        name = "";
        description = "";
        stackable = false;
        stackCount = 1;
    }

    protected Item(String name, String description, boolean stackable) {
        this.name = name;
        this.description = description;
        this.stackable = stackable;
    }

    /*************
     * Getters and Setters
     *************/

    public int getStackCount() {
        return stackCount;
    }

    public void setStackCount(int stackCount) {
        this.stackCount = stackCount;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
        if (!stackable) {
            stackCount = 1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Item)) {
            return false;
        }
        Item i = (Item) obj;
        return i.getName().equalsIgnoreCase(name);
    }

    @Override
    public String toString() {
        return "Item{" +
                "stackable=" + stackable +
                ", stackCount=" + stackCount +
                '}';
    }
}
