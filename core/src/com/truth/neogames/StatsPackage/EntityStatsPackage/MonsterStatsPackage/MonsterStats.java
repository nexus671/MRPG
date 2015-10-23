package com.truth.neogames.StatsPackage.EntityStatsPackage.MonsterStatsPackage;

import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class MonsterStats extends EntityStats {
    private double maxArmor, currentArmor;

    public MonsterStats(int level, double armor) {
        super(level);
        maxArmor = armor;
        currentArmor = maxArmor;
    }
}
