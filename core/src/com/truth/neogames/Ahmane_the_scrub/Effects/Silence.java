package com.truth.neogames.Ahmane_the_scrub.Effects;


/**
 * Created by acurr on 2/15/2016.
 */
public class Silence extends Effect {
    private int duration;

    public Silence(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
