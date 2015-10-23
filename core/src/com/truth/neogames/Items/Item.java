package com.truth.neogames.Items;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class Item {
    private String name = "";
    private String description;
    private boolean stackable;


    public Item() {

    }

    public Item(String name, String description, boolean stackable) {
        this.name = name;
        this.description = description;
        this.stackable = stackable;
    }

}
