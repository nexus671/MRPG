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
    protected final EntityStatName name;
    protected double max;
    protected double baseMax;
    protected double current;

    protected ArrayList<Buff> bonuses = new ArrayList<Buff>();

    /*************
     * Constructors
     *************/

    public EntityStat(EntityStatName name, double baseMax) {
        this.name = name;
        this.baseMax = baseMax;
        current = baseMax;
        max = baseMax;
    }

    /*************
     * Getters
     *************/

    public double getMax() {
        return calculateValue();
    }

    public void setMax(double max) {
        this.max = max;
    }

    /*************
     * Setters
     *************/
    public void addBonus(Buff e) {
        bonuses.add(e);
    }

    public void removeBonus(Buff e) {
        bonuses.remove(e);
    }

    public void removeListOfBonuses(Collection<Buff> buffs) {
        bonuses.removeAll(buffs);
    }

    public void addListOfBonuses(Collection<Buff> buffs) {
        bonuses.addAll(buffs);
    }

    public double calculateValue() {
        max = baseMax;
        applyBonuses();
        return max;
    }

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

    public double getBaseMax() {
        return baseMax;
    }

    public void setBaseMax(double baseMax) {
        this.baseMax = baseMax;
    }

    public EntityStatName getStatName() {
        return name;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public ArrayList<Buff> getBonuses() {
        return bonuses;
    }

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
