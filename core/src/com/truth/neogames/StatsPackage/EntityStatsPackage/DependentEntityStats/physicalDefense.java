package com.truth.neogames.StatsPackage.EntityStatsPackage.DependentEntityStats;

import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.StatsPackage.EntityStatsPackage.DependentEntityStat;

/**
 * Created by acurr on 2/17/2016.
 */
public class physicalDefense extends DependentEntityStat {

    /**
     * Instantiates a new Physical defense.
     *
     * @param name    the name
     * @param baseMax the base max
     */
    public physicalDefense(EntityStatName name, double baseMax) {
        super(name, baseMax);
    }

    @Override
    public double calculateValue() {
        max = baseMax;
        //Every 5 points in constitution adds 1 to physicalDefense
        //This is just an example of what a dependent stat is you should change this up and make more
        //you must initialize all dependent stats just like you did with the entitystats and add the attributes to the arraylist to use them
        double constitution = attrs.get(0).calculateValue();

        max += constitution / 5.0;
        applyBonuses();
        return max;
    }

}
