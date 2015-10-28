package com.truth.neogames.StatsPackage.EntityStatsPackage;

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
