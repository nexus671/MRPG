package com.truth.neogames.Effects;

import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Enums.DamageType;

/**
 * Created by acurr on 2/15/2016.
 */
public class DamageOvertime extends Effect {
    private double damage;
    private DamageType type;
    private int duration;
    private LivingEntity e;

    /**
     * Instantiates a new Damage overtime.
     *
     * @param damage   the damage
     * @param type     the type
     * @param duration the duration
     */
    public DamageOvertime(double damage, DamageType type, int duration) {
        this.damage = damage;
        this.type = type;
        this.duration = duration;
    }

    /**
     * Instantiates a new Damage overtime.
     *
     * @param damage   the damage
     * @param type     the type
     * @param duration the duration
     * @param e        the e
     */
    public DamageOvertime(double damage, DamageType type, int duration, LivingEntity e) {
        this.damage = damage;
        this.type = type;
        this.duration = duration;
        this.e = e;

    }

    /**
     * Gets damage.
     *
     * @return the damage
     */
    public double getDamage() {
        return damage;
    }

    /**
     * Sets damage.
     *
     * @param damage the damage
     */
    public void setDamage(double damage) {
        this.damage = damage;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public DamageType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(DamageType type) {
        this.type = type;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "DamageOvertime{" +
                "damage=" + damage +
                ", type=" + type +
                ", duration=" + duration +
                ", e=" + e +
                '}';
    }
}
