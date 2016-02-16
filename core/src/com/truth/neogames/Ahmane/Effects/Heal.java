package com.truth.neogames.Ahmane.Effects;

/**
 * Created by acurr on 2/15/2016.
 */
public class Heal extends Effect {
    private double heal;


    public Heal(double heal) {
        this.heal = heal;
    }

    public double getHeal() {
        return heal;
    }

    public void setHeal(double heal) {
        this.heal = heal;
    }
}
