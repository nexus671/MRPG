package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.Adam.StatsPackage.ScalingCurve;

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
    BRONZE(1, "Bronze"), IRON(2, "Iron"), STEEL(3, "Steel"), MITHRIL(4, "Mithril"),
    GOLDEN(5, "Golden"), LAMINAR(8, "Laminar"), PLATED(10, "Plated"), OBSIDIAN(12, "Obsidian"),
    CRYSTAL(16, "Crystal"), DRACONIC(21, "Draconic");

    private int level;
    private String lowercase;
    private double avgDamage;
    private double avgDefense;
    private boolean metallic;

    Material(int level, String lowercase) {
        this.level = level;
        this.lowercase = lowercase;
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
