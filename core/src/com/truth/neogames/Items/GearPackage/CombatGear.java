package com.truth.neogames.Items.GearPackage;

import com.truth.neogames.Enums.Affixes.Material;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Parent class for weapons and armor, but not jewelry.
 */
public abstract class CombatGear extends Gear {
    /**
     * The Material.
     */
    protected Material material;

    /**
     * Instantiates a new Combat gear.
     */
    protected CombatGear() {
    }

    /**
     * Instantiates a new Combat gear.
     *
     * @param material the material
     */
    protected CombatGear(Material material) {
        this.material = material;
    }

    /**
     * Gets material.
     *
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Sets material.
     *
     * @param material the material
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * Assign description.
     */
    public void assignDescription() {
        description = name + '\n';
        description += "Level: " + level + '\n';
    }

    @Override
    public String toString() {
        return "CombatGear{" +
                "material=" + material +
                '}';
    }
}
