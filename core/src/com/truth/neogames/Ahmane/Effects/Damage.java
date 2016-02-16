package com.truth.neogames.Ahmane.Effects;

import com.truth.neogames.Enums.AttackStyle;

/**
 * Created by acurr on 2/15/2016.
 */
public class Damage extends Effect {
    private double damage;
    private AttackStyle type;

    public Damage(double damage, AttackStyle type) {
        this.damage = damage;
        this.type = type;
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
}
