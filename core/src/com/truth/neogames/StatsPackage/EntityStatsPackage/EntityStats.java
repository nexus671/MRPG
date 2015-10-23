package com.truth.neogames.StatsPackage.EntityStatsPackage;

import com.truth.neogames.StatsPackage.Stats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines stats for a player or monster.
 */
public class EntityStats extends Stats {
    private int level;
    private double maxHealth, currentHealth;
    private double maxHealthRegen, currentHealthRegen;
    private double maxMana, currentMana;
    private double maxManaRegen, currentManaRegen;
    private double maxStrength, currentStrength;
    private double maxConstitution, currentConstitution;
    private double maxWisdom, currentWisdom;
    private double maxIntelligence, currentIntelligence;
    private double maxLuck, currentLuck;

    /************* Constructors *************/
    public EntityStats() {

    }
    public EntityStats(int level) {
        this.level = level;
    }

    /************* Getters *************/

    public int getLevel() {
        return level;
    }

    /*************
     * Setters
     *************/

    public void setLevel(int level) {
        this.level = level;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }

    public double getMaxHealthRegen() {
        return maxHealthRegen;
    }

    public void setMaxHealthRegen(double maxHealthRegen) {
        this.maxHealthRegen = maxHealthRegen;
    }

    public double getCurrentHealthRegen() {
        return currentHealthRegen;
    }

    public void setCurrentHealthRegen(double currentHealthRegen) {
        this.currentHealthRegen = currentHealthRegen;
    }

    public double getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(double maxMana) {
        this.maxMana = maxMana;
    }

    public double getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(double currentMana) {
        this.currentMana = currentMana;
    }

    public double getMaxManaRegen() {
        return maxManaRegen;
    }

    public void setMaxManaRegen(double maxManaRegen) {
        this.maxManaRegen = maxManaRegen;
    }

    public double getCurrentManaRegen() {
        return currentManaRegen;
    }

    public void setCurrentManaRegen(double currentManaRegen) {
        this.currentManaRegen = currentManaRegen;
    }

    public double getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(double maxStrength) {
        this.maxStrength = maxStrength;
    }

    public double getCurrentStrength() {
        return currentStrength;
    }

    public void setCurrentStrength(double currentStrength) {
        this.currentStrength = currentStrength;
    }

    public double getMaxConstitution() {
        return maxConstitution;
    }

    public void setMaxConstitution(double maxConstitution) {
        this.maxConstitution = maxConstitution;
    }

    public double getCurrentConstitution() {
        return currentConstitution;
    }

    public void setCurrentConstitution(double currentConstitution) {
        this.currentConstitution = currentConstitution;
    }

    public double getMaxWisdom() {
        return maxWisdom;
    }

    public void setMaxWisdom(double maxWisdom) {
        this.maxWisdom = maxWisdom;
    }

    public double getCurrentWisdom() {
        return currentWisdom;
    }

    public void setCurrentWisdom(double currentWisdom) {
        this.currentWisdom = currentWisdom;
    }

    public double getMaxIntelligence() {
        return maxIntelligence;
    }

    public void setMaxIntelligence(double maxIntelligence) {
        this.maxIntelligence = maxIntelligence;
    }

    public double getCurrentIntelligence() {
        return currentIntelligence;
    }

    public void setCurrentIntelligence(double currentIntelligence) {
        this.currentIntelligence = currentIntelligence;
    }

    public double getMaxLuck() {
        return maxLuck;
    }

    public void setMaxLuck(double maxLuck) {
        this.maxLuck = maxLuck;
    }

    public double getCurrentLuck() {
        return currentLuck;
    }

    public void setCurrentLuck(double currentLuck) {
        this.currentLuck = currentLuck;
    }
}
