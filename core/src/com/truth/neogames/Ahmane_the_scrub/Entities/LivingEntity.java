package com.truth.neogames.Ahmane_the_scrub.Entities;


import com.truth.neogames.Adam.HoldingSystems.Inventory;
import com.truth.neogames.Adam.HoldingSystems.WornGear;
import com.truth.neogames.Adam.Items.Consumables.SubTypes.Food;
import com.truth.neogames.Adam.Items.Consumables.SubTypes.Potion;
import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Jewelry;
import com.truth.neogames.Adam.Items.Item;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.Ahmane_the_scrub.Professions.Profession;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.WornSlot;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines any entity in the game, including player, monster, or NPC.
 */
public class LivingEntity extends Entity {
    protected Profession profession;
    protected WornGear wornGear;
    protected Inventory inventory;
    Random random = new Random();
    /************* Specific Methods *************/

    /**
     * Equips a gear object into the player's worn gear. Removes that item from
     * the player's inventory and places any item that was in that slot
     * the player's worn gear into the inventory.
     *
     * @param g The gear to be equipped.
     * @return False if the level requirement is too high, otherwise true.
     */
    public boolean equip(Gear g) {
        int slot = g.getSlot().getSlotNumber();
        if (g.getLevel() > stats.getLevel()) {
            return false;
        } else {
            Gear old = wornGear.getGear()[slot];
            wornGear.getGear()[slot] = g;
            int index = inventory.getIndexOf(g);
            if (index != -1)
                inventory.getInv()[index] = null;
            if (old != null) {
                inventory.add(old);
            }
            return true;
        }
    }

    public boolean equip(Jewelry j) {
        if (j.getLevel() > stats.getLevel()) {
            return false;
        } else {
            Gear old = wornGear.getGear()[WornSlot.NECK.getSlotNumber()];
            wornGear.getGear()[WornSlot.NECK.getSlotNumber()] = j;
            EntityStatName statAffected = j.getStatAffected();
            double newValue = (1 + j.getAmount()) * stats.getStat(statAffected).getBaseMax();
            stats.setStat(statAffected, newValue);
            stats.getStat(statAffected).setCurrent(stats.getStat(statAffected).getCurrent() + j.getAmount() * stats.getStat(statAffected).getBaseMax());
            return true;
        }
    }

    /**
     * Picks up an item off the ground, and adds it to the inventory.
     *
     * @param i The item to be picked up.
     * @return False if the item could not be added, otherwise true.
     */
    public boolean pickUp(Item i) {
        return inventory.add(i);
    }

    /**
     * Player consumes a food object, healing the player for the amount specified
     * by the food object. Does not heal over maximum health.
     *
     * @param f The food object that is consumed.
     */
    public void consume(Food f) {
        EntityStat health = stats.getHealth();
        if (health.getCurrent() + f.getHealAmount() > health.getMax()) {
            health.setCurrent(health.getMax());
        } else {
            health.setCurrent(health.getCurrent() + f.getHealAmount());
        }
        int index = inventory.getIndexOf(f);
        if (index != -1) {
            if (inventory.getInv()[index].getStackCount() > 1)
                inventory.getInv()[index].setStackCount(inventory.getInv()[index].getStackCount() - 1);
            else
                inventory.getInv()[index] = null;
        }
    }

    /**
     * Boosts all the stats specified by the potion.
     *
     * @param p The potion to be consumed.
     */
    public void consume(Potion p) {
        HashSet<EntityStat> stats = p.getStats();
        for (EntityStat stat : stats) {
            EntityStatName name = stat.getName();
            double percentValue = (1 + p.getPercentAmount()) * this.stats.getStat(name).getMax();
            this.stats.setStat(name, percentValue);
            this.stats.setStat(name, this.stats.getStat(name).getMax() + p.getFlatAmount());
        }
        int index = inventory.getIndexOf(p);
        if (index != -1) {
            if (inventory.getInv()[index].getStackCount() > 1)
                inventory.getInv()[index].setStackCount(inventory.getInv()[index].getStackCount() - 1);
            else
                inventory.getInv()[index] = null;
        }
    }

    /*************
     * Combat Values
     *************/

    /**
     * Gets the damage of a basic attack, accounting for weapon damage and the user's strength level.
     * Note: Crit chance is not accounted for in this calculation. It should be applied after the
     * basic attack value is generated.
     *
     * @return The damage value.
     */
    public double getBasicAttackDamage() {
        Weapon weapon;
        double basicDamage = 1;
        boolean hasWeapon = !wornGear.slotIsEmpty(WornSlot.MAINHAND);
        if (hasWeapon) {
            weapon = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
            basicDamage = weapon.getMinDamage() + (weapon.getMaxDamage() - weapon.getMinDamage()) * random.nextDouble();
        }
        basicDamage += (stats.getStrength().getCurrent() / 100) * basicDamage;
        return basicDamage;
    }

    /**
     * Gets the value for the bonus from an elemental affix.
     *
     * @param forWeapon Indicates whether the method looks at the weapon's elemental stats,
     *                  or the armor's elemental stats.
     * @return A value for the strength of the elemental buff, dependent on the type of buff.
     */ //TODO Finish this method
    public double getElementalValue(boolean forWeapon) {
        double elementalValue;
        if (forWeapon) {
            Weapon weapon = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
            int level = weapon.getLevel();
            ElementalType type = weapon.getElementalType();
            switch (type) {
                case NONE:
                    elementalValue = 0;
                    break;
                case LIGHT:
                    elementalValue = 0;
                    break;
                case DARK:
                    elementalValue = ((double) level / Gear.getMAXLEVEL());
                    break;
                default:
                    elementalValue = 0;
            }
        } else {
            elementalValue = 0;
        }
        return elementalValue;
    }
}
