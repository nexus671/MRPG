package com.truth.neogames.Adam_the_cool_kid.StatsPackage.GearStatsPackage;

import com.truth.neogames.Enums.ElementalType;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public class GearStats extends com.truth.neogames.Adam_the_cool_kid.StatsPackage.Stats {
    private ElementalType elementalType;

    /************* Constructors *************/

    public GearStats() {
        elementalType = ElementalType.NONE;
    }

    /************* Getter and Setter *************/

    public ElementalType getElementalType() {
        return elementalType;
    }

    public void setElementalType(ElementalType elementalType) {
        this.elementalType = elementalType;
    }
}
