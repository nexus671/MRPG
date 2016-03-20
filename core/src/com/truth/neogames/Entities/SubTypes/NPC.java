package com.truth.neogames.Entities.SubTypes;

import com.truth.neogames.Entities.Entity;
import com.truth.neogames.Shops.Shop;

import java.util.ArrayList;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a non-hostile character that can interact with the player.
 */
public class NPC extends Entity {
    private Shop shop;
    private ArrayList<String> dialogueOptions;

    /*************
     * Constructors
     *************/

    public NPC() {
        shop = new Shop();
        dialogueOptions = new ArrayList<String>();
    }

    /*************
     * Getters
     *************/

    public Shop getShop() {
        return shop;
    }

    /*************
     * Setters
     *************/

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public ArrayList<String> getDialogueOptions() {
        return dialogueOptions;
    }

    public void setDialogueOptions(ArrayList<String> dialogueOptions) {
        this.dialogueOptions = dialogueOptions;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "shop=" + shop +
                ", dialogueOptions=" + dialogueOptions +
                '}';
    }
}