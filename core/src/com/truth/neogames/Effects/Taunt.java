package com.truth.neogames.Effects;


import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Taunt extends Effect {
    private int duration;
    private LivingEntity e;

    public Taunt(int duration) {
        this.duration = duration;
    }

    public Taunt(int duration, LivingEntity e) {
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
        return "Taunt{" +
                "duration=" + duration +
                ", e=" + e +
                '}';
    }
}
