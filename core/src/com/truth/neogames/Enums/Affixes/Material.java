package com.truth.neogames.Enums.Affixes;

import com.truth.neogames.StatsPackage.ScalingCurve;
import com.truth.neogames.Utilities.StringManip;

/**
 * Created by Adam on 11/9/2015.
 * Class Description: The material that an armor or weapon object is made of. Each material has a different
 * level requirement.
 * <p/>
 * Damage Scaling Equation: k1 ^ (1 + level / k2)
 * k1 = 4
 * k2 = 3
 */
public enum Material {
    /**
     * Bronze material.
     */
    BRONZE(1), /**
     * Iron material.
     */
    IRON(2), /**
     * Steel material.
     */
    STEEL(3), /**
     * Mithril material.
     */
    MITHRIL(4),
    /**
     * Golden material.
     */
    GOLDEN(5), /**
     * Laminar material.
     */
    LAMINAR(8), /**
     * Plated material.
     */
    PLATED(10), /**
     * Obsidian material.
     */
    OBSIDIAN(12),
    /**
     * Crystal material.
     */
    CRYSTAL(16), /**
     * Draconic material.
     */
    DRACONIC(21);

    private final String lowercase;
    private final double avgDamage;
    private final double avgDefense;
    private final boolean metallic;
    private int level;

    /**
     * Instantiates a new Material.
     *
     * @param level the level
     */
    Material(int level) {
        this.level = level;
        lowercase = StringManip.toLowercase(super.toString());
        avgDamage = ScalingCurve.getDamageScaling(level);
        avgDefense = ScalingCurve.getDamageScaling(level);
        metallic = true;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets lowercase.
     *
     * @return the lowercase
     */
    public String getLowercase() {
        return lowercase;
    }

    /**
     * Gets avg damage.
     *
     * @return the avg damage
     */
    public double getAvgDamage() {
        return avgDamage;
    }

    /**
     * Gets avg defense.
     *
     * @return the avg defense
     */
    public double getAvgDefense() {
        return avgDefense;
    }

    /**
     * Is metallic boolean.
     *
     * @return the boolean
     */
    public boolean isMetallic() {
        return metallic;
    }

    @Override
    public String toString() {
        return "Material{" +
                "level=" + level +
                ", lowercase='" + lowercase + '\'' +
                ", avgDamage=" + avgDamage +
                ", avgDefense=" + avgDefense +
                ", metallic=" + metallic +
                '}';
    }
}
