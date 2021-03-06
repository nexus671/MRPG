package com.truth.neogames.Entities.SubTypes;

import com.truth.neogames.Entities.Entity;
import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.EnvironmentPackage.BattleGrid;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStats;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Monster extends LivingEntity {

    private boolean hostile;

    /*************
     * Constructors
     *
     * @param hostile the hostile
     * @param stats   the stats
     */
    public Monster(boolean hostile, EntityStats stats) {

        this.hostile = hostile;
        this.stats = stats;
    }

    /**
     * Move toward target.
     *
     * @param b the b
     * @param e the e
     */
    public void moveTowardTarget(BattleGrid b, Entity e) {

    }

    /************* Getters *************/


    /*************
     * Setters
     *
     * @return the boolean
     */
    public boolean isAlive() {
        return this.getStats().getHealth().getCurrent() >= 0;
    }

    /**
     * Is hostile boolean.
     *
     * @return the boolean
     */
    public boolean isHostile() {
        return hostile;
    }

    /**
     * Sets hostile.
     *
     * @param hostile the hostile
     */
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
