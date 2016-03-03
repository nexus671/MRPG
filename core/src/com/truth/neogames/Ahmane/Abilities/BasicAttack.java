package com.truth.neogames.Ahmane.Abilities;


import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Ahmane.Effects.Damage;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Ahmane.Entities.SubTypes.Monster;
import com.truth.neogames.Enums.AbilityRange;
import com.truth.neogames.Enums.AbilityType;
import com.truth.neogames.Enums.DamageType;
import com.truth.neogames.Enums.WornSlot;

import java.util.ArrayList;

/**
 * Created by acurr on 2/13/2016.
 */
public class BasicAttack extends ActiveAbility {

    private static final AbilityRange r = AbilityRange.TOUCH;
    private int level;
    private int duration = 0;
    private int area = 1;
    private LivingEntity user;


    public BasicAttack(int level, LivingEntity e) {
        this.name = "Basic Attack";
        this.level = level;
        setType(AbilityType.TARGETED);
        setCost(calcCost());
        this.user = e;
    }

    public static AbilityRange getR() {
        return r;
    }

    public void use(ArrayList<Monster> monsters) {
        Weapon weapon;
        boolean hasWeapon = !user.getWornGear().slotIsEmpty(WornSlot.MAINHAND);
        Damage damage;
        ArrayList<Damage> damages = new ArrayList<Damage>();
        if (hasWeapon) {
            weapon = (Weapon) user.getWornGear().getFromSlot(WornSlot.MAINHAND);
            damage = new Damage(getDamage(), weapon.getAttackStyle(), monsters.get(0));
        } else {
            damage = new Damage(getDamage(), DamageType.CRUSHING, monsters.get(0));
        }
        damages.add(damage);
        effects.add(damage);
        monsters.get(0).receiveDamage(damages);
    }

    public int calcCost() {
        return (int) (Math.pow(2, level) * 5);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public double getDamage() {
        Weapon weapon;
        double basicDamage = 1;
        boolean hasWeapon = !user.getWornGear().slotIsEmpty(WornSlot.MAINHAND);
        if (hasWeapon) {
            weapon = (Weapon) user.getWornGear().getFromSlot(WornSlot.MAINHAND);
            basicDamage = weapon.getRandomDamage();
        }
        basicDamage += (user.getStats().getStrength().getCurrent() / 100) * basicDamage;
        return basicDamage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
