package com.truth.neogames.Effects.StatusAilments;


import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Blind extends Ailment {
    private int duration;
    private double magnitude;
    private LivingEntity e;

    /**
     * Instantiates a new Blind.
     *
     * @param duration  the duration
     * @param magnitude the magnitude
     */
    public Blind(int duration, double magnitude) {
        this.duration = duration;
        this.magnitude = magnitude;
    }

    /**
     * Instantiates a new Blind.
     *
     * @param duration  the duration
     * @param magnitude the magnitude
     * @param e         the e
     */
    public Blind(int duration, double magnitude, LivingEntity e) {
        this.duration = duration;
        this.magnitude = magnitude;
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

    @Override
    public String toString() {
        return "Blind{" +
                "duration=" + duration +
                ", magnitude=" + magnitude +
                ", e=" + e +
                '}';
    }
}
