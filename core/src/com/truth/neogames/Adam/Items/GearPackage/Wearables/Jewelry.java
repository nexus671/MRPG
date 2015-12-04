package com.truth.neogames.Adam.Items.GearPackage.Wearables;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Enums.Affixes.JewelryGem;
import com.truth.neogames.Enums.Affixes.JewelryMetal;
import com.truth.neogames.Enums.EntityStatName;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: A piece of jewelry that provides a bonus to a certain stat.
 */
public class Jewelry extends Gear {
    private JewelryMetal metal;
    private JewelryGem gem;
    private EntityStatName statAffected;
    private double amount; // percent increase of the entity stat

    public Jewelry(JewelryMetal metal, JewelryGem gem, EntityStatName stat) {
        this.metal = metal;
        this.gem = gem;
        statAffected = stat;
        amount = metal.getPowerModifier() * gem.getPowerModifier(); //TODO: needs testing if this is op
    }

    public JewelryMetal getMetal() {
        return metal;
    }

    public void setMetal(JewelryMetal metal) {
        this.metal = metal;
    }

    public JewelryGem getGem() {
        return gem;
    }

    public void setGem(JewelryGem gem) {
        this.gem = gem;
    }

    public EntityStatName getStatAffected() {
        return statAffected;
    }

    public void setStatAffected(EntityStatName statAffected) {
        this.statAffected = statAffected;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
