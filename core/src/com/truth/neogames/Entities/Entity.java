package com.truth.neogames.Entities;


import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.Enums.RaceName;
import com.truth.neogames.RPGObject;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines any entity in the game, including player, monster, or NPC.
 */
public abstract class Entity extends RPGObject {
    /**
     * The Race name.
     */
    protected RaceName raceName;
    /**
     * The Sex.
     */
    protected String sex;
    /**
     * The Sprite.
     */
    protected Sprite sprite;
    /**
     * The X pos.
     */
    protected int xPos, /**
     * The Y pos.
     */
    yPos;

    /*************
     * Constructors
     *
     * @param name        the name
     * @param raceName    the race name
     * @param sex         the sex
     * @param sprite      the sprite
     * @param description the description
     * @param xPos        the x pos
     * @param yPos        the y pos
     */
    protected Entity(String name, RaceName raceName, String sex, Sprite sprite, String description, int xPos, int yPos) {
        this.name = name;
        this.raceName = raceName;
        this.sex = sex;
        this.sprite = sprite;
        this.description = description;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * Instantiates a new Entity.
     */
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

    /**
     * Gets race name.
     *
     * @return the race name
     */
    public RaceName getRaceName() {
        return raceName;
    }

    /**
     * Sets race name.
     *
     * @param raceName the race name
     */
    public void setRaceName(RaceName raceName) {
        this.raceName = raceName;
    }

    /**
     * Gets sex.
     *
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets sex.
     *
     * @param sex the sex
     */
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

    /**
     * Gets pos.
     *
     * @return the pos
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * Sets pos.
     *
     * @param xPos the x pos
     */
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * Gets pos.
     *
     * @return the pos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * Sets pos.
     *
     * @param yPos the y pos
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * Sets pos.
     *
     * @param xPos the x pos
     * @param yPos the y pos
     */
    public void setPos(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    /**
     * Gets sprite.
     *
     * @return the sprite
     */
    public Sprite getSprite() {
        return sprite;
    }

    /**
     * Sets sprite.
     *
     * @param sprite the sprite
     */
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
