package com.truth.neogames.Effects.StatusAilments;


import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Slow extends Ailment {
    private int duration;
    private double magnitude;
    private LivingEntity e;

    /**
     * Instantiates a new Slow.
     *
     * @param duration  the duration
     * @param magnitude the magnitude
     */
    public Slow(int duration, double magnitude, LivingEntity e) {
        super(e);
        this.duration = duration;
        this.magnitude = magnitude;
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
        return "Slow{" +
                "duration=" + duration +
                ", magnitude=" + magnitude +
                ", e=" + e +
                '}';
    }
}
