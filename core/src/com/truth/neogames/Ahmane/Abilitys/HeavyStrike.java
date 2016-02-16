package com.truth.neogames.Ahmane.Abilitys;


import com.truth.neogames.Ahmane.Effects.Damage;
import com.truth.neogames.Ahmane.Effects.Effect;
import com.truth.neogames.Ahmane.Effects.Stun;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Enums.AttackStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by acurr on 2/13/2016.
 */
public class HeavyStrike extends Ability {

    private int level;
    private int cost;
    private boolean passive = false;
    private int duration = 0;
    private int area = 1;
    private Ranges r = Ranges.TOUCH;
    private double basestunc = .05;

    private List<Effect> effects = new ArrayList<Effect>();


    public HeavyStrike(int level, LivingEntity e) {
        this.level = level;
        setCost(getCost());
        Damage damage = new Damage(getDamage(e), AttackStyle.CRUSHING);
        effects.add(damage);
        Random random = new Random();

        if (random.nextInt() > getstunc() * 100) {
            Stun stun = new Stun(1);
            effects.add(stun);
        }
    }

    public int getCost() {
        return (int) (Math.pow(2, level) * 5);
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getstunc() {
        return basestunc + ((level - 1) * .2);
    }

    public double getDamage(LivingEntity e) {
        return (1.40 + ((level - 1) * .1)) * e.getBasicAttackDamage();
    }

    public boolean isPassive() {
        return passive;
    }

    public void setPassive(boolean passive) {
        this.passive = passive;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Ranges getR() {
        return r;
    }

    public void setR(Ranges r) {
        this.r = r;
    }
}
