package com.truth.neogames.Ahmane_the_scrub.Effects;


import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;

/**
 * Created by acurr on 2/15/2016.
 */
public class FlatBuff extends Effect {
    private int duration;
    private double magnitude;
    private EntityStat stat;

    public FlatBuff(int duration, double magnitude, EntityStat stat) {
        this.duration = duration;
        this.magnitude = magnitude;
        this.stat = stat;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public EntityStat getStat() {
        return stat;
    }

    public void setStat(EntityStat stat) {
        this.stat = stat;
    }
}
