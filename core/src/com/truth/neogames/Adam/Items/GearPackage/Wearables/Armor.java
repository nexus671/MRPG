package com.truth.neogames.Adam.Items.GearPackage.Wearables;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.ArmorStat;
import com.truth.neogames.Enums.Affixes.ArmorSuffix;
import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Worn armor or robes.
 */
public class Armor extends Gear {
    private ArmorStat pierceDef;
    private ArmorStat slashDef;
    private ArmorStat crushDef;
    private ArmorStat arcaneDef;
    private ArmorSuffix suffix;

    public Armor(double pierceDef, double slashDef, double crushDef, double arcaneDef, ArmorSuffix suffix) {
        this.pierceDef = new ArmorStat("Piercing Defense", pierceDef);
        this.slashDef = new ArmorStat("Slashing Defense", slashDef);
        this.crushDef = new ArmorStat("Crushing Defense", crushDef);
        this.arcaneDef = new ArmorStat("Arcane Defense", arcaneDef);
        this.suffix = suffix;
    }

    public ArmorStat getPierceDef() {
        return pierceDef;
    }

    public void setPierceDef(ArmorStat pierceDef) {
        this.pierceDef = pierceDef;
    }

    public ArmorStat getSlashDef() {
        return slashDef;
    }

    public void setSlashDef(ArmorStat slashDef) {
        this.slashDef = slashDef;
    }

    public ArmorStat getCrushDef() {
        return crushDef;
    }

    public void setCrushDef(ArmorStat crushDef) {
        this.crushDef = crushDef;
    }

    public ArmorStat getArcaneDef() {
        return arcaneDef;
    }

    public void setArcaneDef(ArmorStat arcaneDef) {
        this.arcaneDef = arcaneDef;
    }

    public ArmorSuffix getSuffix() {
        return suffix;
    }

    public void setSuffix(ArmorSuffix suffix) {
        this.suffix = suffix;
    }

    public ElementalType getElementalType() {
        return suffix.getElementalType();
    }
}
