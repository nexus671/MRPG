package com.truth.neogames.Entities.SubTypes;

import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStats;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Monster extends LivingEntity {

    private boolean hostile;

    /*************
     * Constructors
     *************/

    public Monster(boolean hostile, EntityStats stats) {

        this.hostile = hostile;
        this.stats = stats;
    }

    /************* Getters *************/


    /*************
     * Setters
     *************/


    public boolean isHostile() {
        return hostile;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }

    @Override
    public EntityStats getStats() {
        return stats;
    }

    @Override
    public void setStats(EntityStats stats) {
        this.stats = stats;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "hostile=" + hostile +
                '}';
    }
}
