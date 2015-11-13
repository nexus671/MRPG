package com.truth.neogames.Ahmane_the_scrub.Entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.Race;
import com.truth.neogames.Ahmane_the_scrub.EnvironmentPackage.BattleGrid;
import com.truth.neogames.Adam_the_cool_kid.Items.Consumables.SubTypes.Food;
import com.truth.neogames.Adam_the_cool_kid.Items.Consumables.SubTypes.Potion;
import com.truth.neogames.Adam_the_cool_kid.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.Adam_the_cool_kid.StatsPackage.EntityStatsPackage.EntityStats;

import java.util.HashSet;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines any entity in the game, including player, monster, or NPC.
 */
public class Entity {
    protected String name;
    protected Race race;
    protected String sex;
    protected Sprite sprite;
    protected String description;
    protected EntityStats stats;
    protected int xPos, yPos;

    /************* Constructors *************/

    public Entity(String name, Race race, String sex, Sprite sprite, String description, int xPos, int yPos) {
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.sprite = sprite;
        this.description = description;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Entity() {
    }

    /************* Specific Methods *************/

    /**
     * Entity consumes a food object, healing the entity up to it's normal health.
     *
     * @param f The food object that is consumed.
     */
    public void consume(Food f) {
        double amount = f.getHealAmount();
        double currHealth = stats.getHealth().getCurrent();
        double resultHealth = amount + currHealth;
        if (resultHealth >= stats.getHealth().getMax()) {
            stats.getHealth().setCurrent(stats.getHealth().getMax());
        } else {
            stats.getHealth().setCurrent(currHealth + amount);
        }
    }

    /**
     * Boosts all the stats specified by the potion.
     *
     * @param p The potion to be consumed.
     */
    public void consume(Potion p) {
        HashSet<EntityStat> stats = p.getStats();
        for (EntityStat stat : stats) {
            EntityStatName name = stat.getName();
            double percentValue = (1 + p.getPercentAmount()) * this.stats.get(name).getMax();
            this.stats.setStat(name, percentValue);
            this.stats.setStat(name, this.stats.get(name).getMax() + p.getFlatAmount());
        }
    }

    public boolean moveLeft(BattleGrid grid) {
        if (grid.isSpaceEmpty(xPos - 1, yPos)) {
            grid.moveEntity(this, -1, 0);
            return true;
        }
        return false;
    }

    public boolean moveRight(BattleGrid grid) {
        if (grid.isSpaceEmpty(xPos + 1, yPos)) {
            grid.moveEntity(this, 1, 0);
            return true;
        }
        return false;
    }

    public boolean moveForward(BattleGrid grid) {
        if (grid.isSpaceEmpty(xPos, yPos + 1)) {
            grid.moveEntity(this, 0, 1);
            return true;
        }
        return false;
    }

    public boolean moveDown(BattleGrid grid) {
        if (grid.isSpaceEmpty(xPos, yPos - 1)) {
            grid.moveEntity(this, 0, -1);
            return true;
        }
        return false;
    }


    /************* Getters *************/

    public String getName() {
        return this.name;
    }

    /************** Setters *************/

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return this.race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getxPos() {
        return this.xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return this.yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public Sprite getSprite() {
        return this.sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
