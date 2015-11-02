package com.truth.neogames.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Enums.StatName;

/**
 * Created by Adam on 10/26/2015.
 * Class Description: A stat for an entity.
 */
public class EntityStat extends com.truth.neogames.StatsPackage.EntityStat {
    private double max;
    private double current;

    /*************
     * Constructors
     *************/

    public EntityStat(StatName name, double max) {
        this.name = name;
        this.max = max;
        this.current = max;
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

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }
}
