package com.truth.neogames.Items;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class Item {
    private final String name;
    private final String description;
    private final boolean stackable;



    public Item(String name, String description, boolean stackable) {
        this.name = name;
        this.description = description;
        this.stackable = stackable;
    }
}
