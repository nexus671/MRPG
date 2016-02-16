package com.truth.neogames.Ahmane.Effects;


/**
 * Created by acurr on 2/15/2016.
 */
public class Blind extends Effect {
    private int duration;
    private double magnitude;

    public Blind(int duration, double magnitude) {
        this.duration = duration;
        this.magnitude = magnitude;
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
}
