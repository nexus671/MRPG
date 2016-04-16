package com.truth.neogames.Entities;


import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Abilities.ActiveAbility;
import com.truth.neogames.Effects.Buff;
import com.truth.neogames.Effects.Damage;
import com.truth.neogames.Effects.StatusAilments.Ailment;
import com.truth.neogames.Enums.AbilityType;
import com.truth.neogames.Enums.DamageType;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.RaceName;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.EnvironmentPackage.BattleGrid;
import com.truth.neogames.HoldingSystems.Inventory;
import com.truth.neogames.HoldingSystems.WornGear;
import com.truth.neogames.Items.Consumables.SubTypes.Food;
import com.truth.neogames.Items.Consumables.SubTypes.Potion;
import com.truth.neogames.Items.GearPackage.Gear;
import com.truth.neogames.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Items.GearPackage.Wearables.Armor;
import com.truth.neogames.Items.GearPackage.Wearables.Jewelry;
import com.truth.neogames.Items.Item;
import com.truth.neogames.Professions.Profession;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStats;
import com.truth.neogames.Utilities.RandomNumber;

import java.util.ArrayList;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines any entity in the game, including player, monster, or NPC.
 */
public abstract class LivingEntity extends Entity {
    private static final int MAX_LEVEL = 21;
    /**
     * The Profession.
     */
    protected Profession profession;
    /**
     * The Worn gear.
     */
    protected WornGear wornGear;
    /**
     * The Inventory.
     */
    protected Inventory inventory;
    /**
     * The Stats.
     */
    protected EntityStats stats;
    /**
     * The Aliments.
     */
    protected ArrayList<Ailment> aliments = new ArrayList<Ailment>();

    /**
     * Instantiates a new Living entity.
     *
     * @param name        the name
     * @param raceName    the race name
     * @param sex         the sex
     * @param sprite      the sprite
     * @param description the description
     * @param xPos        the x pos
     * @param yPos        the y pos
     * @param profession  the profession
     * @param entityStats the entity stats
     * @param inventory   the inventory
     * @param wornGear    the worn gear
     */
    protected LivingEntity(String name, RaceName raceName, String sex, Sprite sprite, String description, int xPos, int yPos,
                           Profession profession, EntityStats entityStats, Inventory inventory, WornGear wornGear) {
        this.profession = profession;
        stats = entityStats;
        this.inventory = inventory;
        this.wornGear = wornGear;
    }

    /**
     * Instantiates a new Living entity.
     */
    protected LivingEntity() {
    }

    /**
     * Gets max level.
     *
     * @return the max level
     */
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
        if (g.getLevel() > stats.getLevel()) {
            return false;
        } else {
            Gear old = wornGear.getGear()[slot];
            wornGear.getGear()[slot] = g;
            int index = inventory.getIndexOf(g);
            if (index != -1) {
                inventory.getInv()[index] = null;
            }
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
        if (index != -1) {
            inventory.getInv()[index] = null;
        }
        if (w.getLevel() > stats.getLevel()) {
            return false;
        }
        WornSlot destination = WornSlot.MAINHAND;
        if (twoHanded) {
            if (inventory.isFull() && !wornGear.slotIsEmpty(WornSlot.MAINHAND) && !wornGear.slotIsEmpty(WornSlot.OFFHAND)) {
                return false;
            } else {
                Weapon oldMH = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
                Weapon oldOH = (Weapon) wornGear.getFromSlot(WornSlot.OFFHAND);
                if (oldMH != null) {
                    inventory.add(oldMH);
                }
                if (oldOH != null) {
                    inventory.add(oldOH);
                }
                wornGear.getGear()[destination.getSlotNumber()] = w;
            }
        } else {
            if (!wornGear.slotIsEmpty(WornSlot.MAINHAND) && !wornGear.slotIsEmpty(WornSlot.OFFHAND)) {
                Weapon old = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
                if (old != null) {
                    inventory.add(old);
                }
            } else if (!wornGear.slotIsEmpty(WornSlot.MAINHAND)) {
                WornSlot offhand = WornSlot.OFFHAND;
            }
            wornGear.getGear()[destination.getSlotNumber()] = w;
        }
        return true;
    }

