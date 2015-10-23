package com.truth.neogames.Entities.SubTypes;

import com.truth.neogames.AbilityTrees.AbilityTree;
import com.truth.neogames.Entities.Entity;
import com.truth.neogames.StatsPackage.EntityStatsPackage.MonsterStatsPackage.MonsterStats;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Monster extends Entity {
    private AbilityTree abilities;
    private boolean hostile;
    private MonsterStats stats;

    /************* Constructors *************/

    public Monster(boolean hostile, MonsterStats stats) {
        abilities = new AbilityTree();
        this.hostile = hostile;
        this.stats = stats;
    }

    /************* Getters *************/

    public AbilityTree getAbilities() {
        return abilities;
    }

    public boolean isHostile() {
        return hostile;
    }

    public MonsterStats getStats() {
        return stats;
    }

    /************* Setters *************/

    public void setAbilities(AbilityTree abilities) {
        this.abilities = abilities;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }

    public void setStats(MonsterStats stats) {
        this.stats = stats;
    }

}
