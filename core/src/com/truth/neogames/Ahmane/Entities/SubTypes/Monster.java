package com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes;

import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;
import com.truth.neogames.Ahmane_the_scrub.AbilityTrees.AbilityTree;
import com.truth.neogames.Ahmane_the_scrub.Entities.Entity;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Monster extends Entity {
    private AbilityTree abilities;
    private boolean hostile;
    private EntityStats stats;

    /************* Constructors *************/

    public Monster(boolean hostile, EntityStats stats) {
        abilities = new com.truth.neogames.Ahmane_the_scrub.AbilityTrees.AbilityTree();
        this.hostile = hostile;
        this.stats = stats;
    }

    /************* Getters *************/

    public AbilityTree getAbilities() {
        return abilities;
    }

    /*************
     * Setters
     *************/

    public void setAbilities(com.truth.neogames.Ahmane_the_scrub.AbilityTrees.AbilityTree abilities) {
        this.abilities = abilities;
    }

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
