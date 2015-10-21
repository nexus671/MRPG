package com.truth.neogames.Entities;

import com.badlogic.gdx.graphics.g2d.Sprite;


/**
 * Created by Ahmane on 10/21/2015.
 */
public class Player {
    private String race;
    private String gender;
    private String name;
    private String profession;
    private Sprite sprite;


    public Player(String name, String race, String gender, String profession, Sprite sprite) {
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.profession = profession;
        this.sprite = sprite;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }
}
