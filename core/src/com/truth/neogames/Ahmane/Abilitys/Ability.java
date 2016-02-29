package com.truth.neogames.Ahmane.Abilitys;

import com.truth.neogames.Ahmane.Effects.Effect;
import com.truth.neogames.Ahmane.Targets.Target;
import com.truth.neogames.Enums.AbilityRange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acurr on 2/17/2016.
 */
public abstract class Ability {
    private static AbilityRange r;
    protected String name;
    protected int level = 1;
    protected int cost;
    protected boolean passive;
    protected List<Effect> effects = new ArrayList<Effect>();
    protected List<Target> targets = new ArrayList<Target>();
    private int duration;
    private int area;

    public static AbilityRange getR() {
        return r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isPassive() {
        return passive;
    }

    public void setPassive(boolean passive) {
        this.passive = passive;
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
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
}
