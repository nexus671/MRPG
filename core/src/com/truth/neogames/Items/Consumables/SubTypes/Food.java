package com.truth.neogames.Items.Consumables.SubTypes;

import com.truth.neogames.Items.Consumables.Consumable;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A food consumable that heals the player.
 */
public class Food extends Consumable {

    private double healAmount;

    /*************
     * Constructors
     *
     * @param name        the name
     * @param description the description
     * @param healAmount  the heal amount
     */
    public Food(String name, String description, int healAmount) {
        this.healAmount = (double) healAmount;
        super.name = name;
        assignDescription();
    }

    /**
     * Gets heal amount.
     *
     * @return the heal amount
     */
    public double getHealAmount() {
        return healAmount;
    }

    /**
     * Sets heal amount.
     *
     * @param healAmount the heal amount
     */
    public void setHealAmount(double healAmount) {
        this.healAmount = healAmount;
    }

    /**
     * Assign description.
     */
    public void assignDescription() {
        description = "Consume to restore up to " + healAmount + " health.";
    }

    @Override
    public String toString() {
        return "Food{" +
                "healAmount=" + healAmount +
                '}';
    }
}
