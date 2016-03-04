package com.truth.neogames.Adam.StatsPackage;

import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.RPGObject;

/**
 * //TODO: Fix scaling
 * Created by Adam on 2/17/2016.
 * Class Description: Provides methods for level scaling from exp, and stat scaling for entities and gear.
 * Damage Scaling Equation: k1 ^ (1 + level / k2) = avgDamage
 * Exp Scaling: level = ln(exp) / ln(k3)
 * Armor Reduction Percentage = (armorValue ^ 2) / ( 3 * armorValue ^ 2 + 20 * armorValue)
 */
public class ScalingCurve extends RPGObject {
    private static final double k1 = 2.3;
    private static final double k2 = 2.5;
    private static final double k3 = 9.0;

    public static double getDamageScaling(int level) {
        return Math.pow(k1, (1.0 + ((double) level / k2)));
    }

    public static double getExp(int level) {
        double exp = 0.0;
        for (int lvl = 1; (lvl <= level) && (lvl <= LivingEntity.getMaxLevel()); lvl++) {
            exp += (double) lvl + (300.0 * Math.pow(5.0, (double) (lvl / 4)));
        }
        return exp;
    }


    /**
     * Gets the percentage reduction of a specified armor value.
     *
     * @param totalArmorValue The armor stat to be checked (ex. pierce defense)
     * @return A double 0-1 that represents the percentage damage reduction.
     */
    public static double getArmorReduction(double totalArmorValue) {
        return ((totalArmorValue * totalArmorValue) / ((3.0 * (totalArmorValue * totalArmorValue)) + (20.0 * totalArmorValue)));
    }

    public static boolean levelUp(double exp, int currentLevel) {
        return (getExp(currentLevel + 1) <= exp);
    }
}
