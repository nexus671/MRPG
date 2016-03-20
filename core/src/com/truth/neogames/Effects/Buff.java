package com.truth.neogames.Effects;


import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat;

/**
 * Created by acurr on 2/15/2016.
 * Class Description: Defines an effect that increases or decreases the value of an EntityStat.
 */
public class Buff extends Effect {
    private int duration;
    private double magnitude;
    private int value;
    private EntityStat stat;
    private EntityStatName statName;
    private boolean debuff;

    public Buff(int duration, double magnitude, int value, EntityStat stat, boolean debuff) {
        this.duration = duration;
        this.magnitude = magnitude;
        this.value = value;
        this.debuff = debuff;
        this.stat = stat;
        statName = stat.getStatName();
        assignDescription();
    }

    public Buff(int duration, int value, EntityStat stat, boolean debuff) {
        this.duration = duration;
        this.value = value;
        this.debuff = debuff;
        this.stat = stat;
        magnitude = 1.0;
        statName = stat.getStatName();
        assignDescription();
    }

    public Buff(int duration, double magnitude, EntityStat stat, boolean debuff) {
        this.duration = duration;
        this.magnitude = magnitude;
        this.debuff = debuff;
        this.stat = stat;
        value = 0;
        statName = stat.getStatName();
        assignDescription();
    }

    public Buff(double percent, int flat, EntityStatName stat, boolean debuff) {
        magnitude = percent;
        value = flat;
        this.debuff = debuff;
        statName = stat;
        duration = -1;
        assignDescription();
    }

    public Buff(int flat, EntityStatName stat, boolean debuff) {
        value = flat;
        this.debuff = debuff;
        statName = stat;
        duration = -1;
        magnitude = 1.0;
        assignDescription();
    }

    public Buff(double percent, EntityStatName stat, boolean debuff) {
        magnitude = percent;
        this.debuff = debuff;
        statName = stat;
        value = 0;
        duration = -1;
        assignDescription();
    }

    public void startTimer() {
        //TODO: 2/17/2016
    }

    public void assignDescription() {
        description = debuff ? "Decreases enemy's" : "Increases player's";
        description += " " + statName + " by ";
        boolean pctBuff = magnitude != 1.0;
        boolean flatBuff = value != 0;
        if (pctBuff) {
            description += (magnitude > 1) ? ((magnitude - 1) * 100) : magnitude;
            description += "%";
        }
        if (pctBuff && flatBuff) {
            description += " plus ";
        }
        if (flatBuff) {
            description += (value > 0) ? value : -value;
        }
        if (duration == -1) {
            description += " for " + duration + " turns.";
        } else {
            description += debuff ? " each turn for the remainder of a battle." : " while the item is equipped.";
        }
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
        return (double) value;
    }

    public void setValue(int value) {
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

    @Override
    public String toString() {
        return "Buff{" +
                "duration=" + duration +
                ", magnitude=" + magnitude +
                ", value=" + value +
                ", stat=" + stat +
                ", statName=" + statName +
                ", debuff=" + debuff +
                '}';
    }
}