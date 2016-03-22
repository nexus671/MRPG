package com.truth.neogames.Effects;


import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Creation extends Effect {
    private int duration;
    private LivingEntity e;

    /**
     * Instantiates a new Creation.
     *
     * @param duration the duration
     */
    public Creation(int duration) {
        this.duration = duration;
    }

    /**
     * Instantiates a new Creation.
     *
     * @param duration the duration
     * @param e        the e
     */
    public Creation(int duration, LivingEntity e) {
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
        return "Creation{" +
                "duration=" + duration +
                ", e=" + e +
                '}';
    }
}
