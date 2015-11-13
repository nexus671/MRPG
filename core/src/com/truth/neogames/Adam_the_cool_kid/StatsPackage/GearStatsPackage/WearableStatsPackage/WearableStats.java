package com.truth.neogames.Adam_the_cool_kid.StatsPackage.GearStatsPackage.WearableStatsPackage;

import com.truth.neogames.Enums.Affixes.WearablePrefixName;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Stats for wearable gear.
 */
public class WearableStats extends com.truth.neogames.Adam_the_cool_kid.StatsPackage.GearStatsPackage.GearStats {
    private WearableStat stabDef;
    private WearableStat slashDef;
    private WearableStat crushDef;
    private WearableStat arcaneDef;
    private WearableStat dexBonus;
    private WearablePrefixName prefix;

    public WearableStats(WearableStat stabDef, WearableStat slashDef, WearableStat crushDef, WearableStat arcaneDef, WearableStat dexBonus, WearablePrefixName prefix) {
        this.stabDef = stabDef;
        this.slashDef = slashDef;
        this.crushDef = crushDef;
        this.arcaneDef = arcaneDef;
        this.dexBonus = dexBonus;
        this.prefix = prefix;
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

    public WearableStat getDexBonus() {
        return dexBonus;
    }

    public void setDexBonus(WearableStat dexBonus) {
        this.dexBonus = dexBonus;
    }


}
