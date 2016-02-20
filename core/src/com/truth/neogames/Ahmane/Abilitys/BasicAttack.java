package com.truth.neogames.Ahmane.Abilitys;


import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Ahmane.Effects.Damage;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Enums.AbilityRange;
import com.truth.neogames.Enums.AttackStyle;
import com.truth.neogames.Enums.WornSlot;

/**
 * Created by acurr on 2/13/2016.
 */
public class BasicAttack extends Ability {

    private static AbilityRange r = AbilityRange.TOUCH;
    private int level;
    private int cost;
    private boolean passive = false;
    private int duration = 0;
    private int area = 1;
    private LivingEntity user;


    public BasicAttack(int level, LivingEntity e) {
        this.level = level;
        setCost(getCost());
        this.user = e;
    }

    public static AbilityRange getR() {
        return r;
    }

    public void setR(AbilityRange r) {
        this.r = r;
    }

    public void use(LivingEntity target) {
        Weapon weapon;
        boolean hasWeapon = !user.getWornGear().slotIsEmpty(WornSlot.MAINHAND);
        Damage damage;
        if (hasWeapon) {
            weapon = (Weapon) user.getWornGear().getFromSlot(WornSlot.MAINHAND);
            damage = new Damage(getDamage(), weapon.getAttackStyle(), target);
        } else {
            damage = new Damage(getDamage(), AttackStyle.CRUSHING, target);
        }

        effects.add(damage);
        target.recieveDamage(damage);
    }

    public int getCost() {
        return (int) (Math.pow(2, level) * 5);
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
