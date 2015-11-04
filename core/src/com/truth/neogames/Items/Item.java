package com.truth.neogames.Items;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Describes a generic item that can be held in the inventory.
 */
public class Item {
    protected String name;
    protected String description;
    protected boolean stackable;
    protected int stackCount;

    /************* Constructors *************/

    public Item() {
        name = "";
        description = "";
        stackable = false;
        stackCount = 1;
    }

    public Item(String name, String description, boolean stackable) {
        this.name = name;
        this.description = description;
        this.stackable = stackable;
    }

    /************* Getters *************/

    public String getName() {
        return name;
    }

    /*************
     * Getters
     *************/

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        else if (!(obj instanceof Item)) return false;
        Item i = (Item)obj;
        return i.getName().equalsIgnoreCase(name);
    }
}

