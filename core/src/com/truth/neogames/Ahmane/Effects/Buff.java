package com.truth.neogames.Ahmane.Effects;


import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.Enums.EntityStatName;

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
        magnitude = 1;
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
        this.magnitude = percent;
        this.value = flat;
        this.debuff = debuff;
        this.statName = stat;
        duration = -1;
        assignDescription();
    }

    public Buff(int flat, EntityStatName stat, boolean debuff) {
        this.value = flat;
        this.debuff = debuff;
        this.statName = stat;
        duration = -1;
        magnitude = 1;
        assignDescription();
    }

    public Buff(double percent, EntityStatName stat, boolean debuff) {
        this.magnitude = percent;
        this.debuff = debuff;
        this.statName = stat;
        value = 0;
        duration = -1;
        assignDescription();
    }

    public void startTimer() {
        //TODO: 2/17/2016
    }

    public void assignDescription() {
        if (debuff)
            description = "Decreases enemy's";
        else
            description = "Increases player's";
        description += " " + statName + " by ";
        boolean pctBuff = magnitude != 1;
        boolean flatBuff = value != 0;
        if (pctBuff) {
            if (magnitude > 1)
                description += ((magnitude - 1) * 100);
            else
                description += magnitude;
            description += "%";
        }
        if (pctBuff && flatBuff) {
            description += " plus ";
        }
        if (flatBuff) {
            if (value > 0)
                description += value;
            else
                description += (-value);
        }
        if (duration == -1) {
            description += " for " + duration + " turns.";
        } else {
            if (debuff)
                description += " each turn for the remainder of a battle.";
            else
                description += " while the item is equipped.";
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
        return value;
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
}