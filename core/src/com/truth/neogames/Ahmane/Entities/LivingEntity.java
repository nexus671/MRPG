package com.truth.neogames.Ahmane.Entities;


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
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;
import com.truth.neogames.Ahmane.Effects.Buff;
import com.truth.neogames.Ahmane.Professions.Profession;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.Race;
import com.truth.neogames.Enums.WornSlot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines any entity in the game, including player, monster, or NPC.
 */
public abstract class LivingEntity extends Entity {
    protected Profession profession;
    protected WornGear wornGear;
    protected Inventory inventory;
    protected EntityStats stats;
    Random random = new Random();

    public LivingEntity(String name, Race race, String sex, Sprite sprite, String description, int xPos, int yPos, Profession profession, EntityStats entityStats, Inventory inventory, WornGear wornGear) {
        this.profession = profession;
        this.stats = entityStats;
        this.inventory = inventory;
        this.wornGear = wornGear;
    }

    /*************
     * Constructors
     *************/


    public LivingEntity() {
    }

    /************* Specific Methods *************/

    /**
     * Equips the specified gear object into the correct slot in the worn gear,
     * if the entity has the proper level.
     *
     * @param g The gear object to be equipped.
     * @return True if the item was equipped successfully
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
            ArrayList<EntityStatName> statsAffected = j.getStatsAffected();
            Jewelry old;
            if (j.getSlot() == WornSlot.NECK) {
                old = (Jewelry) wornGear.getGear()[WornSlot.NECK.getSlotNumber()];
                wornGear.getGear()[WornSlot.NECK.getSlotNumber()] = j;
            } else {
                old = (Jewelry) wornGear.getGear()[WornSlot.RING.getSlotNumber()];
                wornGear.getGear()[WornSlot.RING.getSlotNumber()] = j;
            }
            if (old != null)
                inventory.add(old);
            for (EntityStatName name : statsAffected) {
                stats.getStat(name).addBonus(buff);
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

            Buff buff = new Buff(-1, p.getPercentAmount(), p.getFlatAmount(), stat, false);
            stat.addBonus(buff);

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
        double elementalValue = 0;
        if (forWeapon) {
            Weapon weapon = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
            int level = weapon.getLevel();
            double levelRatio = (double) level / Gear.getMAXLEVEL();
            ElementalType type = weapon.getElementalType();
            switch (type) {
                case NONE:
                    elementalValue = 0;
                    break;
                case LIGHT:
                    elementalValue = levelRatio / 5;
                    break;
                case DARK:
                    elementalValue = levelRatio / 3;
                    break;
                case FIRE:
                    elementalValue = levelRatio / 20;
                case FROST:
                    elementalValue = levelRatio / 2;
            }
        } else {
            int lightCounter, darkCounter, fireCounter, frostCounter;
            lightCounter = darkCounter = fireCounter = frostCounter = 0;
            Gear[] gear = wornGear.getGear();

        }
        return elementalValue;
    }

    /************* Getters *************/

    public EntityStats getStats() {
        return stats;
    }

    /**************
     * Setters
     *************/

    public void setStats(EntityStats stats) {
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


    public boolean move(com.truth.neogames.Ahmane.EnvironmentPackage.BattleGrid grid, int x, int y) {
        if (grid.isSpaceEmpty(x, y)) {
            grid.moveEntity(this, x, y);
            return true;
        }
        return false;
    }

    public boolean moveLeft(com.truth.neogames.Ahmane.EnvironmentPackage.BattleGrid grid) {
        if (grid.isSpaceEmpty(xPos - 1, yPos)) {
            grid.shiftEntity(this, -1, 0);
            return true;
        }
        return false;
    }

    public boolean moveRight(com.truth.neogames.Ahmane.EnvironmentPackage.BattleGrid grid) {
        if (grid.isSpaceEmpty(xPos + 1, yPos)) {
            grid.shiftEntity(this, 1, 0);
            return true;
        }
        return false;
    }

    public boolean moveForward(com.truth.neogames.Ahmane.EnvironmentPackage.BattleGrid grid) {
        if (grid.isSpaceEmpty(xPos, yPos + 1)) {
            grid.shiftEntity(this, 0, 1);
            return true;
        }
        return false;
    }

    public boolean moveBackward(com.truth.neogames.Ahmane.EnvironmentPackage.BattleGrid grid) {
        if (grid.isSpaceEmpty(xPos, yPos - 1)) {
            grid.shiftEntity(this, 0, -1);
            return true;
        }
        return false;
    }


    /*************
     * Getters
     *************/

    public String getName() {
        return this.name;
    }

    /**************
     * Setters
     *************/

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return this.race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getxPos() {
        return this.xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return this.yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setPos(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Sprite getSprite() {
        return this.sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }


    @Override
    public String toString() {
        return this.name;
    }
}
