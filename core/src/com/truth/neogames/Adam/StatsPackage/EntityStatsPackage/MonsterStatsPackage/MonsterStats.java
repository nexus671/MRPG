package com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.MonsterStatsPackage;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class MonsterStats extends com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats {
    private double maxArmor, currentArmor;

    public MonsterStats(int level, double armor) {
        maxArmor = armor;
        currentArmor = maxArmor;
    }
}
