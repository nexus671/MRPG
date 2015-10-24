package com.truth.neogames.Abilities;

import java.util.Random;

/**
 * Created by Ahmane on 10/23/2015.
 */
public class DisruptUndead extends Spell {
    private final String name = "Disrupt Undead";
    private final String desc = "You direct a ray of positive energy. You must make a ranged touch attack to hit, and if the ray hits an undead creature, it deals 1d6 points of damage to it.";
    private final String school = "Evocation";
    private final int castTime = 1;
    private final String range = "Close";
    private final int duration = 0;
    private final String savingThrow = "None";
    private final boolean resistible = true;
    private final String target = "Single";
    private Random random;

    public int damage() { //only to undead Dmg
        return random.nextInt(6) + 1;
    }

}
