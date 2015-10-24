package com.truth.neogames.Abilities;

import java.util.Random;

/**
 * Created by Ahmane on 10/23/2015.
 */
public class RayOfFrost extends Spell {
    private final String name = "Ray of Frost";
    private final String desc = "A ray of freezing air and ice projects from your pointing finger. You must succeed on a ranged touch attack with the ray to deal damage to a target. The ray deals 1-3 points of cold damage.";
    private final String school = "Evocation";
    private final int castTime = 1;
    private final String range = "Close";
    private final int duration = 0;
    private final String savingThrow = "None";
    private final boolean resistible = true;
    private final String target = "Single";
    private Random random;

    public int damage() { //cold Dmg
        return random.nextInt(3) + 1;
    }

}
