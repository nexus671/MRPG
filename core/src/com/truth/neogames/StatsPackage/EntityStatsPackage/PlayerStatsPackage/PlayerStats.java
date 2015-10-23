package com.truth.neogames.StatsPackage.EntityStatsPackage.PlayerStatsPackage;

import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStats;

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
        super(1);
        this.exp = exp;
    }
}
