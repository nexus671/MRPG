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

    /**
     * Instantiates a new Buff.
     *
     * @param duration  the duration
     * @param magnitude the magnitude
     * @param value     the value
     * @param stat      the stat
     * @param debuff    the debuff
     */
    public Buff(int duration, double magnitude, int value, EntityStat stat, boolean debuff) {
        this.duration = duration;
        this.magnitude = magnitude;
        this.value = value;
        this.debuff = debuff;
        this.stat = stat;
        statName = stat.getStatName();
        assignDescription();
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        Destroy();
                    }
                },
                duration * 1000
        );
    }

    /**
     * Instantiates a new Buff.
     *
     * @param duration the duration
     * @param value    the value
     * @param stat     the stat
     * @param debuff   the debuff
     */
    public Buff(int duration, int value, EntityStat stat, boolean debuff) {
        this.duration = duration;
        this.value = value;
        this.debuff = debuff;
        this.stat = stat;
        magnitude = 1.0;
        statName = stat.getStatName();
        assignDescription();
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        Destroy();
                    }
                },
                duration * 1000
        );
    }

    /**
     * Instantiates a new Buff.
     *
     * @param duration  the duration
     * @param magnitude the magnitude
     * @param stat      the stat
     * @param debuff    the debuff
     */
    public Buff(int duration, double magnitude, EntityStat stat, boolean debuff) {
        this.duration = duration;
        this.magnitude = magnitude;
        this.debuff = debuff;
        this.stat = stat;
        value = 0;
        statName = stat.getStatName();
        assignDescription();
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        Destroy();
                    }
                },
                duration * 1000
        );
    }

    /**
     * Instantiates a new Buff.
     *
     * @param percent the percent
     * @param flat    the flat
     * @param stat    the stat
     * @param debuff  the debuff
     */
    public Buff(double percent, int flat, EntityStatName stat, boolean debuff) {
        magnitude = percent;
        value = flat;
        this.debuff = debuff;
        statName = stat;
        duration = -1;
        assignDescription();
    }

    /**
     * Instantiates a new Buff.
     *
     * @param flat   the flat
     * @param stat   the stat
     * @param debuff the debuff
     */
    public Buff(int flat, EntityStatName stat, boolean debuff) {
        value = flat;
        this.debuff = debuff;
        statName = stat;
        duration = -1;
        magnitude = 1.0;
        assignDescription();
    }

    /**
     * Instantiates a new Buff.
     *
     * @param percent the percent
     * @param stat    the stat
     * @param debuff  the debuff
     */
    public Buff(double percent, EntityStatName stat, boolean debuff) {
        magnitude = percent;
        this.debuff = debuff;
        statName = stat;
        value = 0;
        duration = -1;
        assignDescription();
    }

    public void Destroy() {
        stat.removeBonus(this);
    }

    /**
     * Assign description.
     */
    public void assignDescription() {
        description = debuff ? "Decreases enemy's" : "Increases player's";
        description += " " + statName + " by ";
        boolean pctBuff = magnitude != 1.0;
        boolean flatBuff = value != 0;
        if (pctBuff) {
            description += (magnitude > 1.0) ? ((magnitude - 1.0) * 100.0) : magnitude;
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

    /**
     * Gets stat name.
     *
     * @return the stat name
     */
    public EntityStatName getStatName() {
        return statName;
    }

    /**
     * Sets stat name.
     *
     * @param statName the stat name
     */
    public void setStatName(EntityStatName statName) {
        this.statName = statName;
    }

    /**
     * On timer end.
     */
    public void onTimerEnd() {
        stat.removeBonus(this);
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
     * Gets magnitude.
     *
     * @return the magnitude
     */
    public double getMagnitude() {
        return magnitude;
    }

    /**
     * Sets magnitude.
     *
     * @param magnitude the magnitude
     */
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public double getValue() {
        return (double) value;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets stat.
     *
     * @return the stat
     */
    public EntityStat getStat() {
        return stat;
    }

    /**
     * Sets stat.
     *
     * @param stat the stat
     */
    public void setStat(EntityStat stat) {
        this.stat = stat;
    }

    /**
     * Is debuff boolean.
     *
     * @return the boolean
     */
    public boolean isDebuff() {
        return debuff;
    }

    /**
     * Sets debuff.
     *
     * @param debuff the debuff
     */
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