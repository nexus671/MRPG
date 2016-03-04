package com.truth.neogames.Ahmane.Effects;

import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Enums.DamageType;

/**
 * Created by acurr on 2/15/2016.
 */
public class Damage extends Effect {
    private double damage;
    private DamageType type;
    private LivingEntity e;

    public Damage(double damage, DamageType type) {
        this.damage = damage;
        this.type = type;
    }

    public Damage(double damage, DamageType type, LivingEntity e) {
        this.damage = damage;
        this.type = type;
        this.e = e;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public DamageType getType() {
        return type;
    }

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
