package com.truth.neogames.Effects.StatusAilments;


import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Root extends Ailment {
    private int duration;
    private LivingEntity e;

    /**
     * Instantiates a new Root.
     *
     * @param duration the duration
     */
    public Root(int duration) {
        this.duration = duration;
    }

    /**
     * Instantiates a new Root.
     *
     * @param duration the duration
     * @param e        the e
     */
    public Root(int duration, LivingEntity e) {
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
        return "Root{" +
                "duration=" + duration +
                ", e=" + e +
                '}';
    }
}
