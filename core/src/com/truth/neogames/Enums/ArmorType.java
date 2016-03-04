package com.truth.neogames.Enums;

import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/26/2015.
 * Class Description: Types of wearable gear.
 */
public enum ArmorType { //TODO: Initialize modifier values for armor types
    HELMET(WornSlot.HEAD, true), SALLET(WornSlot.HEAD, true),
    HOOD(WornSlot.HEAD, false), CHESTPLATE(WornSlot.CHEST, true),
    CHAINMAIL(WornSlot.CHEST, true), CUIRASS(WornSlot.CHEST, true),
    ROBETOP(WornSlot.CHEST, false), GAUNTLETS(WornSlot.GLOVES, true),
    GLOVES(WornSlot.GLOVES, false), VAMBRACES(WornSlot.GLOVES, true),
    GREAVES(WornSlot.LEGS, true), CHAUSSES(WornSlot.LEGS, true),
    ROBEBOTTOM(WornSlot.LEGS, false), BOOTS(WornSlot.FEET, false),
    SABATONS(WornSlot.FEET, true), SHIELD(WornSlot.OFFHAND, true);


    private final WornSlot slot;
    private final String lowercase;
    private final boolean metallic; //whether the wearable type is intended to be metallic or cloth
    private double pierceModifier;
    private double slashModifier;
    private double crushModifier;
    private double arcaneModifier;

    ArmorType(WornSlot slot, boolean metallic) {
        this.slot = slot;
        pierceModifier = 1.0;
        slashModifier = 1.0;
        crushModifier = 1.0;
        arcaneModifier = 1.0;
        this.metallic = metallic;
        lowercase = StringManip.toLowercase(super.toString());
    }

    ArmorType(WornSlot slot, double pierceModifier, double slashModifier, double crushModifier, double arcaneModifier, boolean metallic) {
        this.slot = slot;
        this.pierceModifier = pierceModifier;
        this.slashModifier = slashModifier;
        this.crushModifier = crushModifier;
        this.arcaneModifier = arcaneModifier;
        this.metallic = metallic;
        lowercase = StringManip.toLowercase(super.toString());
    }

    public WornSlot getSlot() {
        return slot;
    }

    public String getLowercase() {
        return lowercase;
    }

    public double getPierceModifier() {
        return pierceModifier;
    }

    public void setPierceModifier(double pierceModifier) {
        this.pierceModifier = pierceModifier;
    }

    public double getSlashModifier() {
        return slashModifier;
    }

    public void setSlashModifier(double slashModifier) {
        this.slashModifier = slashModifier;
    }

    public double getCrushModifier() {
        return crushModifier;
    }

    public void setCrushModifier(double crushModifier) {
        this.crushModifier = crushModifier;
    }

    public double getArcaneModifier() {
        return arcaneModifier;
    }

    public void setArcaneModifier(double arcaneModifier) {
        this.arcaneModifier = arcaneModifier;
    }

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
