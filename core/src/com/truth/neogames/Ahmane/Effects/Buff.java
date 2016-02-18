package com.truth.neogames.Ahmane.Effects;


import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.Enums.EntityStatName;

/**
 * Created by acurr on 2/15/2016.
 */
public class Buff extends Effect {
    private int duration;
    private double magnitude;
    private double value;
    private EntityStat stat;
    private EntityStatName statName;
    private boolean debuff;

    public Buff(int duration, double magnitude, double value, EntityStat stat, boolean debuff) {
        this.duration = duration;
        this.magnitude = magnitude;
        this.value = value;
        this.debuff = debuff;
        this.stat = stat;
    }

    public Buff(double percent, double flat, EntityStatName stat, boolean debuff) {
        this.magnitude = percent;
        this.value = flat;
        this.debuff = debuff;
        this.statName = stat;
    }

    public void startTimer() {
        //TODO: 2/17/2016
    }

    public EntityStatName getStatName() {
        return statName;
    }

    public void setStatName(EntityStatName statName) {
        this.statName = statName;
    }

    public void onTimerEnd() {
        stat.removeBonus(this);
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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
