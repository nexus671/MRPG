package com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes;

import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.MonsterStatsPackage.MonsterStats;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Monster extends com.truth.neogames.Ahmane_the_scrub.Entities.Entity {
    private com.truth.neogames.Ahmane_the_scrub.AbilityTrees.AbilityTree abilities;
    private boolean hostile;
    private MonsterStats stats;

    /************* Constructors *************/

    public Monster(boolean hostile, MonsterStats stats) {
        abilities = new com.truth.neogames.Ahmane_the_scrub.AbilityTrees.AbilityTree();
        this.hostile = hostile;
        this.stats = stats;
    }

    /************* Getters *************/

    public com.truth.neogames.Ahmane_the_scrub.AbilityTrees.AbilityTree getAbilities() {
        return abilities;
    }

    public boolean isHostile() {
        return hostile;
    }

    public MonsterStats getStats() {
        return stats;
    }

    /************* Setters *************/

    public void setAbilities(com.truth.neogames.Ahmane_the_scrub.AbilityTrees.AbilityTree abilities) {
        this.abilities = abilities;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }

    public void setStats(MonsterStats stats) {
        this.stats = stats;
    }

}
