package com.truth.neogames.Adam.Items.GearPackage;

import com.truth.neogames.Adam.Items.Item;
import com.truth.neogames.Ahmane.Effects.Buff;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.WornSlot;

import java.util.ArrayList;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Describes any item that can be equipped in the worn gear (weapon, armor, or jewelry).
 */
public abstract class Gear extends Item {
    protected static final int MAXLEVEL = 21;
    protected WornSlot slot;
    protected int level;
    protected ArrayList<Buff> bonuses = new ArrayList<Buff>();
    protected EntityStatName statAffected;

    public static int getMAXLEVEL() {
        return MAXLEVEL;
    }

    public EntityStatName getStatAffected() {
        return statAffected;
    }

    public void addBonus(Buff e) {
        bonuses.add(e);
    }

    public void removeBonus(Buff e) {
        bonuses.remove(e);
    }

    public ArrayList<Buff> getBonuses() {
        return bonuses;
    }

    public void setBonuses(ArrayList<Buff> bonuses) {
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
        if (obj == null) return false;
        else if (!(obj instanceof Gear)) return false;
        Gear g = (Gear) obj;
        return (super.equals(obj) && g.getLevel() == level);
    }
}

