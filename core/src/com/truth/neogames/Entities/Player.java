package com.truth.neogames.Entities;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.truth.neogames.HoldingSystems.Inventory;


/**
 * Created by Ahmane on 10/21/2015.
 */
public class Player {
    private String race;
    private String gender;
    private String name;
    private String profession;
    private Sprite sprite;
    private Inventory inventory;


    public Player(String name, String race, String gender, String profession, Sprite sprite) {
        this.name = name;
        this.race = race;
        this.gender = gender;
        this.profession = profession;
        this.sprite = sprite;
        inventory = new Inventory();
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
