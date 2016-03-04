package com.truth.neogames.Ahmane.Effects;


import com.truth.neogames.Ahmane.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Creation extends Effect {
    private int duration;
    private LivingEntity e;

    public Creation(int duration) {
        this.duration = duration;
    }

    public Creation(int duration, LivingEntity e) {
        this.duration = duration;
        this.e = e;
    }

    public int getDuration() {
        return duration;
    }

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
