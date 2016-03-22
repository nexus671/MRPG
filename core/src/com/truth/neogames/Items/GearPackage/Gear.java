package com.truth.neogames.Items.GearPackage;

import com.truth.neogames.Effects.Buff;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Items.Item;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Describes any item that can be equipped in the worn gear (weapon, armor, or jewelry).
 */
public abstract class Gear extends Item {
    /**
     * The constant MAX_LEVEL.
     */
    protected static final int MAX_LEVEL = 21;
    /**
     * The Slot.
     */
    protected WornSlot slot;
    /**
     * The Level.
     */
    protected int level;
    /**
     * The Bonuses.
     */
    protected Collection<Buff> bonuses = new ArrayList<Buff>();

    /**
     * Gets maxlevel.
     *
     * @return the maxlevel
     */
    public static int getMAXLEVEL() {
        return MAX_LEVEL;
    }

    /**
     * Add buffs.
     *
     * @param stats  the stats
     * @param amount the amount
     */
    public void addBuffs(Iterable<EntityStatName> stats, double amount) {
        for (EntityStatName statName : stats) {
            Buff buff = new Buff(amount, statName, false);
            addBonus(buff);
        }
    }

    /**
     * Add bonus.
     *
     * @param e the e
     */
    public void addBonus(Buff e) {
        bonuses.add(e);
    }

    /**
     * Remove bonus.
     *
     * @param e the e
     */
    public void removeBonus(Buff e) {
        bonuses.remove(e);
    }

    /**
     * Gets bonuses stat.
     *
     * @param name the name
     * @return the bonuses stat
     */
    public Collection<Buff> getBonusesStat(EntityStatName name) {
        Collection<Buff> b = new ArrayList<Buff>();

        for (Buff buffs : bonuses) {
            if (buffs.getStatName() == name) {
                b.add(buffs);
            }
        }
        return b;
    }

    /**
     * Sets bonuses.
     *
     * @param bonuses the bonuses
     */
    public void setBonuses(Collection<Buff> bonuses) {
        this.bonuses = bonuses;
    }

    /**
     * Gets slot.
     *
     * @return the slot
     */
    public WornSlot getSlot() {
        return slot;
    }

    /**
     * Sets slot.
     *
     * @param slot the slot
     */
    public void setSlot(WornSlot slot) {
        this.slot = slot;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Gear)) {
            return false;
        }
        Gear g = (Gear) obj;
        return (super.equals(obj) && (g.level == level));
    }

    @Override
    public String toString() {
        return "Gear{" +
                "slot=" + slot +
                ", level=" + level +
                ", bonuses=" + bonuses +
                '}';
    }
}

