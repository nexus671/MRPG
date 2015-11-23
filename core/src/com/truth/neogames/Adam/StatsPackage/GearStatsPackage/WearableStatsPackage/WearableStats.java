package com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WearableStatsPackage;

import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.GearStats;
import com.truth.neogames.Enums.Affixes.WearableSuffix;
import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Stats for wearable gear.
 */
public class WearableStats extends GearStats {
    private WearableStat stabDef;
    private WearableStat slashDef;
    private WearableStat crushDef;
    private WearableStat arcaneDef;
    private WearableSuffix suffix;

    public WearableStats(WearableStat stabDef, WearableStat slashDef, WearableStat crushDef, WearableStat arcaneDef, WearableSuffix suffix) {
        this.stabDef = stabDef;
        this.slashDef = slashDef;
        this.crushDef = crushDef;
        this.arcaneDef = arcaneDef;
        this.suffix = suffix;
    }

    public WearableStat getStabDef() {
        return stabDef;
    }

    public void setStabDef(WearableStat stabDef) {
        this.stabDef = stabDef;
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
