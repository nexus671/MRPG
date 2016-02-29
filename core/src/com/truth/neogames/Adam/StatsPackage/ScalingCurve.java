package com.truth.neogames.Adam.StatsPackage;

import com.truth.neogames.Ahmane.Entities.LivingEntity;

/**
 * //TODO: Fix scaling
 * Created by Adam on 2/17/2016.
 * Class Description: Provides methods for level scaling from exp, and stat scaling for entities and gear.
 * Damage Scaling Equation: k1 ^ (1 + level / k2) = avgDamage
 * Exp Scaling: level = ln(exp) / ln(k3)
 */
public class ScalingCurve {
    private static final double k1 = 2.3;
    private static final double k2 = 2.5;
    private static final double k3 = 9;

    public static double getDamageScaling(int level) {
        return Math.pow(k1, (1 + level / k2));
    }

    public static double getExp(int level) {
        double exp = 0;
        for (int lvl = 1; lvl <= level && lvl <= LivingEntity.getMaxLevel(); lvl++) {
            exp += lvl + 300 * Math.pow(5, lvl / 4);
        }
        return exp;
    }

    public static boolean levelUp(double exp, int currentLevel) {
        return (getExp(currentLevel + 1) <= exp);
    }
}
