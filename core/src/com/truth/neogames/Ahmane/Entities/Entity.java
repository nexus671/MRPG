package com.truth.neogames.Ahmane.Entities;


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

    /************* Constructors *************/

    public Entity(String name, RaceName raceName, String sex, Sprite sprite, String description, int xPos, int yPos) {
        this.name = name;
        this.raceName = raceName;
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

    /************** Setters *************/

    public void setName(String name) {
        this.name = name;
    }

    public RaceName getRaceName() {
        return this.raceName;
    }

    public void setRaceName(RaceName raceName) {
        this.raceName = raceName;
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

    public void setPos(int xPos, int yPos) {
        this.xPos = xPos;
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
