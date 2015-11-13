package com.truth.neogames.Adam_the_cool_kid.Items.Consumables.SubTypes;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: A food consumable that heals the player.
 */
public class Food extends com.truth.neogames.Adam_the_cool_kid.Items.Consumables.Consumable {

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
