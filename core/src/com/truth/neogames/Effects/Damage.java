package com.truth.neogames.Effects;

import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Enums.DamageType;

/**
 * Created by acurr on 2/15/2016.
 */
public class Damage extends Effect {
    private double damage;
    private DamageType type;
    private LivingEntity e;

    /**
     * Instantiates a new Damage.
     *
     * @param damage the damage
     * @param type   the type
     */
    public Damage(double damage, DamageType type) {
        this.damage = damage;
        this.type = type;
    }

    /**
     * Instantiates a new Damage.
     *
     * @param damage the damage
     * @param type   the type
     * @param e      the e
     */
    public Damage(double damage, DamageType type, LivingEntity e) {
        this.damage = damage;
        this.type = type;
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

    @Override
    public String toString() {
        return "Damage{" +
                "damage=" + damage +
                ", type=" + type +
                ", e=" + e +
                '}';
    }
}
