package com.truth.neogames.StatsPackage.GearStatsPackage.WearableStatsPackage;

import com.truth.neogames.Enums.PrefixName;
import com.truth.neogames.StatsPackage.GearStatsPackage.GearStats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class WearableStats extends GearStats {
    private WearableStat stabDef;
    private WearableStat slashDef;
    private WearableStat crushDef;
    private WearableStat arcaneDef;
    private WearableStat dexBonus;
    private PrefixName prefix;

    public WearableStats(WearableStat stabDef, WearableStat slashDef, WearableStat crushDef, WearableStat arcaneDef, WearableStat dexBonus) {
        this.stabDef = stabDef;
        this.slashDef = slashDef;
        this.crushDef = crushDef;
        this.arcaneDef = arcaneDef;
        this.dexBonus = dexBonus;
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
