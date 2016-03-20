package com.truth.neogames.Items.GearPackage;

import com.truth.neogames.Enums.Affixes.Material;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Parent class for weapons and armor, but not jewelry.
 */
public abstract class CombatGear extends Gear {
    protected Material material;

    protected CombatGear() {
    }

    protected CombatGear(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

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
