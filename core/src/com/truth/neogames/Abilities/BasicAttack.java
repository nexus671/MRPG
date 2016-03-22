package com.truth.neogames.Abilities;


import com.truth.neogames.Effects.Damage;
import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.Enums.AbilityRange;
import com.truth.neogames.Enums.AbilityType;
import com.truth.neogames.Enums.DamageType;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Items.GearPackage.Weapons.Weapon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by acurr on 2/13/2016.
 */
public class BasicAttack extends ActiveAbility {

    private static final AbilityRange r = AbilityRange.TOUCH;
    private final LivingEntity user;
    private int level;
    private int duration;
    private int area = 1;


    /**
     * Instantiates a new Basic attack.
     *
     * @param level the level
     * @param e     the e
     */
    public BasicAttack(int level, LivingEntity e) {
        name = "Basic Attack";
        this.level = level;
        setType(AbilityType.TARGETED);
        cost = calcCost();
        user = e;
    }

    /**
     * Gets r.
     *
     * @return the r
     */
    public static AbilityRange getR() {
        return r;
    }

    @Override
    public void use(List<Monster> monsters) {
        boolean hasWeapon = !user.getWornGear().slotIsEmpty(WornSlot.MAINHAND);
        Damage damage;
        Collection<Damage> damages = new ArrayList<Damage>();
        if (hasWeapon) {
            Weapon weapon = (Weapon) user.getWornGear().getFromSlot(WornSlot.MAINHAND);
            damage = new Damage(getDamage(), weapon.getAttackStyle(), monsters.get(0));
        } else {
            damage = new Damage(getDamage(), DamageType.CRUSHING, monsters.get(0));
        }
        damages.add(damage);
        effects.add(damage);
        monsters.get(0).receiveDamage(damages);
    }

    /**
     * Calc cost int.
     *
     * @return the int
     */
    public int calcCost() {
        return (int) (Math.pow(2.0, (double) level) * 5.0);
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }


    /**
     * Gets damage.
     *
     * @return the damage
     */
    public double getDamage() {
        double basicDamage = 1.0;
        boolean hasWeapon = !user.getWornGear().slotIsEmpty(WornSlot.MAINHAND);
        if (hasWeapon) {
            Weapon weapon = (Weapon) user.getWornGear().getFromSlot(WornSlot.MAINHAND);
            basicDamage = weapon.getRandomDamage();
        }
        basicDamage += (user.getStats().getStrength().getCurrent() / 100.0) * basicDamage;
        return basicDamage;
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
        return "BasicAttack{" +
                "level=" + level +
                ", duration=" + duration +
                ", area=" + area +
                ", user=" + user +
                '}';
    }
}
