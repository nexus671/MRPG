package com.truth.neogames.Ahmane.Abilities;

import com.truth.neogames.Ahmane.Effects.Effect;
import com.truth.neogames.Enums.AbilityType;

import java.util.ArrayList;

/**
 * Created by Adam on 2/29/2016.
 * Class Description:
 */
public abstract class Ability {
    protected AbilityType type;
    protected String name;
    protected int level;
    protected ArrayList<Effect> effects = new ArrayList<Effect>();
    protected int cost;
    private int duration;

    public AbilityType getType() {
        return type;
    }

    public void setType(AbilityType type) {
        this.type = type;
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

    public ArrayList<Effect> getEffects() {
        return effects;
    }

    public void setEffects(ArrayList<Effect> effects) {
        this.effects = effects;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
