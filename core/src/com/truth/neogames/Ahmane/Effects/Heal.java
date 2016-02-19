package com.truth.neogames.Ahmane.Effects;

import com.truth.neogames.Ahmane.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Heal extends Effect {
    private double heal;
    private LivingEntity e;

    public Heal(double heal) {
        this.heal = heal;
    }

    public Heal(double heal, LivingEntity e) {
        this.heal = heal;
        this.e = e;
    }

    public double getHeal() {
        return heal;
    }

    public void setHeal(double heal) {
        this.heal = heal;
    }
}
