package com.truth.neogames.Entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Enums.Race;

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

    /************* Getters *************/

    public String getName() {
        return this.name;
    }

    /*************
     * Setters
     *************/

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
