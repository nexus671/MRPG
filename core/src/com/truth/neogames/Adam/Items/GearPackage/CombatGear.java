package com.truth.neogames.Adam.Items.GearPackage;

import com.truth.neogames.Enums.Affixes.Material;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: Parent class for weapons and armor, but not jewelry.
 */
public class CombatGear extends Gear {
    protected Material  material;

    public CombatGear() {
    }

    public CombatGear(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
