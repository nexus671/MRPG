package com.truth.neogames.Adam.StatsPackage.GearStatsPackage;

import com.truth.neogames.Adam.StatsPackage.Stats;
import com.truth.neogames.Enums.Affixes.GearMaterial;
import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class GearStats extends Stats {
    protected GearMaterial material;

    /*************
     * Constructors
     *************/

    public GearStats() {
    }

    /*************
     * Getter and Setter
     *************/

    public GearMaterial getMaterial() {
        return material;
    }

    public void setMaterial(GearMaterial material) {
        this.material = material;
    }
}
