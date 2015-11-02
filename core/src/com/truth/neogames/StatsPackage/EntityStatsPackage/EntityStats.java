package com.truth.neogames.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Enums.StatName;
import com.truth.neogames.StatsPackage.Stats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines stats for a player or monster.
 */
public class EntityStats extends Stats {
    protected int level;
    protected EntityStat health;
    protected EntityStat healthRegen;
    protected EntityStat mana;
    protected EntityStat manaRegen;
    protected EntityStat strength;
    protected EntityStat constitution;
    protected EntityStat wisdom;
    protected EntityStat intelligence;
    protected EntityStat luck;

    /************* Constructors *************/

    public EntityStats() {
        level = 1;
        //TODO: Create a file with numbers for initializing stat values
    }

    public EntityStat get(StatName name) {
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
            case INTELLIGENCE:
                return intelligence;
            case LUCK:
                return luck;
            default:
                return null;
        }
    }

    public void setStat(StatName name, double value) {
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
            case INTELLIGENCE:
                intelligence.setMax(value);
                break;
            case LUCK:
                luck.setMax(value);
                break;
        }
    }

    /*************
     * Getters and Setters
     *************/

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public EntityStat getHealth() {
        return health;
    }

    public void setHealth(EntityStat health) {
        this.health = health;
    }

    public EntityStat getHealthRegen() {
        return healthRegen;
    }

    public void setHealthRegen(EntityStat healthRegen) {
        this.healthRegen = healthRegen;
    }

    public EntityStat getMana() {
        return mana;
    }

    public void setMana(EntityStat mana) {
        this.mana = mana;
    }

    public EntityStat getManaRegen() {
        return manaRegen;
    }

    public void setManaRegen(EntityStat manaRegen) {
        this.manaRegen = manaRegen;
    }

    public EntityStat getStrength() {
        return strength;
    }

    public void setStrength(EntityStat strength) {
        this.strength = strength;
    }

    public EntityStat getConstitution() {
        return constitution;
    }

    public void setConstitution(EntityStat constitution) {
        this.constitution = constitution;
    }

    public EntityStat getWisdom() {
        return wisdom;
    }

    public void setWisdom(EntityStat wisdom) {
        this.wisdom = wisdom;
    }

    public EntityStat getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(EntityStat intelligence) {
        this.intelligence = intelligence;
    }

    public EntityStat getLuck() {
        return luck;
    }

    public void setLuck(EntityStat luck) {
        this.luck = luck;
    }
}
