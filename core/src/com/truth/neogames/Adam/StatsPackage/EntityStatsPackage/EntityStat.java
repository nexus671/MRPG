package com.truth.neogames.Adam.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Ahmane.Effects.Buff;
import com.truth.neogames.Enums.EntityStatName;

import java.util.ArrayList;

/**
 * Created by Adam on 10/26/2015.
 * Class Description: A stat for an entity.
 */
public class EntityStat {
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
        this.current = baseMax;
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

    public void removeListOfBonuses(ArrayList<Buff> buffs) {
        bonuses.removeAll(buffs);
    }

    public void addListOfBonuses(ArrayList<Buff> buffs) {
        bonuses.addAll(buffs);
    }

    public double calculateValue() {
        max = baseMax;
        applyBonuses();
        return max;
    }

    protected void applyBonuses() {
        max = baseMax;
        double bonusValue = 0;
        double bonusMultiplier = 0;

        for (Buff b : bonuses) {
            bonusValue += b.getValue();
            bonusMultiplier += (b.getMagnitude());
        }
        max += bonusValue;
        max *= (1 + bonusMultiplier);
    }

    public double getBaseMax() {
        return baseMax;
    }

    public void setBaseMax(double baseMax) {
        this.baseMax = baseMax;
    }

    public EntityStatName getName() {
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
        String str = name + "\n";
        str += "Base Max = " + baseMax + "\n";
        str += "Current Max = " + max + "\n";
        str += "Current Value = " + current + "\n";
        return str;
    }
}
