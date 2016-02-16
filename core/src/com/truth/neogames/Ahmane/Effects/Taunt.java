package com.truth.neogames.Ahmane.Effects;


/**
 * Created by acurr on 2/15/2016.
 */
public class Taunt extends Effect {
    private int duration;

    public Taunt(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
