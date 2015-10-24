package com.truth.neogames.Abilities;

/**
 * Created by Adam on 10/22/2015.
 * Class Description:
 */
public abstract class Spell {
    protected String name;
    protected String desc;
    protected String school;
    protected int castTime;
    protected String range;
    protected int duration;
    protected String savingThrow;
    protected boolean resistible;
    protected String target;

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getSchool() {
        return this.school;
    }

    public int getCastTime() {
        return this.castTime;
    }

    public String getRange() {
        return this.range;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getSavingThrow() {
        return this.savingThrow;
    }

    public boolean isResistible() {
        return this.resistible;
    }

    public String getTarget() {
        return this.target;
    }
}
