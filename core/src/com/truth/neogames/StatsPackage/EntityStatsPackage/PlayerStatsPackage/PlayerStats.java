package com.truth.neogames.StatsPackage.EntityStatsPackage.PlayerStatsPackage;

import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class PlayerStats extends EntityStats {
    private double exp;

    /************* Constructors *************/

    public PlayerStats(int level, double exp) {
        super(level);
        this.exp = exp;
    }
}
