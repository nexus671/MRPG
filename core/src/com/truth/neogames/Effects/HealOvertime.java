package com.truth.neogames.Effects;

import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class HealOvertime extends Effect {
    private double heal;
    private int duration;
    private LivingEntity e;

    /**
     * Instantiates a new Heal overtime.
     *
     * @param heal     the heal
     * @param duration the duration
     */
    public HealOvertime(double heal, int duration) {
        this.heal = heal;
        this.duration = duration;
    }

    /**
     * Instantiates a new Heal overtime.
     *
     * @param heal     the heal
     * @param duration the duration
     * @param e        the e
     */
    public HealOvertime(double heal, int duration, LivingEntity e) {
        this.heal = heal;
        this.duration = duration;
        this.e = e;
    }

    /**
     * Gets heal.
     *
     * @return the heal
     */
    public double getHeal() {
        return heal;
    }

    /**
     * Sets heal.
     *
     * @param heal the heal
     */
    public void setHeal(double heal) {
        this.heal = heal;
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

    @Override
    public String toString() {
        return "HealOvertime{" +
                "heal=" + heal +
                ", duration=" + duration +
                ", e=" + e +
                '}';
    }
}
