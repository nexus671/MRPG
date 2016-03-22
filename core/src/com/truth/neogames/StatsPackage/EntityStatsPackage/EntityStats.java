package com.truth.neogames.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.RPGObject;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines stats for a player or monster.
 */
public class EntityStats extends RPGObject {
    /**
     * The Level.
     */
    protected int level;
    /**
     * The Exp.
     */
    protected double exp;
    /**
     * The Health.
     */
    protected EntityStat health;
    /**
     * The Health regen.
     */
    protected EntityStat healthRegen;
    /**
     * The Mana.
     */
    protected EntityStat mana;
    /**
     * The Mana regen.
     */
    protected EntityStat manaRegen;
    /**
     * The Strength.
     */
    protected EntityStat strength;
    /**
     * The Constitution.
     */
    protected EntityStat constitution;
    /**
     * The Wisdom.
     */
    protected EntityStat wisdom;
    /**
     * The Dexterity.
     */
    protected EntityStat dexterity;
    /**
     * The Speed.
     */
    protected DependentEntityStat speed;

    /*************
     * Constructors
     */
    public EntityStats() {
        level = 1;
        exp = 0.0;
        health = new EntityStat(EntityStatName.HEALTH, 100.0);
        healthRegen = new EntityStat(EntityStatName.HEALTHREGEN, 5.0);
        mana = new EntityStat(EntityStatName.MANA, 100.0);
        manaRegen = new EntityStat(EntityStatName.MANAREGEN, 10.0);
        strength = new EntityStat(EntityStatName.STRENGTH, 1.0);
        constitution = new EntityStat(EntityStatName.CONSTITUTION, 1.0);
        wisdom = new EntityStat(EntityStatName.WISDOM, 1.0);
        dexterity = new EntityStat(EntityStatName.DEXTERITY, 1.0);
        speed = new DependentEntityStat(EntityStatName.SPEED, 30.0);
        speed.addStat(dexterity);
    }

    /**
     * Instantiates a new Entity stats.
     *
     * @param level the level
     */
    public EntityStats(int level) {
        this.level = level;
        health = new EntityStat(EntityStatName.HEALTH, (double) (90 + (level * 10)));
        healthRegen = new EntityStat(EntityStatName.HEALTHREGEN, (double) (5 + level));
        mana = new EntityStat(EntityStatName.MANA, (double) (90 + (level * 10)));
        manaRegen = new EntityStat(EntityStatName.MANAREGEN, (double) (9 + level));
        strength = new EntityStat(EntityStatName.STRENGTH, (double) (1 + level));
        constitution = new EntityStat(EntityStatName.CONSTITUTION, (double) (1 + level));
        wisdom = new EntityStat(EntityStatName.WISDOM, (double) (1 + level));
        dexterity = new EntityStat(EntityStatName.DEXTERITY, (double) (1 + level));
        speed = new DependentEntityStat(EntityStatName.SPEED, (double) (30 + level));

    }

    /**
     * Gets stat.
     *
     * @param name the name
     * @return the stat
     */
    public EntityStat getStat(EntityStatName name) {
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

    /**
     * Sets base stat.
     *
     * @param name  the name
     * @param value the value
     */
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

    /**
     * Sets stat.
     *
     * @param name  the name
     * @param value the value
     */
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
     * Gets health.
     *
     * @return the health
     */
    public EntityStat getHealth() {
        return health;
    }

    /**
     * Sets health.
     *
     * @param health the health
     */
    public void setHealth(EntityStat health) {
        this.health = health;
    }

    /**
     * Gets health regen.
     *
     * @return the health regen
     */
    public EntityStat getHealthRegen() {
        return healthRegen;
    }

    /**
     * Sets health regen.
     *
     * @param healthRegen the health regen
     */
    public void setHealthRegen(EntityStat healthRegen) {
        this.healthRegen = healthRegen;
    }

    /**
     * Gets mana.
     *
     * @return the mana
     */
    public EntityStat getMana() {
        return mana;
    }

    /**
     * Sets mana.
     *
     * @param mana the mana
     */
    public void setMana(EntityStat mana) {
        this.mana = mana;
    }

    /**
     * Gets mana regen.
     *
     * @return the mana regen
     */
    public EntityStat getManaRegen() {
        return manaRegen;
    }

    /**
     * Sets mana regen.
     *
     * @param manaRegen the mana regen
     */
    public void setManaRegen(EntityStat manaRegen) {
        this.manaRegen = manaRegen;
    }

    /**
     * Gets strength.
     *
     * @return the strength
     */
    public EntityStat getStrength() {
        return strength;
    }

    /**
     * Sets strength.
     *
     * @param strength the strength
     */
    public void setStrength(EntityStat strength) {
        this.strength = strength;
    }

    /**
     * Gets constitution.
     *
     * @return the constitution
     */
    public EntityStat getConstitution() {
        return constitution;
    }

    /**
     * Sets constitution.
     *
     * @param constitution the constitution
     */
    public void setConstitution(EntityStat constitution) {
        this.constitution = constitution;
    }

    /**
     * Gets wisdom.
     *
     * @return the wisdom
     */
    public EntityStat getWisdom() {
        return wisdom;
    }

    /**
     * Sets wisdom.
     *
     * @param wisdom the wisdom
     */
    public void setWisdom(EntityStat wisdom) {
        this.wisdom = wisdom;
    }

    /**
     * Gets exp.
     *
     * @return the exp
     */
    public double getExp() {
        return exp;
    }

    /**
     * Sets exp.
     *
     * @param exp the exp
     */
    public void setExp(double exp) {
        this.exp = exp;
    }

    /**
     * Sets by level.
     *
     * @param level the level
     */
    public void setByLevel(int level) {
        this.level = level;
        health = new EntityStat(EntityStatName.HEALTH, (double) (90 + (level * 10)));
        healthRegen = new EntityStat(EntityStatName.HEALTHREGEN, (double) (5 + level));
        mana = new EntityStat(EntityStatName.MANA, (double) (90 + (level * 10)));
        manaRegen = new EntityStat(EntityStatName.MANAREGEN, (double) (9 + level));
        strength = new EntityStat(EntityStatName.STRENGTH, (double) (1 + level));
        constitution = new EntityStat(EntityStatName.CONSTITUTION, (double) (1 + level));
        wisdom = new EntityStat(EntityStatName.WISDOM, (double) (1 + level));
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
