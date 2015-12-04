package com.truth.neogames.Enums;

/**
 * Created by Adam on 11/26/2015.
 * Class Description: Types of wearable gear.
 */
public enum ArmorType {
    HELMET(WornSlot.HEAD, "Helmet", true), SALLET(WornSlot.HEAD, "Sallet", true),
    HOOD(WornSlot.HEAD, "Hood", false);


    private WornSlot slot;
    private String lowercase;
    private double pierceModifier;
    private double slashModifier;
    private double crushModifier;
    private double arcaneModifier;
    private boolean metallic; //whether the wearable type is intended to be metallic or cloth

    ArmorType(WornSlot slot, String lowercase, boolean metallic) {
        this.slot = slot;
        this.lowercase = lowercase;
        pierceModifier = 1;
        slashModifier = 1;
        crushModifier = 1;
        arcaneModifier = 1;
        this.metallic = metallic;
    }

    ArmorType(WornSlot slot, String lowercase, double pierceModifier, double slashModifier, double crushModifier, double arcaneModifier, boolean metallic) {
        this.slot = slot;
        this.lowercase = lowercase;
        this.pierceModifier = pierceModifier;
        this.slashModifier = slashModifier;
        this.crushModifier = crushModifier;
        this.arcaneModifier = arcaneModifier;
        this.metallic = metallic;
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
}
