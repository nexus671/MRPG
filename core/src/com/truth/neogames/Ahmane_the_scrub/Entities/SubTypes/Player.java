package com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Adam.HoldingSystems.Inventory;
import com.truth.neogames.Adam.HoldingSystems.WornGear;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.PlayerStatsPackage.PlayerStats;
import com.truth.neogames.Ahmane_the_scrub.Entities.LivingEntity;
import com.truth.neogames.Ahmane_the_scrub.Professions.Profession;
import com.truth.neogames.Enums.Race;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a player.
 */
public class Player extends LivingEntity {


    private PlayerStats stats;

    /************* Constructors *************/

    public Player(String name, Race race, String sex, Profession profession, Sprite sprite) {
        this.setName(name);
        this.setRace(race);
        this.setSex(sex);
        this.profession = profession;
        stats = new PlayerStats(0);
        this.inventory = new Inventory();
        this.wornGear = new WornGear();
        stats = new PlayerStats();
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

    public PlayerStats getStats() {
        return this.stats;
    }

    /**************
     * Setters
     *************/

    public void setStats(PlayerStats stats) {
        this.stats = stats;
    }

    public Profession getProfession() {
        return this.profession;
    }

    public void setProfession(Profession profession) {
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


