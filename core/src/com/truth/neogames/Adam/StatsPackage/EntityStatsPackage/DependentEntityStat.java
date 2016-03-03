package com.truth.neogames.Adam.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Ahmane.Effects.Buff;
import com.truth.neogames.Enums.EntityStatName;

import java.util.ArrayList;

/**
 * Created by acurr on 2/17/2016.
 */
public class DependentEntityStat extends EntityStat {
    protected ArrayList<EntityStat> attrs = new ArrayList<EntityStat>();

    /*************
     * Constructors
     *************/

    public DependentEntityStat(EntityStatName name, double baseMax) {
        super(name, baseMax);
    }

    /*************
     * Getters
     *************/

    public void addStat(EntityStat attr) {
        attrs.add(attr);
    }

    public void removeStat(EntityStat attr) {
        attrs.remove(attr);
    }

    public void addBonus(Buff e) {
        bonuses.add(e);
    }

    public void removeBonus(Buff e) {
        bonuses.remove(e);
    }

    public double calculateValue() {
        max = baseMax;
        applyBonuses();
        return max;
    }

    @Override
    public String toString() {
        String str = name + "\n";
        str += "Base Max = " + baseMax + "\n";
        str += "Current Max = " + max + "\n";
        str += "Current Value = " + current + "\n";
        return str;
    }
}
