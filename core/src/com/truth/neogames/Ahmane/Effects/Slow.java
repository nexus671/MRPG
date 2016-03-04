package com.truth.neogames.Ahmane.Effects;


import com.truth.neogames.Ahmane.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Slow extends Effect {
    private int duration;
    private double magnitude;
    private LivingEntity e;

    public Slow(int duration, double magnitude) {
        this.duration = duration;
        this.magnitude = magnitude;
    }

    public Slow(int duration, double magnitude, LivingEntity e) {
        this.duration = duration;
        this.magnitude = magnitude;
        this.e = e;
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

    @Override
    public String toString() {
        return "Slow{" +
                "duration=" + duration +
                ", magnitude=" + magnitude +
                ", e=" + e +
                '}';
    }
}
