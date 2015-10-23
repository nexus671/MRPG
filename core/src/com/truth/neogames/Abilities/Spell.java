package com.truth.neogames.Abilities;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public abstract class Spell {
    protected String name;
    protected String desc;
    protected String school;
    protected int level;
    protected int castTime;
    protected String range;
    protected int duration;
    protected String savingThrow;
    protected boolean resistible;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getSchool() {
        return school;
    }

    public int getLevel() {
        return level;
    }

    public int getCastTime() {
        return castTime;
    }

    public String getRange() {
        return range;
    }

    public int getDuration() {
        return duration;
    }

    public String getSavingThrow() {
        return savingThrow;
    }

    public boolean isResistible() {
        return resistible;
    }
}
