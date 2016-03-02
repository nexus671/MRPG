package com.truth.neogames.Ahmane.Entities;


import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Adam.HoldingSystems.Inventory;
import com.truth.neogames.Adam.HoldingSystems.WornGear;
import com.truth.neogames.Adam.Items.Consumables.SubTypes.Food;
import com.truth.neogames.Adam.Items.Consumables.SubTypes.Potion;
import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Armor;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Jewelry;
import com.truth.neogames.Adam.Items.Item;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;
import com.truth.neogames.Ahmane.Abilities.ActiveAbility;
import com.truth.neogames.Ahmane.Effects.Buff;
import com.truth.neogames.Ahmane.Effects.Damage;
import com.truth.neogames.Ahmane.Professions.Profession;
import com.truth.neogames.Enums.AbilityType;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.RaceName;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Utilities.RandomNumber;

import java.util.ArrayList;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines any entity in the game, including player, monster, or NPC.
 */
public abstract class LivingEntity extends Entity {
    private static final int MAX_LEVEL = 21;
    protected Profession profession;
    protected WornGear wornGear;
    protected Inventory inventory;
    protected EntityStats stats;

    public LivingEntity(String name, RaceName raceName, String sex, Sprite sprite, String description, int xPos, int yPos,
                        Profession profession, EntityStats entityStats, Inventory inventory, WornGear wornGear) {
        this.profession = profession;
        this.stats = entityStats;
        this.inventory = inventory;
        this.wornGear = wornGear;
    }

    public LivingEntity() {
    }

    public static int getMaxLevel() {
        return MAX_LEVEL;
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

    /**
     * Equips a weapon, checking for errors (level is too high, or inventory is full and both
     * weapon slots are full.
     *
     * @param w The weapon to be equipped.
     * @return True if the weapon was successfully equipped, false if it was not.
     */
    public boolean equip(Weapon w) {
        boolean twoHanded = w.getType().isTwoHanded();
        int index = inventory.getIndexOf(w);
        if (index != -1)
            inventory.getInv()[index] = null;
        WornSlot destination = WornSlot.MAINHAND;
        if (w.getLevel() > stats.getLevel()) {
            return false;
        } else if (twoHanded) {
            if (inventory.isFull() && !wornGear.slotIsEmpty(WornSlot.MAINHAND) && !wornGear.slotIsEmpty(WornSlot.OFFHAND))
                return false;
            else {
                Weapon oldMH = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
                Weapon oldOH = (Weapon) wornGear.getFromSlot(WornSlot.OFFHAND);
                if (oldMH != null)
                    inventory.add(oldMH);
                if (oldOH != null)
                    inventory.add(oldOH);
                wornGear.getGear()[destination.getSlotNumber()] = w;
            }
        } else {
            if (!wornGear.slotIsEmpty(WornSlot.MAINHAND) && !wornGear.slotIsEmpty(WornSlot.OFFHAND)) {
                Weapon old = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
                if (old != null)
                    inventory.add(old);
            } else if (!wornGear.slotIsEmpty(WornSlot.MAINHAND)) {
                destination = WornSlot.OFFHAND;
            }
            wornGear.getGear()[destination.getSlotNumber()] = w;
        }
        return true;
    }

    public void printAblities() {
        for (ActiveAbility a : profession.getUnlockedActiveAbilities()) {
            if (!(a.getType() == AbilityType.PASSIVE))
                System.out.println(a.getName());
        }

    }


    public void receiveDamage(Damage d) {
        stats.getHealth();
        d.getDamage();
        stats.getHealth().setCurrent(stats.getHealth().getCurrent() - d.getDamage());
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
                stats.getStat(name).addListOfBonuses(j.getBonusesStat(name));
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
        ArrayList<EntityStat> stats = p.getStats();
        for (EntityStat stat : stats) {
            EntityStatName name = stat.getStatName();
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
            basicDamage = weapon.getMinDamage() + (weapon.getMaxDamage() - weapon.getMinDamage()) * RandomNumber.random.nextDouble();
        }
        basicDamage += (stats.getStrength().getCurrent() / 100) * basicDamage;
        return basicDamage;
    }

    /**
     * Gets the value for the bonus from the elemental affix of the weapon.
     *
     * @return A value for the strength of the elemental buff, dependent on the type of buff.
     */
    public double getWeaponElementalValue() {
        double elementalValue = 0;
            Weapon weapon = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
            int level = weapon.getLevel();
            double levelRatio = (double) level / Gear.getMAXLEVEL();
            ElementalType type = weapon.getElementalType();
            switch (type) {
                case NONE:
                    elementalValue = 0;
                    break;
                case LIGHT:
                    elementalValue = levelRatio * ElementalType.getLightScaling();
                    break;
                case DARK:
                    elementalValue = levelRatio * ElementalType.getDarkScaling();
                    break;
                case FIRE:
                    elementalValue = levelRatio * ElementalType.getFireScaling();
                    break;
                case FROST:
                    elementalValue = levelRatio * ElementalType.getFrostScaling();
            }
        return elementalValue;
    }

    /**
     * Gets an array of doubles that represents the elemental values for each elemental type.
     * The array returns the values in the following order: {light, dark, fire, frost}
     *
     * @return An array of values representing the elemental buff modifiers
     */
    public double[] getArmorElementalValues() {
        double lightTotal, darkTotal, fireTotal, frostTotal;
        double[] values = new double[4];
        lightTotal = darkTotal = fireTotal = frostTotal = 0;
        Gear[] gear = wornGear.getGear();
        for (Gear g : gear) {
            ElementalType type;
            switch (g.getSlot()) {
                case HEAD:
                case NECK:
                case CHEST:
                case GLOVES:
                case LEGS:
                case FEET:
                case OFFHAND:
                    type = ((Armor) g).getElementalType();
                    double levelRatio = ((double) g.getLevel() / Gear.getMAXLEVEL());
                    switch (type) {
                        case LIGHT:
                            lightTotal += levelRatio * ElementalType.getLightScaling();
                            break;
                        case DARK:
                            darkTotal += levelRatio * ElementalType.getDarkScaling();
                            break;
                        case FIRE:
                            fireTotal += levelRatio * ElementalType.getFireScaling();
                            break;
                        case FROST:
                            frostTotal += levelRatio * ElementalType.getFrostScaling();
                    }
                    break;
            }
        }
        double reducer = .25;
        lightTotal *= reducer;
        darkTotal *= reducer;
        fireTotal *= reducer;
        frostTotal *= reducer;
        values[0] = lightTotal;
        values[1] = darkTotal;
        values[2] = fireTotal;
        values[3] = frostTotal;
        return values;
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

    public RaceName getRaceName() {
        return this.raceName;
    }

    public void setRaceName(RaceName raceName) {
        this.raceName = raceName;
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
