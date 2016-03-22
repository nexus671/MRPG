package com.truth.neogames.Items;

import com.truth.neogames.RPGObject;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Describes a generic item that can be held in the inventory.
 */
public abstract class Item extends RPGObject {
    /**
     * The Stackable.
     */
    protected boolean stackable;
    /**
     * The Stack count.
     */
    protected int stackCount;

    /*************
     * Constructors
     */
    protected Item() {
        name = "";
        description = "";
        stackable = false;
        stackCount = 1;
    }

    /**
     * Instantiates a new Item.
     *
     * @param name        the name
     * @param description the description
     * @param stackable   the stackable
     */
    protected Item(String name, String description, boolean stackable) {
        this.name = name;
        this.description = description;
        this.stackable = stackable;
    }

    /*************
     * Getters and Setters
     *
     * @return the stack count
     */
    public int getStackCount() {
        return stackCount;
    }

    /**
     * Sets stack count.
     *
     * @param stackCount the stack count
     */
    public void setStackCount(int stackCount) {
        this.stackCount = stackCount;
    }

    /**
     * Is stackable boolean.
     *
     * @return the boolean
     */
    public boolean isStackable() {
        return stackable;
    }

    /**
     * Sets stackable.
     *
     * @param stackable the stackable
     */
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
