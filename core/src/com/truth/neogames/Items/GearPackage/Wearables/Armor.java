package com.truth.neogames.Items.GearPackage.Wearables;

import com.truth.neogames.Effects.Buff;
import com.truth.neogames.Enums.Affixes.ArmorSuffix;
import com.truth.neogames.Enums.Affixes.Material;
import com.truth.neogames.Enums.ArmorType;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.WornSlot;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Worn armor or robes.
 */
public class Armor extends com.truth.neogames.Items.GearPackage.CombatGear {
    private com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat pierceDef;
    private com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat slashDef;
    private com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat crushDef;
    private com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat arcaneDef;
    private ArmorSuffix suffix;
    private ArmorType type;

    public Armor(WornSlot slot, Material material, ArmorSuffix suffix, ArmorType type) {
        this.slot = slot;
        this.material = material;
        this.suffix = suffix;
        this.type = type;
        pierceDef = new com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat("Piercing Defense", material.getAvgDefense() * type.getPierceModifier());
        slashDef = new com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat("Slashing Defense", material.getAvgDefense() * type.getSlashModifier());
        crushDef = new com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat("Crushing Defense", material.getAvgDefense() * type.getCrushModifier());
        arcaneDef = new com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat("Arcane Defense", material.getAvgDefense() * type.getArcaneModifier());
        level = material.getLevel();
        assignName();
        assignDescription();
        setLevel(material.getLevel());
    }

    public com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat getPierceDef() {
        return pierceDef;
    }

    public void setPierceDef(com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat pierceDef) {
        this.pierceDef = pierceDef;
    }

    public com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat getSlashDef() {
        return slashDef;
    }

    public void setSlashDef(com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat slashDef) {
        this.slashDef = slashDef;
    }

    public com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat getCrushDef() {
        return crushDef;
    }

    public void setCrushDef(com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat crushDef) {
        this.crushDef = crushDef;
    }

    public com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat getArcaneDef() {
        return arcaneDef;
    }

    public void setArcaneDef(com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat arcaneDef) {
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

    public ArmorType getType() {
        return type;
    }

    public void setType(ArmorType type) {
        this.type = type;

    }

    public void assignName() {
        name = material + " " + type;
        if (suffix != ArmorSuffix.NONE) {
            name += " of " + suffix;
        }
    }

    @Override
    public void assignDescription() {
        super.assignDescription();
        description += "Worn Slot: " + slot + '\n';
        description += "Pierce Defense: " + pierceDef + '\n';
        description += "Slash Defense: " + slashDef + '\n';
        description += "Crush Defense: " + crushDef + '\n';
        description += "Arcane Defense: " + arcaneDef + '\n';
        if (suffix != ArmorSuffix.NONE) {
            description += "Suffix Effect: " + ArmorSuffix.getDescription(suffix) + '\n';
        }
        if (!bonuses.isEmpty()) {
            for (Buff b : bonuses) {
                description += b.getDescription() + '\n';
            }
        }
    }

    @Override
    public String toString() {
        return "Armor{" +
                "pierceDef=" + pierceDef +
                ", slashDef=" + slashDef +
                ", crushDef=" + crushDef +
                ", arcaneDef=" + arcaneDef +
                ", suffix=" + suffix +
                ", type=" + type +
                '}';
    }
}