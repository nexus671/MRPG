package com.truth.neogames.Entities;


import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Enums.RaceName;
import com.truth.neogames.RPGObject;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines any entity in the game, including player, monster, or NPC.
 */
public abstract class Entity extends RPGObject {
    protected RaceName raceName;
    protected String sex;
    protected Sprite sprite;
    protected int xPos, yPos;

    /*************
     * Constructors
     *************/

    protected Entity(String name, RaceName raceName, String sex, Sprite sprite, String description, int xPos, int yPos) {
        this.name = name;
        this.raceName = raceName;
        this.sex = sex;
        this.sprite = sprite;
        this.description = description;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    protected Entity() {
    }

    /*************
     * Getters
     *************/

    @Override
    public String getName() {
        return name;
    }

    /**************
     * Setters
     *************/

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public RaceName getRaceName() {
        return raceName;
    }

    public void setRaceName(RaceName raceName) {
        this.raceName = raceName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setPos(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }


    @Override
    public String toString() {
        return "Entity{" +
                "raceName=" + raceName +
                ", sex='" + sex + '\'' +
                ", sprite=" + sprite +
                ", xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }
}
