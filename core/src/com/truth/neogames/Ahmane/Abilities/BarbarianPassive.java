package com.truth.neogames.Ahmane.Abilities;

import com.truth.neogames.Ahmane.Effects.Buff;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Enums.AbilityRange;
import com.truth.neogames.Enums.AbilityType;

/**
 * Created by acurr on 2/13/2016.
 */
public class BarbarianPassive extends PassiveAbility {

    private static AbilityRange range = AbilityRange.TOUCH;
    private int level;
    private int duration = 0;
    private int area = 1;

    public BarbarianPassive(int level, LivingEntity e) {
        this.name = "Barbarian Passive";
        setType(AbilityType.PASSIVE);
        setCost(0);
        double modifier = .5 + (.1 * level);
        Buff buff = new Buff(-1, modifier, 0, e.getStats().getStrength(), false);
        effects.add(buff);

        this.level = level;
        e.getStats().getStrength().addBonus(buff);
    }

    public static AbilityRange getRange() {
        return range;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCost(int cost) {
        this.cost = cost;
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
