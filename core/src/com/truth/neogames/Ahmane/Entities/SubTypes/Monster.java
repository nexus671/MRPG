package com.truth.neogames.Ahmane.Entities.SubTypes;

import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.MonsterStatsPackage.MonsterStats;
import com.truth.neogames.Ahmane.Entities.Entity;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description:
 */
public class Monster extends Entity {

    private boolean hostile;
    private MonsterStats stats;

    /************* Constructors *************/

    public Monster(boolean hostile, MonsterStats stats) {
        this.hostile = hostile;
        this.stats = stats;
    }


    /************* Setters *************/


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
