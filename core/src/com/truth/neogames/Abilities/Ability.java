package com.truth.neogames.Abilities;

import com.truth.neogames.Effects.Effect;
import com.truth.neogames.Enums.AbilityType;
import com.truth.neogames.RPGObject;

import java.util.ArrayList;

/**
 * Created by Adam on 2/29/2016.
 * Class Description:
 */
public abstract class Ability extends RPGObject {
    /**
     * The Type.
     */
    protected AbilityType type;
    /**
     * The Level.
     */
    protected int level;
    /**
     * The Effects.
     */
    protected ArrayList<Effect> effects = new ArrayList<Effect>();
    /**
     * The Cost.
     */
    protected int cost;
    private int duration;
    private int area;


    /**
     * Gets type.
     *
     * @return the type
     */
    public AbilityType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(AbilityType type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets effects.
     *
     * @return the effects
     */
    public ArrayList<Effect> getEffects() {
        return effects;
    }

    /**
     * Sets effects.
     *
     * @param effects the effects
     */
    public void setEffects(ArrayList<Effect> effects) {
        this.effects = effects;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Gets cost.
     *
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * Sets cost.
     *
     * @param cost the cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "type=" + type +
                ", level=" + level +
                ", effects=" + effects +
                ", cost=" + cost +
                ", duration=" + duration +
                ", area=" + area +
                '}';
    }
}
