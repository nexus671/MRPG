package com.truth.neogames.Abilities;

import com.truth.neogames.Effects.Buff;
import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Enums.AbilityRange;
import com.truth.neogames.Enums.AbilityType;

/**
 * Created by acurr on 2/13/2016.
 */
public class BarbarianPassive extends PassiveAbility {

    private static final AbilityRange RANGE = AbilityRange.TOUCH;
    private int level;
    private int duration;
    private int area = 1;

    /**
     * Instantiates a new Barbarian passive.
     *
     * @param level the level
     * @param e     the e
     */
    public BarbarianPassive(int level, LivingEntity e) {
        name = "Barbarian Passive";
        setType(AbilityType.PASSIVE);
        cost = 0;
        double modifier = 0.5 + (0.1 * (double) level);
        Buff buff = new Buff(-1, modifier, 0, e.getStats().getStrength(), false);
        effects.add(buff);

        this.level = level;
        e.getStats().getStrength().addBonus(buff);
    }

    /**
     * Gets range.
     *
     * @return the range
     */
    public static AbilityRange getRange() {
        return RANGE;
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
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int getArea() {
        return area;
    }

    /**
     * Sets area.
     *
     * @param area the area
     */
    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "BarbarianPassive{" +
                "level=" + level +
                ", duration=" + duration +
                ", area=" + area +
                '}';
    }
}
