package com.truth.neogames.Entities.SubTypes;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Enums.RaceName;
import com.truth.neogames.Enums.Sex;
import com.truth.neogames.HoldingSystems.Inventory;
import com.truth.neogames.HoldingSystems.WornGear;
import com.truth.neogames.Professions.Profession;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStats;


/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a player.
 */
public class Player extends LivingEntity {

    /*************
     * Constructors
     *
     * @param name       the name
     * @param raceName   the race name
     * @param sex        the sex
     * @param profession the profession
     * @param sprite     the sprite
     */
    public Player(String name, RaceName raceName, Sex sex, Profession profession, Sprite sprite) {
        setName(name);
        setRaceName(raceName);
        setSex(sex);
        setProfession(profession);
        setStats(new EntityStats(1));
        setWornGear(new WornGear());
        setInventory(new Inventory());
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


