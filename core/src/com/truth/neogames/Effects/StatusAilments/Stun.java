package com.truth.neogames.Effects.StatusAilments;


import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Stun extends Ailment {
    private int duration;
    private LivingEntity e;

    /**
     * Instantiates a new Stun.
     *
     * @param duration the duration
     */
    public Stun(int duration) {
        this.duration = duration;
    }

    /**
     * Instantiates a new Stun.
     *
     * @param duration the duration
     * @param e        the e
     */
    public Stun(int duration, LivingEntity e) {
        this.duration = duration;
        this.e = e;
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
        return "Stun{" +
                "duration=" + duration +
                ", e=" + e +
                '}';
    }
}
