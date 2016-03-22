package com.truth.neogames.Items.GearPackage.Weapons;

import com.truth.neogames.Enums.Affixes.Material;
import com.truth.neogames.Enums.Affixes.WeaponSuffix;
import com.truth.neogames.Enums.DamageType;
import com.truth.neogames.Enums.ElementalType;
import com.truth.neogames.Enums.WeaponType;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Items.GearPackage.CombatGear;
import com.truth.neogames.Utilities.RandomNumber;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A weapon.
 */
public class Weapon extends CombatGear {
    private double maxDamage;
    private double minDamage;
    private WeaponSuffix suffix;
    private WeaponType type;

    /*************
     * Constructors
     *
     * @param material the material
     * @param suffix   the suffix
     * @param type     the type
     */
    public Weapon(Material material, WeaponSuffix suffix, WeaponType type) {
        this.material = material;
        double avgDamage = material.getAvgDamage() * type.getDamageModifier();
        maxDamage = avgDamage + (avgDamage * type.getRangeModifier());
        minDamage = avgDamage - (avgDamage * type.getRangeModifier());
        this.suffix = suffix;
        this.type = type;
        slot = WornSlot.MAINHAND;
        assignName();
    }

    /**
     * Instantiates a new Weapon.
     *
     * @param slot     the slot
     * @param material the material
     * @param suffix   the suffix
     * @param type     the type
     */
    public Weapon(WornSlot slot, Material material, WeaponSuffix suffix, WeaponType type) {
        this.slot = slot;
        double avgDamage = material.getAvgDamage() * type.getDamageModifier();
        maxDamage = avgDamage + (avgDamage * type.getRangeModifier());
        minDamage = avgDamage - (avgDamage * type.getRangeModifier());
        this.suffix = suffix;
        this.type = type;
        setLevel(material.getLevel());
        assignName();
    }

    /*************
     * Getters and Setters
     *
     * @return the max damage
     */
    public double getMaxDamage() {
        return maxDamage;
    }

    /**
     * Sets max damage.
     *
     * @param maxDamage the max damage
     */
    public void setMaxDamage(double maxDamage) {
        this.maxDamage = maxDamage;
    }

    /**
     * Gets min damage.
     *
     * @return the min damage
     */
    public double getMinDamage() {
        return minDamage;
    }

    /**
     * Sets min damage.
     *
     * @param minDamage the min damage
     */
    public void setMinDamage(double minDamage) {
        this.minDamage = minDamage;
    }

    /**
     * Gets random damage.
     *
     * @return the random damage
     */
    public double getRandomDamage() {
        return (minDamage + ((maxDamage - minDamage) * RandomNumber.RANDOM.nextDouble()));
    }

    /**
     * Gets suffix.
     *
     * @return the suffix
     */
    public WeaponSuffix getSuffix() {
        return suffix;
    }

    /**
     * Sets suffix.
     *
     * @param suffix the suffix
     */
    public void setSuffix(WeaponSuffix suffix) {
        this.suffix = suffix;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public WeaponType getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(WeaponType type) {
        this.type = type;
    }

    /**
     * Gets attack style.
     *
     * @return the attack style
     */
    public DamageType getAttackStyle() {
        return type.getStyle();
    }

    /**
     * Gets crit chance.
     *
     * @return the crit chance
     */
    public double getCritChance() {
        return type.getCritChance();
    }

    /**
     * Gets range.
     *
     * @return the range
     */
    public int getRange() {
        return type.getRange();
    }

    /**
     * Gets elemental type.
     *
     * @return the elemental type
     */
    public ElementalType getElementalType() {
        return suffix.getElementalType();
    }

    /**
     * Assign name.
     */
    public void assignName() {
        String str = getMaterial().toString();
        str += " " + type;
        if (suffix != WeaponSuffix.NONE) {
            str += " of " + suffix;
        }
        name = str;
    }

    @Override
    public void assignDescription() {
        super.assignDescription();
        description += type.isTwoHanded() ? "Two-Handed" : "One-Handed";
        description += " Weapon" + '\n';
        description += "Damage: " + minDamage + " - " + maxDamage + '\n';
        description += "Attack Style: " + type.getStyle() + '\n';
        description += "Critical Chance: " + (type.getCritChance() * 100.0) + "%\n";
        description += "Attack Range: " + type.getRange() + '\n';
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "maxDamage=" + maxDamage +
                ", minDamage=" + minDamage +
                ", suffix=" + suffix +
                ", type=" + type +
                '}';
    }
}
