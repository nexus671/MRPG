package com.truth.neogames.Adam.Items.Consumables.SubTypes;

import com.truth.neogames.Adam.Items.Consumables.Consumable;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;

import java.util.HashSet;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A generic potion that can be restorative or a temporary buff.
 */
public class Potion extends Consumable {
    private int flatAmount;
    private double percentAmount;
    private int duration; //the number of turns the potion lasts
    private HashSet<EntityStat> stats; //the stats that are affected
    private boolean refreshes; //whether the potion buff refreshes every turn


    public Potion() {
        flatAmount = 0;
        percentAmount = 0;
        duration = 1;
        stats = new HashSet<EntityStat>();
        refreshes = false;
    }

    public Potion(int flatAmount, double percentAmount, int duration, HashSet<EntityStat> stats, boolean refreshes) {
        this.flatAmount = flatAmount;
        this.percentAmount = percentAmount;
        this.duration = duration;
        this.stats = stats;
        this.refreshes = refreshes;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFlatAmount() {
        return flatAmount;
    }

    public void setFlatAmount(int flatAmount) {
        this.flatAmount = flatAmount;
    }

    public double getPercentAmount() {
        return percentAmount;
    }

    public void setPercentAmount(double percentAmount) {
        this.percentAmount = percentAmount;
    }

    public HashSet<EntityStat> getStats() {
        return stats;
    }

    public void setStats(HashSet<EntityStat> stats) {
        this.stats = stats;
    }

    public boolean isRefreshes() {
        return refreshes;
    }

    public void setRefreshes(boolean refreshes) {
        this.refreshes = refreshes;
    }
}