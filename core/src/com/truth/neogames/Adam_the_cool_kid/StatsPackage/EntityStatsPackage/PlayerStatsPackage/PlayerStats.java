package com.truth.neogames.Adam_the_cool_kid.StatsPackage.EntityStatsPackage.PlayerStatsPackage;

import com.truth.neogames.Adam_the_cool_kid.StatsPackage.EntityStatsPackage.EntityStats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class PlayerStats extends EntityStats {
    protected double exp;

    /************* Constructors *************/

    public PlayerStats() {

    }

    public PlayerStats(double exp) {
        this.exp = exp;
    }
}
