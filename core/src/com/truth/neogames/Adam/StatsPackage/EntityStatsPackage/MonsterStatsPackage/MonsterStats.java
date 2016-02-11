package com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.MonsterStatsPackage;

import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class MonsterStats extends EntityStats {
    private double maxArmor, currentArmor;

    public MonsterStats(int level, double armor) {
        maxArmor = armor;
        currentArmor = maxArmor;
        super.setByLevel(level);
    }

    public double getMaxArmor() {
        return maxArmor;
    }

    public void setMaxArmor(double maxArmor) {
        this.maxArmor = maxArmor;
    }

    public double getCurrentArmor() {
        return currentArmor;
    }

    public void setCurrentArmor(double currentArmor) {
        this.currentArmor = currentArmor;
    }
}
