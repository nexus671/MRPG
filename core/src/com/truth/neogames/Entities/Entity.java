package com.truth.neogames.Entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Enums.Race;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines any entity in the game, including player, monster, or NPC.
 */
public class Entity {
    private String name;
    private Race race;
    private String sex;
    private Sprite sprite;
    private String description;
    private int xPos, yPos;

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
        return name;
    }

    public Race getRace() {
        return race;
    }

    public String getSex() {
        return sex;
    }

    public String getDescription() {
        return description;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public Sprite getSprite() {
        return sprite;
    }

    /************* Setters *************/

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    @Override
    public String toString() {
        return name;
    }
}
