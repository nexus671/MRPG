package com.truth.neogames.Enums;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Establishes the index values for WornGear arrays.
 */
public enum WornSlot {
    HEAD(0), NECK(1), CHEST(2), MAINHAND(3), OFFHAND(4), GLOVES(5), RING(6), LEGS(7), BOOTS(8), AMMO(9);

    private final int slot;

    WornSlot(int slot) {
        this.slot = slot;
    }

    /**
     * Gets the WornSlot that corresponds to the specified slot number.
     * @param slotNumber The slot number.
     * @return A WornSlot object of the correct type.
     */
    public static WornSlot getSlotTitle(int slotNumber) {
        switch(slotNumber) {
            case 0: return HEAD;
            case 1: return NECK;
            case 2: return CHEST;
            case 3: return MAINHAND;
            case 4: return OFFHAND;
            case 5: return GLOVES;
            case 6: return RING;
            case 7: return LEGS;
            case 8: return BOOTS;
            case 9: return AMMO;
            default: return null;
        }
    }

    /**
     * @return The index value that corresponds to the worn slot.
     */
    public int getSlotNumber() {
        return slot;
    }
}


