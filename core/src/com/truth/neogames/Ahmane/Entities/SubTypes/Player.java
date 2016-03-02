package com.truth.neogames.Ahmane.Entities.SubTypes;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Adam.HoldingSystems.Inventory;
import com.truth.neogames.Adam.HoldingSystems.WornGear;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;
import com.truth.neogames.Ahmane.Entities.LivingEntity;
import com.truth.neogames.Ahmane.Professions.Profession;
import com.truth.neogames.Enums.RaceName;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a player.
 */
public class Player extends LivingEntity {

    /************* Constructors *************/

    public Player(String name, RaceName raceName, String sex, Profession profession, Sprite sprite) {
        super.setName(name);
        this.setRaceName(raceName);
        this.setSex(sex);
        this.setProfession(profession);
        this.setStats(new EntityStats(1));
        this.setWornGear(new WornGear());
        this.setInventory(new Inventory());
        setStats(new EntityStats(1));
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

}


