package com.truth.neogames.Ahmane.Entities.SubTypes;

import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;
import com.truth.neogames.Ahmane.Entities.LivingEntity;



/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Monster extends LivingEntity {

    private boolean hostile;
    private EntityStats stats;

    /************* Constructors *************/

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

    public EntityStats getStats() {
        return stats;
    }

    public void setStats(EntityStats stats) {
        this.stats = stats;
    }

}