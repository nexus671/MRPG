package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WearableStatsPackage;

import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.GearStats;
import com.truth.neogames.Enums.Affixes.WearableSuffix;
import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Stats for wearable gear.
 */
public class WearableStats extends GearStats {
    private WearableStat pierceDef;
    private WearableStat slashDef;
    private WearableStat crushDef;
    private WearableStat arcaneDef;
    private WearableSuffix suffix;

    public WearableStats(double pierceDef, double slashDef, double crushDef, double arcaneDef, WearableSuffix suffix) {
        this.pierceDef = new WearableStat("Piercing Defense", pierceDef);
        this.slashDef = new WearableStat("Slashing Defense", slashDef);
        this.crushDef = new WearableStat("Crushing Defense", crushDef);
        this.arcaneDef = new WearableStat("Arcane Defense", arcaneDef);
        this.suffix = suffix;
    }

    public WearableStat getPierceDef() {
        return pierceDef;
    }

    public void setPierceDef(WearableStat pierceDef) {
        this.pierceDef = pierceDef;
    }

    public WearableStat getSlashDef() {
        return slashDef;
    }

    public void setSlashDef(WearableStat slashDef) {
        this.slashDef = slashDef;
    }

    public WearableStat getCrushDef() {
        return crushDef;
    }

    public void setCrushDef(WearableStat crushDef) {
        this.crushDef = crushDef;
    }

    public WearableStat getArcaneDef() {
        return arcaneDef;
    }

    public void setArcaneDef(WearableStat arcaneDef) {
        this.arcaneDef = arcaneDef;
    }

    public WearableSuffix getSuffix() {
        return suffix;
    }

    public void setSuffix(WearableSuffix suffix) {
        this.suffix = suffix;
    }

    public ElementalType getElementalType() {
        return suffix.getElementalType();
    }
}
