package com.truth.neogames.StatsPackage.EntityStatsPackage;

import com.truth.neogames.StatsPackage.Stats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines stats for a player or monster.
 */
public class EntityStats extends Stats {
    protected int level;
    protected double maxHealth, currentHealth;
    protected double maxHealthRegen, currentHealthRegen;
    protected double maxMana, currentMana;
    protected double maxManaRegen, currentManaRegen;
    protected double maxStrength, currentStrength;
    protected double maxConstitution, currentConstitution;
    protected double maxWisdom, currentWisdom;
    protected double maxIntelligence, currentIntelligence;
    protected double maxLuck, currentLuck;

    /************* Constructors *************/
    public EntityStats() {

    }
    public EntityStats(int level) {
        this.level = level;
    }

    /************* Getters *************/

    public int getLevel() {
        return this.level;
    }

    /*************
     * Setters
     *************/

    public void setLevel(int level) {
        this.level = level;
    }

    public double getMaxHealth() {
        return this.maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getCurrentHealth() {
        return this.currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }

    public double getMaxHealthRegen() {
        return this.maxHealthRegen;
    }

    public void setMaxHealthRegen(double maxHealthRegen) {
        this.maxHealthRegen = maxHealthRegen;
    }

    public double getCurrentHealthRegen() {
        return this.currentHealthRegen;
    }

    public void setCurrentHealthRegen(double currentHealthRegen) {
        this.currentHealthRegen = currentHealthRegen;
    }

    public double getMaxMana() {
        return this.maxMana;
    }

    public void setMaxMana(double maxMana) {
        this.maxMana = maxMana;
    }

    public double getCurrentMana() {
        return this.currentMana;
    }

    public void setCurrentMana(double currentMana) {
        this.currentMana = currentMana;
    }

    public double getMaxManaRegen() {
        return this.maxManaRegen;
    }

    public void setMaxManaRegen(double maxManaRegen) {
        this.maxManaRegen = maxManaRegen;
    }

    public double getCurrentManaRegen() {
        return this.currentManaRegen;
    }

    public void setCurrentManaRegen(double currentManaRegen) {
        this.currentManaRegen = currentManaRegen;
    }

    public double getMaxStrength() {
        return this.maxStrength;
    }

    public void setMaxStrength(double maxStrength) {
        this.maxStrength = maxStrength;
    }

    public double getCurrentStrength() {
        return this.currentStrength;
    }

    public void setCurrentStrength(double currentStrength) {
        this.currentStrength = currentStrength;
    }

    public double getMaxConstitution() {
        return this.maxConstitution;
    }

    public void setMaxConstitution(double maxConstitution) {
        this.maxConstitution = maxConstitution;
    }

    public double getCurrentConstitution() {
        return this.currentConstitution;
    }

    public void setCurrentConstitution(double currentConstitution) {
        this.currentConstitution = currentConstitution;
    }

    public double getMaxWisdom() {
        return this.maxWisdom;
    }

    public void setMaxWisdom(double maxWisdom) {
        this.maxWisdom = maxWisdom;
    }

    public double getCurrentWisdom() {
        return this.currentWisdom;
    }

    public void setCurrentWisdom(double currentWisdom) {
        this.currentWisdom = currentWisdom;
    }

    public double getMaxIntelligence() {
        return this.maxIntelligence;
    }

    public void setMaxIntelligence(double maxIntelligence) {
        this.maxIntelligence = maxIntelligence;
    }

    public double getCurrentIntelligence() {
        return this.currentIntelligence;
    }

    public void setCurrentIntelligence(double currentIntelligence) {
        this.currentIntelligence = currentIntelligence;
    }

    public double getMaxLuck() {
        return this.maxLuck;
    }

    public void setMaxLuck(double maxLuck) {
        this.maxLuck = maxLuck;
    }

    public double getCurrentLuck() {
        return this.currentLuck;
    }

    public void setCurrentLuck(double currentLuck) {
        this.currentLuck = currentLuck;
    }
}
