package com.truth.neogames.Items.GearPackage;

import com.truth.neogames.Effects.Buff;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.Items.Item;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Describes any item that can be equipped in the worn gear (weapon, armor, or jewelry).
 */
public abstract class Gear extends Item {
    protected static final int MAX_LEVEL = 21;
    protected WornSlot slot;
    protected int level;
    protected Collection<Buff> bonuses = new ArrayList<Buff>();

    public static int getMAXLEVEL() {
        return MAX_LEVEL;
    }

    public void addBuffs(Iterable<EntityStatName> stats, double amount) {
        for (EntityStatName statName : stats) {
            Buff buff = new Buff(amount, statName, false);
            addBonus(buff);
        }
    }

    public void addBonus(Buff e) {
        bonuses.add(e);
    }

    public void removeBonus(Buff e) {
        bonuses.remove(e);
    }

    public Collection<Buff> getBonusesStat(EntityStatName name) {
        Collection<Buff> b = new ArrayList<Buff>();

        for (Buff buffs : bonuses) {
            if (buffs.getStatName() == name) {
                b.add(buffs);
            }
        }
        return b;
    }

    public void setBonuses(Collection<Buff> bonuses) {
        this.bonuses = bonuses;
    }

    public WornSlot getSlot() {
        return slot;
    }

    public void setSlot(WornSlot slot) {
        this.slot = slot;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Gear)) {
            return false;
        }
        Gear g = (Gear) obj;
        return (super.equals(obj) && (g.level == level));
    }

    @Override
    public String toString() {
        return "Gear{" +
                "slot=" + slot +
                ", level=" + level +
                ", bonuses=" + bonuses +
                '}';
    }
}

