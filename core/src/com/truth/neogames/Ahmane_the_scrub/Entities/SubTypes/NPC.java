package com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes;

import com.truth.neogames.Ahmane_the_scrub.Entities.Entity;
import com.truth.neogames.Adam_the_cool_kid.Shops.Shop;

import java.util.ArrayList;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Defines a non-hostile character that can interact with the player.
 */
public class NPC extends Entity {
    private Shop shop;
    private ArrayList<String> dialogueOptions;

    /************* Constructors *************/

    public NPC() {
        shop = new Shop();
        dialogueOptions = new ArrayList<String>();
    }

    /************* Getters *************/

    public Shop getShop() {
        return shop;
    }

    public ArrayList<String> getDialogueOptions() {
        return dialogueOptions;
    }

    /************* Setters *************/

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setDialogueOptions(ArrayList<String> dialogueOptions) {
        this.dialogueOptions = dialogueOptions;
    }
}