    /**
     * Print ablities.
     */
    public void printAblities() {
        for (ActiveAbility a : profession.getUnlockedActiveAbilities()) {
            if (a.getType() != AbilityType.PASSIVE) {
                System.out.println(a.getName());
            }
        }

    }


    /**
     * Receive damage.
     *
     * @param damages the damages
     */
    public void receiveDamage(Iterable<Damage> damages) {


        for (Damage damage : damages) {
            double d = damage.getDamage();
            if ((damage.getType() == DamageType.ARCANE)) {

            }
            if ((damage.getType() == DamageType.CRUSHING)) {
                //damage reduction
            } else if ((damage.getType() == DamageType.PIERCING))
                if ((damage.getType() == DamageType.SLASHING)) {
                    //damage reduction
                }
            stats.getHealth().setCurrent(stats.getHealth().getCurrent() - d);
        }

    }

    /**
     * Equip boolean.
     *
     * @param j the j
     * @return the boolean
     */
    public boolean equip(Jewelry j) {
        if (j.getLevel() > stats.getLevel()) {
            return false;
        } else {
            Iterable<EntityStatName> statsAffected = j.getStatsAffected();
            Jewelry old;
            if (j.getSlot() == WornSlot.NECK) {
                old = (Jewelry) wornGear.getGear()[WornSlot.NECK.getSlotNumber()];
                wornGear.getGear()[WornSlot.NECK.getSlotNumber()] = j;
            } else {
                old = (Jewelry) wornGear.getGear()[WornSlot.RING.getSlotNumber()];
                wornGear.getGear()[WornSlot.RING.getSlotNumber()] = j;
            }
            if (old != null) {
                inventory.add(old);
            }
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
        if ((health.getCurrent() + f.getHealAmount()) > health.getMax()) {
            health.setCurrent(health.getMax());
        } else {
            health.setCurrent(health.getCurrent() + f.getHealAmount());
        }
        int index = inventory.getIndexOf(f);
        if (index != -1) {
            if (inventory.getInv()[index].getStackCount() > 1) {
                inventory.getInv()[index].setStackCount(inventory.getInv()[index].getStackCount() - 1);
            } else {
                inventory.getInv()[index] = null;
            }
        }
    }

    /**
     * Boosts all the stats specified by the potion.
     *
     * @param p The potion to be consumed.
     */
    public void consume(Potion p) {
        Iterable<EntityStat> stats = p.getStats();
        for (EntityStat stat : stats) {
            EntityStatName name = stat.getStatName();
            double percentValue = (1.0 + p.getPercentAmount()) * this.stats.getStat(name).getMax();

            Buff buff = new Buff(-1, p.getPercentAmount(), p.getFlatAmount(), stat, false);
            stat.addBonus(buff);

        }
        int index = inventory.getIndexOf(p);
        if (index != -1) {
            if (inventory.getInv()[index].getStackCount() > 1) {
                inventory.getInv()[index].setStackCount(inventory.getInv()[index].getStackCount() - 1);
            } else {
                inventory.getInv()[index] = null;
            }
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
        double basicDamage = 1.0;
        boolean hasWeapon = !wornGear.slotIsEmpty(WornSlot.MAINHAND);
        if (hasWeapon) {
            Weapon weapon = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
            basicDamage = weapon.getMinDamage() + ((weapon.getMaxDamage() - weapon.getMinDamage()) * RandomNumber.RANDOM.nextDouble());
        }
        basicDamage += (stats.getStrength().getCurrent() / 100.0) * basicDamage;
        return basicDamage;
    }

    /**
     * Gets the value for the bonus from the elemental affix of the weapon.
     *
     * @return A value for the strength of the elemental buff, dependent on the type of buff.
     */
    public double getWeaponElementalValue() {
        double elementalValue = 0.0;
        Weapon weapon = (Weapon) wornGear.getFromSlot(WornSlot.MAINHAND);
        int level = weapon.getLevel();
        double levelRatio = (double) level / (double) Gear.getMAXLEVEL();
        ElementalType type = weapon.getElementalType();
        switch (type) {
            case NONE:
                elementalValue = 0.0;
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
        double darkTotal, fireTotal, frostTotal;
        double lightTotal = darkTotal = fireTotal = frostTotal = 0.0;
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
                    double levelRatio = ((double) g.getLevel() / (double) Gear.getMAXLEVEL());
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
        double reducer = 0.25;
        lightTotal *= reducer;
        darkTotal *= reducer;
        fireTotal *= reducer;
        frostTotal *= reducer;
        double[] values = new double[4];
        values[0] = lightTotal;
        values[1] = darkTotal;
        values[2] = fireTotal;
        values[3] = frostTotal;
        return values;
    }

    /*************
     * Getters
     *
     * @return the stats
     */
    public EntityStats getStats() {
        return stats;
    }

    /**************
     * Setters
     *
     * @param stats the stats
     */
    public void setStats(EntityStats stats) {
        this.stats = stats;
    }

    /**
     * Gets profession.
     *
     * @return the profession
     */
    public Profession getProfession() {
        return profession;
    }

    /**
     * Sets profession.
     *
     * @param profession the profession
     */
    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    /**
     * Gets worn gear.
     *
     * @return the worn gear
     */
    public WornGear getWornGear() {
        return wornGear;
    }

    /**
     * Sets worn gear.
     *
     * @param wornGear the worn gear
     */
    public void setWornGear(WornGear wornGear) {
        this.wornGear = wornGear;
    }

    /**
     * Gets inventory.
     *
     * @return the inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Sets inventory.
     *
     * @param inventory the inventory
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    /**
     * Move boolean.
     *
     * @param grid the grid
     * @param x    the x
     * @param y    the y
     * @return the boolean
     */
    public boolean move(BattleGrid grid, int x, int y) {
        if (grid.blocked(this, x, y)) {
            grid.moveEntity(this, x, y);
            return true;
        }
        return false;
    }

    /**
     * Move left boolean.
     *
     * @param grid the grid
     * @return the boolean
     */
    public boolean moveLeft(BattleGrid grid) {
        try {
            if (grid.blocked(this, xPos - 1, yPos)) {
                grid.shiftEntity(this, -1, 0);
                return true;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {

            return false;
        }
    }

    /**
     * Move right boolean.
     *
     * @param grid the grid
     * @return the boolean
     */
    public boolean moveRight(BattleGrid grid) {
        try {
            if (grid.blocked(this, xPos + 1, yPos)) {
                grid.shiftEntity(this, 1, 0);
                return true;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException ignored) {

            return false;
        }


    }

    /**
     * Move forward boolean.
     *
     * @param grid the grid
     * @return the boolean
     */
    public boolean moveForward(BattleGrid grid) {
        try {


            if (grid.blocked(this, xPos, yPos + 1)) {
                grid.shiftEntity(this, 0, 1);
                return true;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException ignored) {

            return false;
        }
    }

    /**
     * Move backward boolean.
     *
     * @param grid the grid
     * @return the boolean
     */
    public boolean moveBackward(BattleGrid grid) {
        try {
            if (grid.blocked(this, xPos, yPos - 1)) {
                grid.shiftEntity(this, 0, -1);
                return true;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException ignored) {

            return false;
        }
    }


    /*************
     * Getters
     *************/

    @Override
    public String getName() {
        return name;
    }

    /**************
     * Setters
     *************/

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public RaceName getRaceName() {
        return raceName;
    }

    @Override
    public void setRaceName(RaceName raceName) {
        this.raceName = raceName;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getxPos() {
        return xPos;
    }

    @Override
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    @Override
    public int getyPos() {
        return yPos;
    }

    @Override
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public void setPos(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * Add aliment.
     *
     * @param e the e
     */
    public void addAliment(Ailment e) {
        aliments.add(e);
    }

    /**
     * Remove aliment.
     *
     * @param e the e
     */
    public void removeAliment(Ailment e) {
        aliments.remove(e);
    }


    /**
     * Gets aliments.
     *
     * @return the aliments
     */
    public ArrayList<Ailment> getAliments() {
        return aliments;
    }

    /**
     * Sets aliments.
     *
     * @param aliments the aliments
     */
    public void setAliments(ArrayList<Ailment> aliments) {
        this.aliments = aliments;
    }

    @Override
    public Sprite getSprite() {
        return sprite;
    }

    @Override
    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }


    @Override
    public String toString() {
        return "LivingEntity{" +
                "profession=" + profession +
                ", wornGear=" + wornGear +
                ", inventory=" + inventory +
                ", stats=" + stats +
                '}';
    }
}
