package com.truth.neogames.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.RPGObject;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines stats for a player or monster.
 */
public class EntityStats extends RPGObject {
    protected int level;
    protected double exp;
    protected com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat health;
    protected com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat healthRegen;
    protected com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat mana;
    protected com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat manaRegen;
    protected com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat strength;
    protected com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat constitution;
    protected com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat wisdom;
    protected com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat dexterity;
    protected DependentEntityStat speed;

    /*************
     * Constructors
     *************/

    public EntityStats() {
        level = 1;
        exp = 0.0;
        health = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.HEALTH, 100.0);
        healthRegen = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.HEALTHREGEN, 5.0);
        mana = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.MANA, 100.0);
        manaRegen = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.MANAREGEN, 10.0);
        strength = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.STRENGTH, 1.0);
        constitution = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.CONSTITUTION, 1.0);
        wisdom = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.WISDOM, 1.0);
        dexterity = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.DEXTERITY, 1.0);
        speed = new DependentEntityStat(EntityStatName.SPEED, 30.0);
        speed.addStat(dexterity);
    }

    public EntityStats(int level) {
        this.level = level;
        health = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.HEALTH, (double) (90 + (level * 10)));
        healthRegen = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.HEALTHREGEN, (double) (5 + level));
        mana = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.MANA, (double) (90 + (level * 10)));
        manaRegen = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.MANAREGEN, (double) (9 + level));
        strength = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.STRENGTH, (double) (1 + level));
        constitution = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.CONSTITUTION, (double) (1 + level));
        wisdom = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.WISDOM, (double) (1 + level));
        dexterity = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.DEXTERITY, (double) (1 + level));
        speed = new DependentEntityStat(EntityStatName.SPEED, (double) (30 + level));

    }

    public com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat getStat(EntityStatName name) {
        switch (name) {
            case HEALTH:
                return health;
            case HEALTHREGEN:
                return healthRegen;
            case MANA:
                return mana;
            case MANAREGEN:
                return manaRegen;
            case STRENGTH:
                return strength;
            case CONSTITUTION:
                return constitution;
            case WISDOM:
                return wisdom;
            case DEXTERITY:
                return dexterity;
            case SPEED:
                return speed;
            default:
                return null;
        }
    }

    public void setBaseStat(EntityStatName name, double value) {
        switch (name) {
            case HEALTH:
                health.setBaseMax(value);
                break;
            case HEALTHREGEN:
                healthRegen.setBaseMax(value);
                break;
            case MANA:
                mana.setBaseMax(value);
                break;
            case MANAREGEN:
                manaRegen.setBaseMax(value);
                break;
            case STRENGTH:
                strength.setBaseMax(value);
                break;
            case CONSTITUTION:
                constitution.setBaseMax(value);
                break;
            case WISDOM:
                wisdom.setBaseMax(value);
                break;
            case DEXTERITY:
                dexterity.setBaseMax(value);
                break;
            case SPEED:
                speed.setMax(value);
                break;
        }
    }

    public void setStat(EntityStatName name, double value) {
        switch (name) {
            case HEALTH:
                health.setMax(value);
                break;
            case HEALTHREGEN:
                healthRegen.setMax(value);
                break;
            case MANA:
                mana.setMax(value);
                break;
            case MANAREGEN:
                manaRegen.setMax(value);
                break;
            case STRENGTH:
                strength.setMax(value);
                break;
            case CONSTITUTION:
                constitution.setMax(value);
                break;
            case WISDOM:
                wisdom.setMax(value);
                break;
            case DEXTERITY:
                dexterity.setMax(value);
                break;
            case SPEED:
                speed.setMax(value);
                break;
        }
    }

    /*************
     * Getters and Setters
     *************/

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat getHealth() {
        return health;
    }

    public void setHealth(com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat health) {
        this.health = health;
    }

    public com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat getHealthRegen() {
        return healthRegen;
    }

    public void setHealthRegen(com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat healthRegen) {
        this.healthRegen = healthRegen;
    }

    public com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat getMana() {
        return mana;
    }

    public void setMana(com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat mana) {
        this.mana = mana;
    }

    public com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat getManaRegen() {
        return manaRegen;
    }

    public void setManaRegen(com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat manaRegen) {
        this.manaRegen = manaRegen;
    }

    public com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat getStrength() {
        return strength;
    }

    public void setStrength(com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat strength) {
        this.strength = strength;
    }

    public com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat getConstitution() {
        return constitution;
    }

    public void setConstitution(com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat constitution) {
        this.constitution = constitution;
    }

    public com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat getWisdom() {
        return wisdom;
    }

    public void setWisdom(com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat wisdom) {
        this.wisdom = wisdom;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public void setByLevel(int level) {
        this.level = level;
        health = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.HEALTH, (double) (90 + (level * 10)));
        healthRegen = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.HEALTHREGEN, (double) (5 + level));
        mana = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.MANA, (double) (90 + (level * 10)));
        manaRegen = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.MANAREGEN, (double) (9 + level));
        strength = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.STRENGTH, (double) (1 + level));
        constitution = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.CONSTITUTION, (double) (1 + level));
        wisdom = new com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat(EntityStatName.WISDOM, (double) (1 + level));
    }

    @Override
    public String toString() {
        return "EntityStats{" +
                "level=" + level +
                ", exp=" + exp +
                ", health=" + health +
                ", healthRegen=" + healthRegen +
                ", mana=" + mana +
                ", manaRegen=" + manaRegen +
                ", strength=" + strength +
                ", constitution=" + constitution +
                ", wisdom=" + wisdom +
                ", dexterity=" + dexterity +
                ", speed=" + speed +
                '}';
    }
}
