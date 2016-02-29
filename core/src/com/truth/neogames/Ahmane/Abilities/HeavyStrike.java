package com.truth.neogames.Ahmane.Abilities;


import com.truth.neogames.Ahmane.Effects.Damage;
import com.truth.neogames.Ahmane.Effects.Stun;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Ahmane.Entities.SubTypes.Monster;
import com.truth.neogames.Enums.AbilityRange;
import com.truth.neogames.Enums.AbilityType;
import com.truth.neogames.Enums.AttackStyle;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by acurr on 2/13/2016.
 */
public class HeavyStrike extends ActiveAbility {

    private static AbilityRange r = AbilityRange.TOUCH;
    private int level;
    private int area = 1;
    private double basestunc = .05;
    private LivingEntity user;

    public HeavyStrike(int level, LivingEntity e) {
        this.name = "Heavy Strike";
        this.level = level;
        setType(AbilityType.TARGETED);
        setCost(calcCost());
        this.user = e;
    }

    public static AbilityRange getR() {
        return r;
    }

    public void use(ArrayList<Monster> targets) {
        LivingEntity target = targets.get(0);
        Damage damage = new Damage(getDamage(user), AttackStyle.CRUSHING, target);
        effects.add(damage);
        Random random = new Random();
        target.receiveDamage(damage);
        if (random.nextInt() > getstunc() * 100) {
            Stun stun = new Stun(1, target);
            effects.add(stun);
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int calcCost() {
        return (int) (Math.pow(2, level) * 5);
    }

    public double getstunc() {
        return basestunc + ((level - 1) * .2);
    }

    public double getDamage(LivingEntity e) {
        return (1.40 + ((level - 1) * .1)) * e.getBasicAttackDamage();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
