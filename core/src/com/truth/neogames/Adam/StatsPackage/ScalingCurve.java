package com.truth.neogames.Adam.StatsPackage;

/**
 * //
 * Created by Adam on 2/17/2016.
 * Class Description: Provides methods for level scaling from exp, and stat scaling for entities and gear.
 * Damage Scaling Equation: k1 ^ (1 + level / k2) = avgDamage
 * Exp Scaling: level = ln(exp) / ln(k3)
 */
public class ScalingCurve {
    private static final double k1 = 1.1;
    private static final double k2 = 1;
    private static final double k3 = 9;

    public static double getDamageScaling(int level) {
        return Math.pow(k1, (1 + level / k2));
    }

    public static int getLevel(double exp) {
        if (exp <= 1)
            return 1;
        return (int) (Math.log(exp) / Math.log(k3));
    }
}
