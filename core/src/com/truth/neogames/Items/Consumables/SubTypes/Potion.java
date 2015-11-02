package com.truth.neogames.Items.Consumables.SubTypes;

import com.truth.neogames.Items.Consumables.Consumable;
import com.truth.neogames.StatsPackage.EntityStat;

import java.util.HashSet;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Potions that increase certain stats by a flat amount and by a percentage.
 */
public class Potion extends Consumable {
    private double flatAmount; //the flat amount of increase
    private double percentAmount; //the percentage increase in the stat (.5 will increase by 50%, etc.)
    private int duration;
    private HashSet<EntityStat> stats; //the stats that are affected

    public Potion() {
        flatAmount = 0;
        percentAmount = 0;
        duration = 1;
        stats = new HashSet<EntityStat>();
    }

    /*************
     * Getters and Setters
     *************/

    public double getFlatAmount() {
        return flatAmount;
    }

    public void setFlatAmount(double flatAmount) {
        this.flatAmount = flatAmount;
    }

    public double getPercentAmount() {
        return percentAmount;
    }

    public void setPercentAmount(double percentAmount) {
        this.percentAmount = percentAmount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public HashSet<EntityStat> getStats() {
        return stats;
    }

    public void setStats(HashSet<EntityStat> stats) {
        this.stats = stats;
    }
}
