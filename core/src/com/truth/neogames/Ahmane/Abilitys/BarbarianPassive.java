package com.truth.neogames.Ahmane.Abilitys;



import com.truth.neogames.Ahmane.Effects.Buff;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Enums.AbilityRange;

/**
 * Created by acurr on 2/13/2016.
 */
public class BarbarianPassive extends Ability {

    private static AbilityRange r = AbilityRange.TOUCH;
    private int level;
    private int cost;
    private boolean passive = true;
    private int duration = 0;
    private int area = 1;

    public BarbarianPassive(int level, LivingEntity e) {
        this.name = "BarbarianPassive";
        this.level = level;
        double modifier = .5 + (.1 * level);
        Buff buff = new Buff(-1, modifier, 0, e.getStats().getStrength(), false);
        effects.add(buff);
        e.getStats().getStrength().addBonus(buff);
    }

    public static AbilityRange getR() {
        return r;
    }

    public void setR(AbilityRange r) {
        this.r = r;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCost() {
        return (int) (Math.pow(2, level) * 5);
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
