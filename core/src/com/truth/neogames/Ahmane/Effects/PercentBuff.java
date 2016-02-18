package com.truth.neogames.Ahmane.Effects;


import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;

/**
 * Created by acurr on 2/15/2016.
 */
public class PercentBuff extends Effect {
    private int duration;
    private double magnitude;
    private EntityStat stat;
    private boolean debuff;


    public PercentBuff(int duration, double magnitude, EntityStat stat, boolean debuff) {
        this.duration = duration;
        this.magnitude = magnitude;
        this.stat = stat;
        this.debuff = debuff;
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

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public EntityStat getStat() {
        return stat;
    }

    public void setStat(EntityStat stat) {
        this.stat = stat;
    }

    public boolean isDebuff() {
        return debuff;
    }

    public void setDebuff(boolean debuff) {
        this.debuff = debuff;
    }
}
