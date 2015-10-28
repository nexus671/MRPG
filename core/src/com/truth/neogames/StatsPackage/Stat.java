package com.truth.neogames.StatsPackage;

import com.truth.neogames.Enums.StatName;

/**
 * Created by Adam on 10/26/2015.
 * Class Description: Describes a Stat object.
 * The Stats class is a list of all the stats for an entity or gear object.
 * This class describes a single stat.
 */
public class Stat {
    protected StatName name;

    /**************
     * Constructors
     *************/

    public Stat() {
    }

    public Stat(StatName name) {
        this.name = name;
    }

    /**************
     * Getters
     *************/

    public StatName getName() {
        return name;
    }

    /************** Setters *************/

    public void setName(StatName name) {
        this.name = name;
    }
}
