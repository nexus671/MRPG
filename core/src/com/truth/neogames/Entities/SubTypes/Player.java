package com.truth.neogames.Entities.SubTypes;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Entities.Entity;
import com.truth.neogames.HoldingSystems.Inventory;
import com.truth.neogames.HoldingSystems.WornGear;
import com.truth.neogames.StatsPackage.EntityStatsPackage.PlayerStatsPackage.Professions.Profession;
import com.truth.neogames.StatsPackage.Stats;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a player.
 */
public class Player extends Entity{
    private Profession profession;
    private WornGear wornGear;
    private Inventory inventory;

    /************* Constructors *************/

    public Player(String name, String race, String sex, Profession profession, Sprite sprite, Stats stats) {
        super.setName(name);
        super.setRace(race);
        super.setSex(sex);
        super.setStats(stats);
        this.profession = profession;
        inventory = new Inventory();
        wornGear = new WornGear();
    }

    /************* Getters *************/

    public Profession getProfession() {
        return profession;
    }

    public WornGear getWornGear() {
        return wornGear;
    }

    public Inventory getInventory() {
        return inventory;
    }

    /************* Setters *************/

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public void setWornGear(WornGear wornGear) {
        this.wornGear = wornGear;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
