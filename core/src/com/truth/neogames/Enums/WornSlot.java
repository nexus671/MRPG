package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Establishes the index values for WornGear arrays.
 */
public enum WornSlot {
    /**
     * Head worn slot.
     */
    HEAD(0), /**
     * Neck worn slot.
     */
    NECK(1), /**
     * Chest worn slot.
     */
    CHEST(2), /**
     * Mainhand worn slot.
     */
    MAINHAND(3), /**
     * Offhand worn slot.
     */
    OFFHAND(4),
    /**
     * Gloves worn slot.
     */
    GLOVES(5), /**
     * Ring worn slot.
     */
    RING(6), /**
     * Legs worn slot.
     */
    LEGS(7), /**
     * Feet worn slot.
     */
    FEET(8), /**
     * Ammo worn slot.
     */
    AMMO(9);

    private final int slot;
    private final String lowercase;

    /**
     * Instantiates a new Worn slot.
     *
     * @param slot the slot
     */
    WornSlot(int slot) {
        this.slot = slot;
        lowercase = StringManip.toLowercase(super.toString());
    }

    /**
     * Gets the WornSlot that corresponds to the specified slot number.
     *
     * @param slotNumber The slot number.
     * @return A WornSlot object of the correct type.
     */
    public static WornSlot getSlotTitle(int slotNumber) {
        switch (slotNumber) {
            case 0:
                return HEAD;
            case 1:
                return NECK;
            case 2:
                return CHEST;
            case 3:
                return MAINHAND;
            case 4:
                return OFFHAND;
            case 5:
                return GLOVES;
            case 6:
                return RING;
            case 7:
                return LEGS;
            case 8:
                return FEET;
            case 9:
                return AMMO;
            default:
                return null;
        }
    }

    /**
     * Gets slot number.
     *
     * @return The index value that corresponds to the worn slot.
     */
    public int getSlotNumber() {
        return slot;
    }

    @Override
    public String toString() {
        return "WornSlot{" +
                "slot=" + slot +
                ", lowercase='" + lowercase + '\'' +
                '}';
    }
}


