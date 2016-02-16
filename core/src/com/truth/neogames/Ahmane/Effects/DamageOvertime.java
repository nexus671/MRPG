package com.truth.neogames.Ahmane.Effects;

import com.truth.neogames.Enums.AttackStyle;

/**
 * Created by acurr on 2/15/2016.
 */
public class DamageOvertime extends Effect {
    private double damage;
    private AttackStyle type;
    private int duration;

    public DamageOvertime(double damage, AttackStyle type, int duration) {
        this.damage = damage;
        this.type = type;
        this.duration = duration;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public AttackStyle getType() {
        return type;
    }

    public void setType(AttackStyle type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
