package com.truth.neogames.Effects;

import com.truth.neogames.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Heal extends Effect {
    private double heal;
    private LivingEntity e;

    /**
     * Instantiates a new Heal.
     *
     * @param heal the heal
     */
    public Heal(double heal) {
        this.heal = heal;
    }

    /**
     * Instantiates a new Heal.
     *
     * @param heal the heal
     * @param e    the e
     */
    public Heal(double heal, LivingEntity e) {
        this.heal = heal;
        this.e = e;
    }

    /**
     * Gets heal.
     *
     * @return the heal
     */
    public double getHeal() {
        return heal;
    }

    /**
     * Sets heal.
     *
     * @param heal the heal
     */
    public void setHeal(double heal) {
        this.heal = heal;
    }

    @Override
    public String toString() {
        return "Heal{" +
                "heal=" + heal +
                ", e=" + e +
                '}';
    }
}
