package com.truth.neogames.Items.Consumables.SubTypes;

import com.truth.neogames.Items.Consumables.Consumable;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.Utilities.DecimalRounder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 11/4/2015.
 * Class Description: A generic potion that can be restorative or a temporary buff.
 */
public class Potion extends Consumable {
    private final double MAX_STATS = 3.0;
    private int flatAmount;
    private double percentAmount;
    private int duration; //the number of turns the potion lasts
    private List<EntityStat> stats; //the stats that are affected
    private boolean refreshes; //whether the potion buff refreshes every turn


    /**
     * Instantiates a new Potion.
     */
    public Potion() {
        flatAmount = 0;
        percentAmount = 0.0;
        duration = 1;
        stats = new ArrayList<EntityStat>();
        refreshes = false;
        setName("Unnamed Potion");
        setDescription("No Description");
        setStackable(false);
    }

    /**
     * Instantiates a new Potion.
     *
     * @param flatAmount    the flat amount
     * @param percentAmount the percent amount
     * @param duration      the duration
     * @param stats         the stats
     * @param refreshes     the refreshes
     * @param name          the name
     */
    public Potion(int flatAmount, double percentAmount, int duration, List<EntityStat> stats, boolean refreshes,
                  String name) {
        this.flatAmount = flatAmount;
        this.percentAmount = percentAmount;
        this.duration = duration;
        this.stats = stats;
        this.refreshes = refreshes;
        super.name = name;
        stackable = false;
        assignDescription();
    }

    /**
     * Gets max stats.
     *
     * @return the max stats
     */
    public double getMAX_STATS() {
        return MAX_STATS;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Gets flat amount.
     *
     * @return the flat amount
     */
    public int getFlatAmount() {
        return flatAmount;
    }

    /**
     * Sets flat amount.
     *
     * @param flatAmount the flat amount
     */
    public void setFlatAmount(int flatAmount) {
        this.flatAmount = flatAmount;
    }

    /**
     * Gets percent amount.
     *
     * @return the percent amount
     */
    public double getPercentAmount() {
        return percentAmount;
    }

    /**
     * Sets percent amount.
     *
     * @param percentAmount the percent amount
     */
    public void setPercentAmount(double percentAmount) {
        this.percentAmount = percentAmount;
    }

    /**
     * Gets stats.
     *
     * @return the stats
     */
    public Iterable<EntityStat> getStats() {
        return stats;
    }

    /**
     * Sets stats.
     *
     * @param stats the stats
     */
    public void setStats(List<EntityStat> stats) {
        this.stats = stats;
    }

    /**
     * Is refreshes boolean.
     *
     * @return the boolean
     */
    public boolean isRefreshes() {
        return refreshes;
    }

    /**
     * Sets refreshes.
     *
     * @param refreshes the refreshes
     */
    public void setRefreshes(boolean refreshes) {
        this.refreshes = refreshes;
    }

    /**
     * Assign description.
     */
    public void assignDescription() {
        description = "Consume to increase ";
        for (int i = 0; i < stats.size(); i++) {
            description += stats.get(i).getStatName();
            if (((double) stats.size() == MAX_STATS) && (i != (stats.size() - 1))) {
                description += ", ";
            }
            if ((double) i == ((double) stats.size() - (MAX_STATS - 1.0))) {
                description += "and ";
            }
        }
        description += " by ";
        boolean pctBuff = percentAmount != 1.0;
        boolean flatBuff = flatAmount != 0;
        if (pctBuff) {
            description += (percentAmount > 1.0) ? DecimalRounder.round((percentAmount - 1.0) * 100.0) : DecimalRounder.round(percentAmount);
            description += "%";
        }
        if (pctBuff && flatBuff) {
            description += " plus ";
        }
        if (flatBuff) {
            if (flatAmount > 0) {
                description += flatAmount;
            }
        }
        description += " for " + duration + " turns.";
        if (refreshes) {
            description += " Refreshes each turn.";
        }
    }

    @Override
    public String toString() {
        return "Potion{" +
                "MAX_STATS=" + MAX_STATS +
                ", flatAmount=" + flatAmount +
                ", percentAmount=" + percentAmount +
                ", duration=" + duration +
                ", stats=" + stats +
                ", refreshes=" + refreshes +
                '}';
    }
}