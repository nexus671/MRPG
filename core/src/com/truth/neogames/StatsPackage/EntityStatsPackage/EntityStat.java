package com.truth.neogames.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Effects.Buff;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.RPGObject;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Adam on 10/26/2015.
 * Class Description: A stat for an entity.
 */
public class EntityStat extends RPGObject {
    /**
     * The Name.
     */
    protected final EntityStatName name;
    /**
     * The Max.
     */
    protected double max;
    /**
     * The Base max.
     */
    protected double baseMax;
    /**
     * The Current.
     */
    protected double current;

    /**
     * The Bonuses.
     */
    protected ArrayList<Buff> bonuses = new ArrayList<Buff>();

    /*************
     * Constructors
     *
     * @param name    the name
     * @param baseMax the base max
     */
    public EntityStat(EntityStatName name, double baseMax) {
        this.name = name;
        this.baseMax = baseMax;
        current = baseMax;
        max = baseMax;
    }

    /*************
     * Getters
     *
     * @return the max
     */
    public double getMax() {
        return calculateValue();
    }

    /**
     * Sets max.
     *
     * @param max the max
     */
    public void setMax(double max) {
        this.max = max;
    }

    /*************
     * Setters
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
     * Remove list of bonuses.
     *
     * @param buffs the buffs
     */
    public void removeListOfBonuses(Collection<Buff> buffs) {
        bonuses.removeAll(buffs);
    }

    /**
     * Add list of bonuses.
     *
     * @param buffs the buffs
     */
    public void addListOfBonuses(Collection<Buff> buffs) {
        bonuses.addAll(buffs);
    }

    /**
     * Calculate value double.
     *
     * @return the double
     */
    public double calculateValue() {
        max = baseMax;
        applyBonuses();
        return max;
    }

    /**
     * Apply bonuses.
     */
    protected void applyBonuses() {
        max = baseMax;
        double bonusValue = 0.0;
        double bonusMultiplier = 0.0;

        for (Buff b : bonuses) {
            if (b.isDebuff()) {
                bonusValue -= b.getValue();
                bonusMultiplier -= b.getMagnitude();
            } else {
                bonusValue += b.getValue();
                bonusMultiplier += b.getMagnitude();
            }
        }
        max *= (1.0 + bonusMultiplier);
        max += bonusValue;
    }

    /**
     * Gets base max.
     *
     * @return the base max
     */
    public double getBaseMax() {
        return baseMax;
    }

    /**
     * Sets base max.
     *
     * @param baseMax the base max
     */
    public void setBaseMax(double baseMax) {
        this.baseMax = baseMax;
    }

    /**
     * Gets stat name.
     *
     * @return the stat name
     */
    public EntityStatName getStatName() {
        return name;
    }

    /**
     * Gets current.
     *
     * @return the current
     */
    public double getCurrent() {
        return current;
    }

    /**
     * Sets current.
     *
     * @param current the current
     */
    public void setCurrent(double current) {
        this.current = current;
    }

    /**
     * Gets bonuses.
     *
     * @return the bonuses
     */
    public ArrayList<Buff> getBonuses() {
        return bonuses;
    }

    /**
     * Sets bonuses.
     *
     * @param bonuses the bonuses
     */
    public void setBonuses(ArrayList<Buff> bonuses) {
        this.bonuses = bonuses;
    }

    @Override
    public String toString() {
        return "EntityStat{" +
                "name=" + name +
                ", max=" + max +
                ", baseMax=" + baseMax +
                ", current=" + current +
                ", bonuses=" + bonuses +
                '}';
    }
}
