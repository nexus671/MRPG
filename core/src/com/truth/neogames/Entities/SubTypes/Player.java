package com.truth.neogames.Entities.SubTypes;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Entities.Entity;
import com.truth.neogames.Enums.Race;
import com.truth.neogames.HoldingSystems.Inventory;
import com.truth.neogames.HoldingSystems.WornGear;
import com.truth.neogames.Items.GearPackage.Gear;
import com.truth.neogames.Items.Item;
import com.truth.neogames.Professions.Profession;
import com.truth.neogames.StatsPackage.EntityStatsPackage.PlayerStatsPackage.PlayerStats;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a player.
 */
public class Player extends Entity {
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
        if(g.getStats().getLevel() > stats.getLevel()) {
            return false;
        } else {
            Gear old = wornGear.getGear()[slot];
            wornGear.getGear()[slot] = g;
            int index = inventory.getIndexOf(g);
            inventory.getInv()[index] = null;
            if (old != null) {
                inventory.add(old);
            }
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


