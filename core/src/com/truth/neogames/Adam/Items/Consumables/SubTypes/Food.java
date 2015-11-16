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

    public Food() {
    }

    public Food(int healAmount) {
        this.healAmount = healAmount;
    }

    /*************
     * Getters
     *************/

    public double getHealAmount() {
        return healAmount;
    }

    /*************
     * Setters
     *************/

    public void setHealAmount(double healAmount) {
        this.healAmount = healAmount;
    }
}
