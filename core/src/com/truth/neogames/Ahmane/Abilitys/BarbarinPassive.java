package com.truth.neogames.Ahmane.Abilitys;


import com.truth.neogames.Ahmane.Effects.Effect;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Enums.AbilityRange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acurr on 2/13/2016.
 */
public class BarbarinPassive extends Ability {

    private int level;
    private int cost;
    private boolean passive = false;
    private int duration = 0;
    private int area = 1;
    private AbilityRange r = AbilityRange.TOUCH;
    private double basestunc = .05;

    private List<Effect> effects = new ArrayList<Effect>();


    public BarbarinPassive(int level, LivingEntity e) {
        this.level = level;
        double modifier;
        modifier = 1.5 + (.1 * level);
        //PercentBuff buff = new PercentBuff(-1,modifier,e.g,false);
        //effects.add();
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

    public AbilityRange getR() {
        return r;
    }

    public void setR(AbilityRange r) {
        this.r = r;
    }
}
