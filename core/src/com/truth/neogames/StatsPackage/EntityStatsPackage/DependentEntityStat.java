package com.truth.neogames.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Effects.Buff;
import com.truth.neogames.Enums.EntityStatName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acurr on 2/17/2016.
 */
public class DependentEntityStat extends EntityStat {
    /**
     * The Attrs.
     */
    protected List<EntityStat> attrs = new ArrayList<EntityStat>();

    /*************
     * Constructors
     *
     * @param name    the name
     * @param baseMax the base max
     */
    public DependentEntityStat(EntityStatName name, double baseMax) {
        super(name, baseMax);
    }

    /*************
     * Getters
     *
     * @param attr the attr
     */
    public void addStat(EntityStat attr) {
        attrs.add(attr);
    }

    /**
     * Remove stat.
     *
     * @param attr the attr
     */
    public void removeStat(EntityStat attr) {
        attrs.remove(attr);
    }

    @Override
    public void addBonus(Buff e) {
        bonuses.add(e);
    }

    @Override
    public void removeBonus(Buff e) {
        bonuses.remove(e);
    }

    @Override
    public double calculateValue() {
        max = baseMax;
        applyBonuses();
        return max;
    }

    @Override
    public String toString() {
        return "DependentEntityStat{" +
                "attrs=" + attrs +
                '}';
    }
}
