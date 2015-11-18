package com.truth.neogames.Adam.StatsPackage;

/**
 * Created by Adam on 11/16/2015.
 * Class Description: Provides description for a gear prefix.
 */
public class Affix {
    protected String description;
    protected double percent;
    protected Stat affected;

    public Affix() {
        description = "";
        percent = 0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public Stat getAffected() {
        return affected;
    }

    public void setAffected(Stat affected) {
        this.affected = affected;
    }
}
