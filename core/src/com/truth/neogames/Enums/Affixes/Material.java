package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Adam.StatsPackage.ScalingCurve;
import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/9/2015.
 * Class Description: The material that an armor or weapon object is made of. Each material has a different
 * level requirement.
 *
 * Damage Scaling Equation: k1 ^ (1 + level / k2)
 * k1 = 4
 * k2 = 3
 */
public enum Material {
    BRONZE(1), IRON(2), STEEL(3), MITHRIL(4),
    GOLDEN(5), LAMINAR(8), PLATED(10), OBSIDIAN(12),
    CRYSTAL(16), DRACONIC(21);

    private int level;
    private String lowercase;
    private double avgDamage;
    private double avgDefense;
    private boolean metallic;

    Material(int level) {
        this.level = level;
        lowercase = StringManip.toLowercase(super.toString());
        avgDamage = ScalingCurve.getDamageScaling(level);
        avgDefense = ScalingCurve.getDamageScaling(level);
        metallic = true;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getLowercase() {
        return lowercase;
    }

    public double getAvgDamage() {
        return avgDamage;
    }

    public double getAvgDefense() {
        return avgDefense;
    }

    public boolean isMetallic() {
        return metallic;
    }

    @Override
    public String toString() {
        return lowercase;
    }
}
