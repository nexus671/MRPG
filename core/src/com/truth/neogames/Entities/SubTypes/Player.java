package com.truth.neogames.Entities.SubTypes;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Entities.Entity;
import com.truth.neogames.Enums.Race;
import com.truth.neogames.HoldingSystems.Inventory;
import com.truth.neogames.HoldingSystems.WornGear;
import com.truth.neogames.Items.GearPackage.Gear;
import com.truth.neogames.Professions.Profession;
import com.truth.neogames.StatsPackage.EntityStatsPackage.PlayerStatsPackage.PlayerStats;
import com.truth.neogames.StatsPackage.Stats;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a player.
 */
public class Player extends Entity {
    private Profession profession;
    private WornGear wornGear;
    private Inventory inventory;
    private PlayerStats stats;

    /************* Constructors *************/

    public Player(String name, Race race, String sex, Profession profession, Sprite sprite, Stats stats) {
        this.setName(name);
        this.setRace(race);
        this.setSex(sex);
        this.profession = profession;
        stats = new PlayerStats(0);
        this.inventory = new Inventory();
        this.wornGear = new WornGear();
    }

    /************* Specific Methods *************/

    public int equip(Gear g) {
        if(g.getStats().getLevel() > stats.getLevel()) {
            return -1;
        }
        return 0; /**Incomplete**/
    }

    /************* Getters *************/

    public PlayerStats getStats() {
        return this.stats;
    }

    public Profession getProfession() {
        return this.profession;
    }

    public WornGear getWornGear() {
        return this.wornGear;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    /************** Setters *************/

    public void setStats(PlayerStats stats) {
        this.stats = stats;
    }

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


