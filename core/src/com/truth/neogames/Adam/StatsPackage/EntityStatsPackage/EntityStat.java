package com.truth.neogames.Adam.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Enums.EntityStatName;

/**
 * Created by Adam on 10/26/2015.
 * Class Description: A stat for an entity.
 */
public class EntityStat {
    protected final EntityStatName name;
    private double max;
    private double baseMax;
    private double current;

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
        return max;
    }

    /*************
     * Setters
     *************/

    public void setMax(double max) {
        this.max = max;
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

    @Override
    public String toString() {
        String str = name + "\n";
        str += "Base Max = " + baseMax + "\n";
        str += "Current Max = " + max + "\n";
        str += "Current Value = " + current + "\n";
        return str;
    }
}
