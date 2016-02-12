package com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Adam.HoldingSystems.Inventory;
import com.truth.neogames.Adam.HoldingSystems.WornGear;
import com.truth.neogames.Adam.Items.Consumables.SubTypes.Food;
import com.truth.neogames.Adam.Items.Consumables.SubTypes.Potion;
import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Jewelry;
import com.truth.neogames.Adam.Items.Item;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.PlayerStatsPackage.PlayerStats;
import com.truth.neogames.Ahmane_the_scrub.Entities.Entity;
import com.truth.neogames.Ahmane_the_scrub.Professions.Profession;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.Race;
import com.truth.neogames.Enums.WornSlot;

import java.util.HashSet;
import java.util.Random;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a player.
 */
public class Player extends Entity {
    Random random = new Random();
    private Profession profession;
    private WornGear wornGear;
    private Inventory inventory;
    private PlayerStats stats;

    /************* Constructors *************/

    public Player(String name, Race race, String sex, Profession profession, Sprite sprite) {
        this.setName(name);
        this.setRace(race);
        this.setSex(sex);
        this.profession = profession;
        stats = new PlayerStats(0);
        this.inventory = new Inventory();
        this.wornGear = new WornGear();
        stats = new PlayerStats();
    }

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
        if(g.getLevel() > stats.getLevel()) {
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

    public double getBasicAttackDamage() {
        Weapon weapon = null;
        double basicDamage = 1;
        boolean hasWeapon = !wornGear.slotIsEmpty(WornSlot.MAINHAND);
        if (hasWeapon) {
            weapon = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
            basicDamage = weapon.getMinDamage() + (weapon.getMaxDamage() - weapon.getMinDamage()) * random.nextDouble();
        }
        basicDamage += (stats.getStrength().getCurrent() / 100) * basicDamage;
        if (hasWeapon) {
            double critRoll = random.nextDouble();
            if (critRoll < weapon.getCritChance()) {
                basicDamage *= 2;
            }
        }
        return basicDamage;
    }

    /************* Getters *************/

    public PlayerStats getStats() {
        return this.stats;
    }

    /**************
     * Setters
     *************/

    public void setStats(PlayerStats stats) {
        this.stats = stats;
    }

    public Profession getProfession() {
        return this.profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public WornGear getWornGear() {
        return this.wornGear;
    }

    public void setWornGear(WornGear wornGear) {
        this.wornGear = wornGear;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


}


