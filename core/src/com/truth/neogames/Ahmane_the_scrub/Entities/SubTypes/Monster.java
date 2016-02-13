package com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes;

import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.MonsterStatsPackage.MonsterStats;
import com.truth.neogames.Ahmane_the_scrub.Abilitys.Ability;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Monster extends com.truth.neogames.Ahmane_the_scrub.Entities.Entity {
    private Ability abilities;
    private boolean hostile;
    private MonsterStats stats;

    /************* Constructors *************/

    public Monster(boolean hostile, MonsterStats stats) {
        abilities = new Ability();
        this.hostile = hostile;
        this.stats = stats;
    }

    /************* Getters *************/

    public Ability getAbilities() {
        return abilities;
    }

    /************* Setters *************/

    public void setAbilities(Ability abilities) {
        this.abilities = abilities;
    }

    public boolean isHostile() {
        return hostile;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }

    public MonsterStats getStats() {
        return stats;
    }

    public void setStats(MonsterStats stats) {
        this.stats = stats;
    }

}
