package com.truth.neogames.Ahmane.Entities.SubTypes;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Adam.HoldingSystems.Inventory;
import com.truth.neogames.Adam.HoldingSystems.WornGear;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Ahmane.Professions.Profession;
import com.truth.neogames.Enums.Race;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a player.
 */
public class Player extends LivingEntity {

    private EntityStats stats;

    /************* Constructors *************/

    public Player(String name, Race race, String sex, Profession profession, Sprite sprite) {
        this.setName(name);
        this.setRace(race);
        this.setSex(sex);
        this.setProfession(profession);
    }


    @Override
    public String toString() {
        return "Player{" +
                ", profession=" + profession +
                ", wornGear=" + wornGear +
                ", inventory=" + inventory +
                ", stats=" + stats +
                '}';
    }

    /************* Getters *************/

    public EntityStats getStats() {
        return this.stats;
    }

    /**************
     * Setters
     *************/

    public void setStats(EntityStats stats) {
        this.stats = stats;
    }

    public com.truth.neogames.Ahmane.Professions.Profession getProfession() {
        return this.profession;
    }

    public void setProfession(com.truth.neogames.Ahmane.Professions.Profession profession) {
        this.profession = profession;
    }

    public WornGear getWornGear() {
        return this.wornGear;
    }

    public void setWornGear(WornGear wornGear) {
        this.wornGear = wornGear;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


}


