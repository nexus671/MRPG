package com.truth.neogames.Adam.Items.GearPackage.Wearables;

import com.truth.neogames.Adam.Items.GearPackage.Gear;
import com.truth.neogames.Ahmane.Effects.Buff;
import com.truth.neogames.Enums.Affixes.JewelryGem;
import com.truth.neogames.Enums.Affixes.JewelryMetal;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.WornSlot;

import java.util.ArrayList;

/**
 * Created by Adam on 12/4/2015.
 * Class Description: A piece of jewelry that provides a bonus to a certain stat.
 */
public class Jewelry extends Gear {
    private JewelryMetal metal;
    private JewelryGem gem;
    private ArrayList<EntityStatName> statsAffected;
    private double amount; // percent increase of the entity stat

    public Jewelry(JewelryMetal metal, JewelryGem gem, ArrayList<EntityStatName> stats, boolean isRing) {
        this.metal = metal;
        this.gem = gem;
        statsAffected = stats;
        amount = metal.getPowerModifier() * gem.getPowerModifier();
        if (isRing) {
            slot = WornSlot.RING;
        } else {
            slot = WornSlot.NECK;
        }
        assignName();
        Buff buff = new Buff(amount, statAffected, false);
        this.addBonus(buff);
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

    public ArrayList<EntityStatName> getStatsAffected() {
        return statsAffected;
    }

    public void setStatsAffected(ArrayList<EntityStatName> statsAffected) {
        this.statsAffected = statsAffected;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void assignName() {
        String str = metal + " ";
        str += gem + " ";
        if (slot == WornSlot.RING) {
            str += "Ring";
        } else {
            str += "Necklace";
        }
        name = str;
    }
}
