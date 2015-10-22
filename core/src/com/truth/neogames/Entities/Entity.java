package com.truth.neogames.Entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.StatsPackage.Stats;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines any entity in the game, including player, monster, or NPC.
 */
public class Entity {
    private String name;
    private Stats stats;
    private String race;
    private String sex;
    private Sprite sprite;

    public String getName() {
        return name;
    }

    public Stats getStats() {
        return stats;
    }

    public String getRace() {
        return race;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
