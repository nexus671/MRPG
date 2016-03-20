package com.truth.neogames.Items.GearPackage.Wearables;

import com.truth.neogames.Effects.Buff;
import com.truth.neogames.Enums.Affixes.JewelryGem;
import com.truth.neogames.Enums.Affixes.JewelryMetal;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Items.GearPackage.Gear;

import java.util.List;

/**
 * Created by Adam on 1(MAX_STATS - 1)/4/(MAX_STATS - 1)015.
 * Class Description: A piece of jewelry that provides a bonus to a certain stat.
 */
public class Jewelry extends Gear {
    private static final int MAX_STATS = 3; //the max number of stats that a jewelry item can buff
    private JewelryMetal metal;
    private JewelryGem gem;
    private List<EntityStatName> statsAffected;
    private double amount; // percent increase of the entity stat

    public Jewelry(JewelryMetal metal, JewelryGem gem, List<EntityStatName> stats, boolean isRing) {
        this.metal = metal;
        this.gem = gem;
        statsAffected = stats;
        amount = metal.getPowerModifier() * gem.getPowerModifier();
        slot = isRing ? WornSlot.RING : WornSlot.NECK;
        for (EntityStatName statAffected : stats) {
            Buff buff = new Buff(amount, statAffected, false);
            addBonus(buff);
        }
        assignName();
        assignDescription();

    }

    public static int getMaxStats() {
        return MAX_STATS;
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

    public Iterable<EntityStatName> getStatsAffected() {
        return statsAffected;
    }

    public void setStatsAffected(List<EntityStatName> statsAffected) {
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
        str += (slot == WornSlot.RING) ? "Ring" : "Necklace";
        name = str;
    }

    public void assignDescription() {
        description = name + '\n';
        description += "Increases ";
        for (int i = 0; i < statsAffected.size(); i++) {
            description += statsAffected.get(i);
            if ((statsAffected.size() == MAX_STATS) && (i != (statsAffected.size() - 1))) {
                description += ", ";
            }
            if (statsAffected.size() != MAX_STATS) {
                description += " ";
            }
            if (i == (statsAffected.size() - (MAX_STATS - 1))) {
                description += "and ";
            }
        }
    }

    @Override
    public String toString() {
        return "Jewelry{" +
                "metal=" + metal +
                ", gem=" + gem +
                ", statsAffected=" + statsAffected +
                ", amount=" + amount +
                '}';
    }
}
