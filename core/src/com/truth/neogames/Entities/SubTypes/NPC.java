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
     */
    public NPC() {
        shop = new Shop();
        dialogueOptions = new ArrayList<String>();
    }

    /*************
     * Getters
     *
     * @return the shop
     */
    public Shop getShop() {
        return shop;
    }

    /*************
     * Setters
     *
     * @param shop the shop
     */
    public void setShop(Shop shop) {
        this.shop = shop;
    }

    /**
     * Gets dialogue options.
     *
     * @return the dialogue options
     */
    public ArrayList<String> getDialogueOptions() {
        return dialogueOptions;
    }

    /**
     * Sets dialogue options.
     *
     * @param dialogueOptions the dialogue options
     */
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
