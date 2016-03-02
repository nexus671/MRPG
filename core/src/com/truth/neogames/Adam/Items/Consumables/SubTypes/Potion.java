package com.truth.neogames.Adam.Items.Consumables.SubTypes;

import com.truth.neogames.Adam.Items.Consumables.Consumable;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.Utilities.DecimalRounder;

import java.util.ArrayList;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A generic potion that can be restorative or a temporary buff.
 */
public class Potion extends Consumable {
    private final double MAX_STATS = 3;
    private int flatAmount;
    private double percentAmount;
    private int duration; //the number of turns the potion lasts
    private ArrayList<EntityStat> stats; //the stats that are affected
    private boolean refreshes; //whether the potion buff refreshes every turn


    public Potion() {
        flatAmount = 0;
        percentAmount = 0;
        duration = 1;
        stats = new ArrayList<EntityStat>();
        refreshes = false;
        setName("Unnamed Potion");
        setDescription("No Description");
        setStackable(false);
    }

    public Potion(int flatAmount, double percentAmount, int duration, ArrayList<EntityStat> stats, boolean refreshes,
                  String name) {
        this.flatAmount = flatAmount;
        this.percentAmount = percentAmount;
        this.duration = duration;
        this.stats = stats;
        this.refreshes = refreshes;
        super.name = name;
        super.stackable = false;
        assignDescription();
    }

    public double getMAX_STATS() {
        return MAX_STATS;
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

    public ArrayList<EntityStat> getStats() {
        return stats;
    }

    public void setStats(ArrayList<EntityStat> stats) {
        this.stats = stats;
    }

    public boolean isRefreshes() {
        return refreshes;
    }

    public void setRefreshes(boolean refreshes) {
        this.refreshes = refreshes;
    }

    public void assignDescription() {
        description = "Consume to increase ";
        for (int i = 0; i < stats.size(); i++) {
            description += stats.get(i).getStatName();
            if (stats.size() == MAX_STATS && i != (stats.size() - 1)) {
                description += ", ";
            }
            if (i == (stats.size() - (MAX_STATS - 1))) {
                description += "and ";
            }
        }
        description += " by ";
        boolean pctBuff = percentAmount != 1;
        boolean flatBuff = flatAmount != 0;
        if (pctBuff) {
            if (percentAmount > 1)
                description += (DecimalRounder.round((percentAmount - 1) * 100));
            else
                description += DecimalRounder.round(percentAmount);
            description += "%";
        }
        if (pctBuff && flatBuff) {
            description += " plus ";
        }
        if (flatBuff) {
            if (flatAmount > 0)
                description += flatAmount;
        }
        description += " for " + duration + " turns.";
        if (refreshes) {
            description += " Refreshes each turn.";
        }
    }
}