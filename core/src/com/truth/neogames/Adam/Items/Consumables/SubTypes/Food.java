package com.truth.neogames.Adam.Items.Consumables.SubTypes;

import com.truth.neogames.Adam.Items.Consumables.Consumable;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A food consumable that heals the player.
 */
public class Food extends Consumable {

    private double healAmount;

    /*************
     * Constructors
     *************/

    public Food(String name, String description, int healAmount) {
        this.healAmount = (double) healAmount;
        super.name = name;
        assignDescription();
    }

    public double getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(double healAmount) {
        this.healAmount = healAmount;
    }

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
