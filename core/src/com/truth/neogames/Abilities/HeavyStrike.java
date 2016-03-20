package com.truth.neogames.Abilities;


import com.truth.neogames.Effects.Damage;
import com.truth.neogames.Effects.StatusAilments.Stun;
import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.Enums.AbilityRange;
import com.truth.neogames.Enums.AbilityType;
import com.truth.neogames.Enums.DamageType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Created by acurr on 2/13/2016.
 */
public class HeavyStrike extends ActiveAbility {

    private static final AbilityRange r = AbilityRange.TOUCH;
    private final double basestunc = 0.05;
    private final LivingEntity user;
    private int level;
    private int area = 1;

    public HeavyStrike(int level, LivingEntity e) {
        name = "Heavy Strike";
        this.level = level;
        setType(AbilityType.TARGETED);
        cost = calcCost();
        user = e;
    }

    public static AbilityRange getR() {
        return r;
    }

    @Override
    public void use(List<Monster> targets) {
        LivingEntity target = targets.get(0);
        Damage damage = new Damage(getDamage(user), DamageType.CRUSHING, target);
        Collection<Damage> damages = new ArrayList<Damage>();
        damages.add(damage);
        effects.add(damage);
        Random random = new Random();
        target.receiveDamage(damages);
        if ((double) random.nextInt() > (getstunc() * 100.0)) {
            Stun stun = new Stun(1, target);
            target.addAliment(stun);
            effects.add(stun);
        }
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int calcCost() {
        return (int) (Math.pow(2.0, (double) level) * 5.0);
    }

    public double getstunc() {
        return basestunc + ((double) (level - 1) * 0.2);
    }

    public double getDamage(LivingEntity e) {
        return (1.40 + ((double) (level - 1) * 0.1)) * e.getBasicAttackDamage();
    }

    @Override
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "HeavyStrike{" +
                "level=" + level +
                ", area=" + area +
                ", basestunc=" + basestunc +
                ", user=" + user +
                '}';
    }
}
