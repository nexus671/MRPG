package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/26/2015.
 * Class Description: Types of wearable gear.
 */
public enum ArmorType { //TODO: Initialize modifier values for armor types
    /**
     * Helmet armor type.
     */
    HELMET(WornSlot.HEAD, true), /**
     * Sallet armor type.
     */
    SALLET(WornSlot.HEAD, true),
    /**
     * Hood armor type.
     */
    HOOD(WornSlot.HEAD, false), /**
     * Chestplate armor type.
     */
    CHESTPLATE(WornSlot.CHEST, true),
    /**
     * Chainmail armor type.
     */
    CHAINMAIL(WornSlot.CHEST, true), /**
     * Cuirass armor type.
     */
    CUIRASS(WornSlot.CHEST, true),
    /**
     * Robetop armor type.
     */
    ROBETOP(WornSlot.CHEST, false), /**
     * Gauntlets armor type.
     */
    GAUNTLETS(WornSlot.GLOVES, true),
    /**
     * Gloves armor type.
     */
    GLOVES(WornSlot.GLOVES, false), /**
     * Vambraces armor type.
     */
    VAMBRACES(WornSlot.GLOVES, true),
    /**
     * Greaves armor type.
     */
    GREAVES(WornSlot.LEGS, true), /**
     * Chausses armor type.
     */
    CHAUSSES(WornSlot.LEGS, true),
    /**
     * Robebottom armor type.
     */
    ROBEBOTTOM(WornSlot.LEGS, false), /**
     * Boots armor type.
     */
    BOOTS(WornSlot.FEET, false),
    /**
     * Sabatons armor type.
     */
    SABATONS(WornSlot.FEET, true), /**
     * Shield armor type.
     */
    SHIELD(WornSlot.OFFHAND, true);


    private final WornSlot slot;
    private final String lowercase;
    private final boolean metallic; //whether the wearable type is intended to be metallic or cloth
    private double pierceModifier;
    private double slashModifier;
    private double crushModifier;
    private double arcaneModifier;

    /**
     * Instantiates a new Armor type.
     *
     * @param slot     the slot
     * @param metallic the metallic
     */
    ArmorType(WornSlot slot, boolean metallic) {
        this.slot = slot;
        pierceModifier = 1.0;
        slashModifier = 1.0;
        crushModifier = 1.0;
        arcaneModifier = 1.0;
        this.metallic = metallic;
        lowercase = StringManip.toLowercase(super.toString());
    }

    /**
     * Instantiates a new Armor type.
     *
     * @param slot           the slot
     * @param pierceModifier the pierce modifier
     * @param slashModifier  the slash modifier
     * @param crushModifier  the crush modifier
     * @param arcaneModifier the arcane modifier
     * @param metallic       the metallic
     */
    ArmorType(WornSlot slot, double pierceModifier, double slashModifier, double crushModifier, double arcaneModifier, boolean metallic) {
        this.slot = slot;
        this.pierceModifier = pierceModifier;
        this.slashModifier = slashModifier;
        this.crushModifier = crushModifier;
        this.arcaneModifier = arcaneModifier;
        this.metallic = metallic;
        lowercase = StringManip.toLowercase(super.toString());
    }

    /**
     * Gets slot.
     *
     * @return the slot
     */
    public WornSlot getSlot() {
        return slot;
    }

    /**
     * Gets lowercase.
     *
     * @return the lowercase
     */
    public String getLowercase() {
        return lowercase;
    }

    /**
     * Gets pierce modifier.
     *
     * @return the pierce modifier
     */
    public double getPierceModifier() {
        return pierceModifier;
    }

    /**
     * Sets pierce modifier.
     *
     * @param pierceModifier the pierce modifier
     */
    public void setPierceModifier(double pierceModifier) {
        this.pierceModifier = pierceModifier;
    }

    /**
     * Gets slash modifier.
     *
     * @return the slash modifier
     */
    public double getSlashModifier() {
        return slashModifier;
    }

    /**
     * Sets slash modifier.
     *
     * @param slashModifier the slash modifier
     */
    public void setSlashModifier(double slashModifier) {
        this.slashModifier = slashModifier;
    }

    /**
     * Gets crush modifier.
     *
     * @return the crush modifier
     */
    public double getCrushModifier() {
        return crushModifier;
    }

    /**
     * Sets crush modifier.
     *
     * @param crushModifier the crush modifier
     */
    public void setCrushModifier(double crushModifier) {
        this.crushModifier = crushModifier;
    }

    /**
     * Gets arcane modifier.
     *
     * @return the arcane modifier
     */
    public double getArcaneModifier() {
        return arcaneModifier;
    }

    /**
     * Sets arcane modifier.
     *
     * @param arcaneModifier the arcane modifier
     */
    public void setArcaneModifier(double arcaneModifier) {
        this.arcaneModifier = arcaneModifier;
    }

    /**
     * Is metallic boolean.
     *
     * @return the boolean
     */
    public boolean isMetallic() {
        return metallic;
    }

    @Override
    public String toString() {
        return "ArmorType{" +
                "slot=" + slot +
                ", lowercase='" + lowercase + '\'' +
                ", pierceModifier=" + pierceModifier +
                ", slashModifier=" + slashModifier +
                ", crushModifier=" + crushModifier +
                ", arcaneModifier=" + arcaneModifier +
                ", metallic=" + metallic +
                '}';
    }
}
