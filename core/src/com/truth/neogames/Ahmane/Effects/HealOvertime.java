package com.truth.neogames.Ahmane.Effects;

import com.truth.neogames.Ahmane.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class HealOvertime extends Effect {
    private double heal;
    private int duration;
    private LivingEntity e;
    public HealOvertime(double heal, int duration) {
        this.heal = heal;
        this.duration = duration;
    }

    public HealOvertime(double heal, int duration, LivingEntity e) {
        this.heal = heal;
        this.duration = duration;
        this.e = e;
    }

    public double getHeal() {
        return heal;
    }

    public void setHeal(double heal) {
        this.heal = heal;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
