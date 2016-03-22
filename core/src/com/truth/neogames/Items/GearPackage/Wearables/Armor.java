package com.truth.neogames.Items.GearPackage.Wearables;

import com.truth.neogames.Effects.Buff;
import com.truth.neogames.Enums.Affixes.ArmorSuffix;
import com.truth.neogames.Enums.Affixes.Material;
import com.truth.neogames.Enums.ArmorType;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Items.GearPackage.CombatGear;
import com.truth.neogames.StatsPackage.GearStatsPackage.ArmorStat;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Worn armor or robes.
 */
public class Armor extends CombatGear {
    private ArmorStat pierceDef;
    private ArmorStat slashDef;
    private ArmorStat crushDef;
    private ArmorStat arcaneDef;
    private ArmorSuffix suffix;
    private ArmorType type;

    /**
     * Instantiates a new Armor.
     *
     * @param slot     the slot
     * @param material the material
     * @param suffix   the suffix
     * @param type     the type
     */
    public Armor(WornSlot slot, Material material, ArmorSuffix suffix, ArmorType type) {
        this.slot = slot;
        this.material = material;
        this.suffix = suffix;
        this.type = type;
        pierceDef = new ArmorStat("Piercing Defense", material.getAvgDefense() * type.getPierceModifier());
        slashDef = new ArmorStat("Slashing Defense", material.getAvgDefense() * type.getSlashModifier());
        crushDef = new ArmorStat("Crushing Defense", material.getAvgDefense() * type.getCrushModifier());
        arcaneDef = new ArmorStat("Arcane Defense", material.getAvgDefense() * type.getArcaneModifier());
        level = material.getLevel();
        assignName();
        assignDescription();
        setLevel(material.getLevel());
    }

    /**
     * Gets pierce def.
     *
     * @return the pierce def
     */
    public ArmorStat getPierceDef() {
        return pierceDef;
    }

    /**
     * Sets pierce def.
     *
     * @param pierceDef the pierce def
     */
    public void setPierceDef(ArmorStat pierceDef) {
        this.pierceDef = pierceDef;
    }

    /**
     * Gets slash def.
     *
     * @return the slash def
     */
    public ArmorStat getSlashDef() {
        return slashDef;
    }

    /**
     * Sets slash def.
     *
     * @param slashDef the slash def
     */
    public void setSlashDef(ArmorStat slashDef) {
        this.slashDef = slashDef;
    }

    /**
     * Gets crush def.
     *
     * @return the crush def
     */
    public ArmorStat getCrushDef() {
        return crushDef;
    }

    /**
     * Sets crush def.
     *
     * @param crushDef the crush def
     */
    public void setCrushDef(ArmorStat crushDef) {
        this.crushDef = crushDef;
    }

    /**
     * Gets arcane def.
     *
     * @return the arcane def
     */
    public ArmorStat getArcaneDef() {
        return arcaneDef;
    }

    /**
     * Sets arcane def.
     *
     * @param arcaneDef the arcane def
     */
    public void setArcaneDef(ArmorStat arcaneDef) {
        this.arcaneDef = arcaneDef;
    }

    /**
     * Gets suffix.
     *
     * @return the suffix
     */
    public ArmorSuffix getSuffix() {
        return suffix;
    }

    /**
     * Sets suffix.
     *
     * @param suffix the suffix
     */
    public void setSuffix(ArmorSuffix suffix) {
        this.suffix = suffix;
    }

    /**
     * Gets elemental type.
     *
     * @return the elemental type
     */
    public ElementalType getElementalType() {
        return suffix.getElementalType();
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public ArmorType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(ArmorType type) {
        this.type = type;

    }

    /**
     * Assign name.
     */
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
