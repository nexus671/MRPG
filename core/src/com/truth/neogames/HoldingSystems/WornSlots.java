package com.truth.neogames.HoldingSystems;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Establishes the index values for WornGear arrays.
 */
public enum WornSlots {
    HEAD(0), NECK(1), CHEST(2), MAINHAND(3), OFFHAND(4), GLOVES(5), RING(6), LEGS(7), BOOTS(8);

    private int slot;

    WornSlots(int slot) {
        this.slot = slot;
    }
}
