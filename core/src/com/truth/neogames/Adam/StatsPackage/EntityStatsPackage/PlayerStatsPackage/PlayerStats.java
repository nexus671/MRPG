package com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.PlayerStatsPackage;

import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class PlayerStats extends EntityStats {
    protected double exp;

    /************* Constructors *************/

    public PlayerStats() {
        exp = 0;
    }

    public PlayerStats(double exp) {
        this.exp = exp;
    }
}
